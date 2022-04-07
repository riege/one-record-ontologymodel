
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
 * Ranges details
 * 
 * This class was generated by OWL2Java 0.17.2
 * 
 */
@OWLClass(iri = Vocabulary.s_c_Ranges)
public class Ranges
    extends LogisticsObject
    implements Serializable
{

    @Types
    @JsonProperty("@type")
    @ApiModelProperty(allowableValues = Vocabulary.s_c_Ranges)
    protected Set<String> types;

    /**
     * Amount
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_amount)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#double", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_amount)
    protected Double amount;
    /**
     * Maximum quantity
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_maximumQuantity)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#double", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_maximumQuantity)
    protected Double maximumQuantity;
    /**
     * Minimum quantity
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_minimumQuantity)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#double", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_minimumQuantity)
    protected Double minimumQuantity;
    /**
     * Rate class code e.g. Q. Refer to CXML Code List 1.4 Rate Class Codes
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_rateClassCode)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_rateClassCode)
    protected String rateClassCode;
    /**
     * rating type - Refer to CXML Code List 1.44 ULD Charge Codes
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_ratingType)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_ratingType)
    protected String ratingType;
    /**
     * Specific commodity rates linked to commodity
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_scr)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_scr)
    protected String scr;
    /**
     * Specific commodity code linked to commodity
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_unitBasis)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_unitBasis)
    protected String unitBasis;

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }

    public void setMaximumQuantity(Double maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
    }

    public Double getMaximumQuantity() {
        return maximumQuantity;
    }

    public void setMinimumQuantity(Double minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
    }

    public Double getMinimumQuantity() {
        return minimumQuantity;
    }

    public void setRateClassCode(String rateClassCode) {
        this.rateClassCode = rateClassCode;
    }

    public String getRateClassCode() {
        return rateClassCode;
    }

    public void setRatingType(String ratingType) {
        this.ratingType = ratingType;
    }

    public String getRatingType() {
        return ratingType;
    }

    public void setScr(String scr) {
        this.scr = scr;
    }

    public String getScr() {
        return scr;
    }

    public void setUnitBasis(String unitBasis) {
        this.unitBasis = unitBasis;
    }

    public String getUnitBasis() {
        return unitBasis;
    }

    public Set<String> getTypes() {
        return types;
    }

    public void setTypes(Set<String> types) {
        this.types = types;
    }

}
