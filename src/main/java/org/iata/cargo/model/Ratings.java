
package org.iata.cargo.model;

import java.io.Serializable;
import java.util.Set;

import org.iata.cargo.Vocabulary;

import com.fasterxml.jackson.annotation.JsonProperty;

import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLObjectProperty;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraint;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraints;
import cz.cvut.kbss.jopa.model.annotations.Types;
import io.swagger.annotations.ApiModelProperty;


/**
 * Ratings details
 *
 * This class was generated by OWL2Java 0.17.2
 * 
 */
@OWLClass(iri = Vocabulary.s_c_Ratings)
public class Ratings
    extends LogisticsObject
    implements Serializable
{

    @Types
    @JsonProperty("@type")
    @ApiModelProperty(allowableValues = Vocabulary.s_c_Ratings)
    protected Set<String> types;

    /**
     * Reference to the ranges
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_ranges)
    @JsonProperty(Vocabulary.s_p_ranges)
    protected Set<Ranges> ranges;
    /**
     * Billig charge identifiers to be used for CASS. Refer to CargoXML Code List 1.33
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_billingChargeIdentifier)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_billingChargeIdentifier)
    protected String billingChargeIdentifier;
    /**
     * Charge code, refer to CargoXML Code List 1.1
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_chargeCode)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_chargeCode)
    protected String chargeCode;
    /**
     * Description of the charge e.g. Airfreight, fuel, etc.
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_chargeDescription)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_chargeDescription)
    protected String chargeDescription;
    /**
     * Indicates if charge is prepaid or collect (P, C)
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_chargePaymentType)
    @JsonProperty(Vocabulary.s_p_chargePaymentType)
    protected Set<String> chargePaymentType;
    /**
     * Type of charge that should match the code expressed in either chargeCode, otherChargeCode or billingChargeIndentifier data properties.
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_chargeType)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_chargeType)
    protected String chargeType;
    /**
     * Entitlement code to define if charges are Due carrier (C) or Due agent (A). Refer to CXML Code List 1.3
     *
     */
    @OWLDataProperty(iri = Vocabulary.s_p_entitlement)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_entitlement)
    protected String entitlement;
    /**
     * Refer to CargoXML Code List 1.2 for Other Charges
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_otherChargeCode)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_otherChargeCode)
    protected String otherChargeCode;
    /**
     * Specification of the price e.g. Street, Group, Spot, etc.
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_priceSpecification)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_priceSpecification)
    protected String priceSpecification;
    /**
     * Reference of price specifications
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_priceSpecificationRef)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_priceSpecificationRef)
    protected String priceSpecificationRef;
    /**
     * Used if there is an applicable quantity to the rate (Usually a Time or a Number)
     *
     */
    @OWLDataProperty(iri = Vocabulary.s_p_quantity_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_quantity_A)
    protected String quantity;
    /**
     * Used to identify if the Ratings are Face, Published or Actual ratings. Expected values are F, A, C.
     *
     */
    @OWLDataProperty(iri = Vocabulary.s_p_ratingsType)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_ratingsType)
    protected String ratingsType;
    /**
     * IATA 3-letter code of the rate combination point
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_rcp)
    @JsonProperty(Vocabulary.s_p_rcp)
    protected Set<String> rcp;
    /**
     * Subtotal of the charge
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_subTotal)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#double", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_subTotal)
    protected Double subTotal;

    public void setRanges(Set<Ranges> ranges) {
        this.ranges = ranges;
    }

    public Set<Ranges> getRanges() {
        return ranges;
    }

    public void setBillingChargeIdentifier(String billingChargeIdentifier) {
        this.billingChargeIdentifier = billingChargeIdentifier;
    }

    public String getBillingChargeIdentifier() {
        return billingChargeIdentifier;
    }

    public void setChargeCode(String chargeCode) {
        this.chargeCode = chargeCode;
    }

    public String getChargeCode() {
        return chargeCode;
    }

    public void setChargeDescription(String chargeDescription) {
        this.chargeDescription = chargeDescription;
    }

    public String getChargeDescription() {
        return chargeDescription;
    }

    public void setChargePaymentType(Set<String> chargePaymentType) {
        this.chargePaymentType = chargePaymentType;
    }

    public Set<String> getChargePaymentType() {
        return chargePaymentType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setEntitlement(String entitlement) {
        this.entitlement = entitlement;
    }

    public String getEntitlement() {
        return entitlement;
    }

    public void setOtherChargeCode(String otherChargeCode) {
        this.otherChargeCode = otherChargeCode;
    }

    public String getOtherChargeCode() {
        return otherChargeCode;
    }

    public void setPriceSpecification(String priceSpecification) {
        this.priceSpecification = priceSpecification;
    }

    public String getPriceSpecification() {
        return priceSpecification;
    }

    public void setPriceSpecificationRef(String priceSpecificationRef) {
        this.priceSpecificationRef = priceSpecificationRef;
    }

    public String getPriceSpecificationRef() {
        return priceSpecificationRef;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setRatingsType(String ratingsType) {
        this.ratingsType = ratingsType;
    }

    public String getRatingsType() {
        return ratingsType;
    }

    public void setRcp(Set<String> rcp) {
        this.rcp = rcp;
    }

    public Set<String> getRcp() {
        return rcp;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public Set<String> getTypes() {
        return types;
    }

    public void setTypes(Set<String> types) {
        this.types = types;
    }

}
