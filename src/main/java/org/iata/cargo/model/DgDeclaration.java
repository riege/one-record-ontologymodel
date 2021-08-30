
package org.iata.cargo.model;

import java.io.Serializable;
import java.util.Set;

import org.iata.cargo.Vocabulary;

import com.fasterxml.jackson.annotation.JsonProperty;

import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraint;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraints;
import cz.cvut.kbss.jopa.model.annotations.Types;
import io.swagger.annotations.ApiModelProperty;


/**
 * Dangerous goods declaration
 * 
 * This class was generated by OWL2Java 0.16.4
 * 
 */
@OWLClass(iri = Vocabulary.s_c_DgDeclaration)
public class DgDeclaration
    extends LogisticsObject
    implements Serializable
{

    @Types
    @JsonProperty("@type")
    @ApiModelProperty(allowableValues = Vocabulary.s_c_DgDeclaration)
    protected Set<String> types;

    /**
     * Contains the Special Handling Code related to the prescribed limitation. Hardcoded to PASSENGER AND CARGO AIRCRAFT or CARGO AIRCRAFT ONLY. This field is mandatory for air (Air) 
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_aircraftLimitationInformation)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", min = 1, max = -1),
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_aircraftLimitationInformation)
    protected String aircraftLimitationInformation;
    /**
     * Contains the warning message complying with the regulations text note. This field is mandatory for air (Air) 
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_complianceDeclarationText)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1),
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", min = 1, max = -1)
    })
    @JsonProperty(Vocabulary.s_p_complianceDeclarationText)
    protected String complianceDeclarationText;
    /**
     * Indicates an exclusive use shipment
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_exclusiveUseIndicator)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#boolean", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_exclusiveUseIndicator)
    protected Boolean exclusiveUseIndicator;
    /**
     * Free text. This may include items such as Control temperature for substances stabilized by temperature control, name and telephone number of a responsible person for infectious substances. 
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_handlingInformation)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_handlingInformation)
    protected String handlingInformation;
    /**
     * Contains the shipper's declaration to comply with the regulations text note. Free text . This field is mandatory for air (Air)
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_shipperDeclarationText)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1),
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", min = 1, max = -1)
    })
    @JsonProperty(Vocabulary.s_p_shipperDeclarationText)
    protected String shipperDeclarationText;

    public void setAircraftLimitationInformation(String aircraftLimitationInformation) {
        this.aircraftLimitationInformation = aircraftLimitationInformation;
    }

    public String getAircraftLimitationInformation() {
        return aircraftLimitationInformation;
    }

    public void setComplianceDeclarationText(String complianceDeclarationText) {
        this.complianceDeclarationText = complianceDeclarationText;
    }

    public String getComplianceDeclarationText() {
        return complianceDeclarationText;
    }

    public void setExclusiveUseIndicator(Boolean exclusiveUseIndicator) {
        this.exclusiveUseIndicator = exclusiveUseIndicator;
    }

    public Boolean getExclusiveUseIndicator() {
        return exclusiveUseIndicator;
    }

    public void setHandlingInformation(String handlingInformation) {
        this.handlingInformation = handlingInformation;
    }

    public String getHandlingInformation() {
        return handlingInformation;
    }

    public void setShipperDeclarationText(String shipperDeclarationText) {
        this.shipperDeclarationText = shipperDeclarationText;
    }

    public String getShipperDeclarationText() {
        return shipperDeclarationText;
    }

    public Set<String> getTypes() {
        return types;
    }

    public void setTypes(Set<String> types) {
        this.types = types;
    }

}
