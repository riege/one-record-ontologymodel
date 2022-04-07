
package org.iata.cargo.model;

import java.io.Serializable;

import org.iata.cargo.Vocabulary;

import com.fasterxml.jackson.annotation.JsonProperty;

import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraint;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraints;


/**
 * Company details of carriers
 * 
 * This class was generated by OWL2Java 0.17.2
 * 
 */
@OWLClass(iri = Vocabulary.s_c_Carrier)
public class Carrier
    extends Company
    implements Serializable
{

    /**
     * IATA two-character airline code
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_airlineCode)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_airlineCode)
    protected String airlineCode;
    /**
     * IATA three-numeric airline prefix number
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_airlinePrefix)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_airlinePrefix)
    protected String airlinePrefix;
    /**
     * Official carrier name
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_carrierName)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_carrierName)
    protected String carrierName;
    /**
     * Carrier short name if any
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_carrierShortName)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_carrierShortName)
    protected String carrierShortName;

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlinePrefix(String airlinePrefix) {
        this.airlinePrefix = airlinePrefix;
    }

    public String getAirlinePrefix() {
        return airlinePrefix;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierShortName(String carrierShortName) {
        this.carrierShortName = carrierShortName;
    }

    public String getCarrierShortName() {
        return carrierShortName;
    }

}
