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
[ "$1" != "" ] && OLD_ONTOLOGY_URL=$1 || OLD_ONTOLOGY_URL=https://raw.githubusercontent.com/IATA-Cargo/ONE-Record/master/June-2021-standard-COTB-endorsed/Data-Model/IATA-1R-DM-Ontology-vCOTB-Jun2021.ttl
# "new" ontology here means the working_draft version
[ "$2" != "" ] && NEW_ONTOLOGY_URL=$2 || NEW_ONTOLOGY_URL=https://raw.githubusercontent.com/IATA-Cargo/ONE-Record/master/working_draft/ontology/IATA-1R-DM-Ontology.ttl

git clone https://github.com/IATA-Cargo/one-record-server-java
cd one-record-server-java
mkdir .mvn
echo '<settings xmlns="http://maven.apache.org/SETTINGS/1.2.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.2.0 http://maven.apache.org/xsd/settings-1.2.0.xsd"><mirrors><mirror><id>maven-default-http-blocker</id><mirrorOf>dummy</mirrorOf><name>Dummy mirror to override default blocking mirror that blocks http</name><url>http://0.0.0.0/</url></mirror></mirrors></settings>' > .mvn/local-settings.xml
echo '--settings ./.mvn/local-settings.xml' > .mvn/maven.config
mvn -Djdk.tls.client.protocols=TLSv1.2 clean install
# generate the "old" domain classes from the "old" ontology
curl -o dummy.ttl $OLD_ONTOLOGY_URL
# fix the ttl file because javadoc does not like the '&' character
cat dummy.ttl | sed -e "s/Billing&Settlement/Billing & Settlement/g" | sed -e "s/&/and/g" > iata.ttl
rm -rf src/main/generated-sources/org/iata/cargo
mvn package -Dbuild=cargo
cp -r src/main/generated-sources/org/iata/cargo ../old

# generate the "new" domain classes from the "new" ontology
curl -o dummy.ttl $NEW_ONTOLOGY_URL
# fix the ttl file because javadoc does not like the '&' character
cat dummy.ttl | sed -e "s/Billing&Settlement/Billing & Settlement/g" | sed -e "s/&/and/g" > iata.ttl
rm -rf src/main/generated-sources/org/iata/cargo
mvn package -Dbuild=cargo
cp -r src/main/generated-sources/org/iata/cargo ../new

cd $TEMP/patchontololy
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

EOT
