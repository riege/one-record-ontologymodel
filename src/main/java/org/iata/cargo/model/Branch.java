
package org.iata.cargo.model;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

import org.iata.cargo.Vocabulary;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import cz.cvut.kbss.jopa.model.annotations.Id;
import cz.cvut.kbss.jopa.model.annotations.OWLAnnotationProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLObjectProperty;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraint;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraints;
import cz.cvut.kbss.jopa.model.annotations.Properties;
import cz.cvut.kbss.jopa.model.annotations.Types;
import cz.cvut.kbss.jopa.vocabulary.DC;
import cz.cvut.kbss.jopa.vocabulary.RDFS;
import io.swagger.annotations.ApiModelProperty;


/**
 * Company branches
 * 
 * This class was generated by OWL2Java 0.17.2
 * 
 */
@OWLClass(iri = Branch.s_c_Branch)
@Deprecated
public class Branch
    implements Serializable
{
    public final static String s_c_Branch = "https://onerecord.iata.org/Branch";
    public final static String s_p_contactPerson = "https://onerecord.iata.org/CompanyBranch#contactPerson";

    @Id(generated = true)
    @ApiModelProperty(readOnly = true)
    protected String id;
    @JsonIgnore
    @OWLAnnotationProperty(iri = RDFS.LABEL)
    protected String name;
    @JsonIgnore
    @OWLAnnotationProperty(iri = cz.cvut.kbss.jopa.vocabulary.DC.Elements.DESCRIPTION)
    protected String description;
    @Types
    @JsonProperty("@type")
    @ApiModelProperty(allowableValues = Branch.s_c_Branch)
    protected Set<String> types;
    @Properties
    @JsonIgnore
    protected Map<String, Set<String>> properties;

    @JsonProperty("language")
    @OWLAnnotationProperty(iri = DC.Terms.LANGUAGE)
    protected String language;

    /**
     * Refers to the mother company of the branch
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_company)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_company)
    protected Company company;
    /**
     * Contact person details
     * 
     */
    @OWLObjectProperty(iri = Branch.s_p_contactPerson)
    @JsonProperty(Branch.s_p_contactPerson)
    protected Set<Person> contactPerson;
    /**
     * Location and address details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_location)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_location)
    protected Location location;
    /**
     * Other identifiers (e.g. LEI (Legal Entity Identifier), TIN (Trader Identification Number), PIMA address, Account number, VAT/Tax id, Legal Registration id, DUNS number, etc)
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_otherIdentifier)
    @JsonProperty(Vocabulary.s_p_otherIdentifier)
    protected Set<OtherIdentifier> otherIdentifier;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setTypes(Set<String> types) {
        this.types = types;
    }

    public Set<String> getTypes() {
        return types;
    }

    public void setProperties(Map<String, Set<String>> properties) {
        this.properties = properties;
    }

    public Map<String, Set<String>> getProperties() {
        return properties;
    }

    @Override
    public String toString() {
        return ((((("Branch {"+ name)+"<")+ id)+">")+"}");
    }

    @Deprecated
    public void setCompany(Company company) {
        this.company = company;
    }

    @Deprecated
    public Company getCompany() {
        return company;
    }

    @Deprecated
    public void setContactPerson(Set<Person> contactPerson) {
        this.contactPerson = contactPerson;
    }

    @Deprecated
    public Set<Person> getContactPerson() {
        return contactPerson;
    }

    @Deprecated
    public void setLocation(Location location) {
        this.location = location;
    }

    @Deprecated
    public Location getLocation() {
        return location;
    }

    @Deprecated
    public void setOtherIdentifier(Set<OtherIdentifier> otherIdentifier) {
        this.otherIdentifier = otherIdentifier;
    }

    @Deprecated
    public Set<OtherIdentifier> getOtherIdentifier() {
        return otherIdentifier;
    }

    @Deprecated
    public String getLanguage() {
        return language;
    }

    @Deprecated
    public void setLanguage(String language) {
        this.language = language;
    }

}
