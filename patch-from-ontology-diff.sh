#!/bin/bash
#
# optional parameter:
# 1. downloadable URL of old ontology
# 2. downloadable URL of new ontology

TEMP=/var/tmp
rm -rf $TEMP/patchontololy 2>/dev/null
rm -rf $TEMP/patchontololy # sometimes it is better executed twice..
mkdir  $TEMP/patchontololy
cd     $TEMP/patchontololy

# "one" ontology here means the endorsed June-2021 version
# [ "$1" != "" ] && OLD_ONTOLOGY_URL=$1 || OLD_ONTOLOGY_URL=https://raw.githubusercontent.com/IATA-Cargo/ONE-Record/master/June-2021-standard-COTB-endorsed/Data-Model/IATA-1R-DM-Ontology-vCOTB-Jun2021.ttl
[ "$1" != "" ] && OLD_ONTOLOGY_URL=$1 || OLD_ONTOLOGY_URL=https://raw.githubusercontent.com/IATA-Cargo/ONE-Record/d58ccaf1d22ac6df5145af67979dc1bb31ee6666/working_draft/ontology/IATA-1R-DM-Ontology.ttl
# "new" ontology here means the working_draft version
[ "$2" != "" ] && NEW_ONTOLOGY_URL=$2 || NEW_ONTOLOGY_URL=https://raw.githubusercontent.com/IATA-Cargo/ONE-Record/master/working_draft/ontology/IATA-1R-DM-Ontology.ttl

echo "Generating a patch from (old)"
echo $OLD_ONTOLOGY_URL
echo "to (new)"
echo $NEW_ONTOLOGY_URL
echo ""
echo "(Optional parameters for raw URLs: 1st=old, 2nd=new)"
echo ""
echo -n "Press ENTER to start "
read DUMMY

git clone https://github.com/IATA-Cargo/one-record-server-java
cd one-record-server-java
mvn -Djdk.tls.client.protocols=TLSv1.2 clean install
# generate the "old" domain classes from the "old" ontology
curl -o dummy.ttl $OLD_ONTOLOGY_URL
# fix the ttl file because javadoc does not like the '&' character
cat dummy.ttl | sed -e "s/Billing&Settlement/Billing & Settlement/g" | sed -e "s/&/and/g" > iata.ttl
rm -rf src/main/generated-sources/org/iata/cargo
mvn package -Dbuild=cargo
echo "Note: you might see some 'test' errors, that's not nice but expected. Don't worry."
cp -r src/main/generated-sources/org/iata/cargo ../old

# generate the "new" domain classes from the "new" ontology
curl -o dummy.ttl $NEW_ONTOLOGY_URL
# fix the ttl file because javadoc does not like the '&' character
cat dummy.ttl | sed -e "s/Billing&Settlement/Billing & Settlement/g" | sed -e "s/&/and/g" > iata.ttl
rm -rf src/main/generated-sources/org/iata/cargo
mvn package -Dbuild=cargo
echo "Note: you might see some 'test' errors, that's not nice but expected. Don't worry."
cp -r src/main/generated-sources/org/iata/cargo ../new

cd $TEMP/patchontololy
echo "Generating 'ontology.patch' now.."
diff -NarwU 3 old new > ontology.patch

cat << EOT
Generated file $TEMP/patchontololy/ontology.patch
Two options to apply the patch:

(A) Use an IDE, e.g. IntelliJ (recommended)
  1. switch to one-record-ontologymodel git directory if not already there
  2. cp $TEMP/patchontololy/ontology.patch src/main/java/org/iata/cargo/
  3. apply patch with IDE
  
(B) Use patch command which has difficulties to determine the context:
  1. switch to one-record-ontologymodel git directory if not already there
  2. cd src/main/java/org/iata/cargo
  3. patch --dry-run -p1 <$TEMP/patchontololy/ontology.patch
  4. patch -p1 <$TEMP/patchontololy/ontology.patch

You may want to validated your changes afterwards with

    diff -NarwU 3 /var/tmp/patchontololy/new src/main/java/org/iata/cargo

The following should show alternating two different annotations:

    grep -r Vocabulary.s_ src/main/java/org/iata/cargo | grep java: | grep -v OWLClass | grep -v ApiModelProperty | grep -v Vocabulary.s_c_Thing | less

Countings:
    grep -r "^+ *@OWLObjectProperty" src/main/java/org/iata/cargo | wc -l
    grep -r "^+ *@OWLDataProperty"   src/main/java/org/iata/cargo | wc -l
    grep -r "^+ *@JsonProperty"      src/main/java/org/iata/cargo | wc -l

NOTE: Some additional annotations must be added to new fields manually, e.g. @JsonProperty(..)
      For every changed "@OWLObjectProperty" and every changd "@OWLDataProperty" in the patch,
      there must be a matching changed "@JsonProperty"!
EOT
O=$(git diff --no-index old new | grep "^+ *@OWLObjectProperty" | wc -l)
D=$(git diff --no-index old new | grep "^+ *@OWLDataProperty"   | wc -l)
J=$(git diff --no-index old new | grep "^+ *@JsonProperty"      | wc -l)
echo "We have $(echo $O + $D | bc) @OWL.. entries but only $J @JsonProperty."
echo "You better add $(echo $O + $D - $J | bc) @JsonProperty annotations."
