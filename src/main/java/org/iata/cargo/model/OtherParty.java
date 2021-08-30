
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
 * Company details
 * 
 * This class was generated by OWL2Java 0.16.4
 * 
 */
@OWLClass(iri = Vocabulary.s_c_OtherParty)
@Deprecated
public class OtherParty
    implements Serializable
{

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
    protected Set<String> types;
    @Properties
    @JsonIgnore
    protected Map<String, Set<String>> properties;

    @JsonProperty("language")
    @OWLAnnotationProperty(iri = DC.Terms.LANGUAGE)
    protected String language;

    /**
     * Company details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_companyDetails)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_companyDetails)
    protected Company companyDetails;
    /**
     * Specifies the code of an additional party if required. Standard codes from UN/EDIFACT 3035 Party function code qualifier can be used.
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_partyTypeCode)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", min = 1, max = -1),
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_partyTypeCode)
    protected String partyTypeCode;
    /**
     * Role of other party - e.g. Notify party, Nominated agent, Customs broker, Manufacturer, Importer, Payer, Payee, ShipTo, ShipFrom, BillTo, BillFrom, RemitTo, RemitFrom 
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_roleName)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_roleName)
    protected String roleName;

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
        return ((((("OtherParty {"+ name)+"<")+ id)+">")+"}");
    }

    public void setCompanyDetails(Company companyDetails) {
        this.companyDetails = companyDetails;
    }

    public Company getCompanyDetails() {
        return companyDetails;
    }

    public void setPartyTypeCode(String partyTypeCode) {
        this.partyTypeCode = partyTypeCode;
    }

    public String getPartyTypeCode() {
        return partyTypeCode;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

}
