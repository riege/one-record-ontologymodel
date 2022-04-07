
package org.iata.cargo.model;

import java.io.Serializable;
import java.util.Date;
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
 * Waybill details
 *
 * This class was generated by OWL2Java 0.17.2
 * 
 */
@OWLClass(iri = Vocabulary.s_c_Waybill)
public class Waybill
    extends LogisticsObject
    implements Serializable
{

    @Types
    @JsonProperty("@type")
    @ApiModelProperty(allowableValues = Vocabulary.s_c_Waybill)
    protected Set<String> types;
    /**
     * Refers to the Booking option
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_booking)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, min = 1, max = -1),
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_booking)
    protected BookingOption booking;
    /**
     * Refers to the Booking 
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_bookingRef_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    protected Booking bookingRef;
    /**
     * Location of individual or company involved in the movement of a consignment or Coded representation of a specific airport/city code
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_carrierDeclarationPlace)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1),
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, min = 1, max = -1)
    })
    @JsonProperty(Vocabulary.s_p_carrierDeclarationPlace)
    protected Location carrierDeclarationPlace;
    /**
     * Refers to the Waybill(s) contained
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_containedWaybills)
    @JsonProperty(Vocabulary.s_p_containedWaybills)
    protected Set<Waybill> containedWaybills;
    /**
     * Indicates the details of accounting information. Free text e.g. PAYMENT BY CERTIFIED CHEQUE etc.
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_accountingInformation)
    @JsonProperty(Vocabulary.s_p_accountingInformation)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String accountingInformation;
    /**
     * Date upon which the certification is made by the carrier
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_carrierDeclarationDate)
    @JsonProperty(Vocabulary.s_p_carrierDeclarationDate)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#dateTime", min = 1, max = -1),
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#dateTime", max = 1)
    })
    protected Date carrierDeclarationDate;
    /**
     * Contains the authentication of the Carrier
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_carrierDeclarationSignature)
    @JsonProperty(Vocabulary.s_p_carrierDeclarationSignature)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1),
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", min = 1, max = -1)
    })
    protected String carrierDeclarationSignature;
    /**
     * Name of consignor signatory
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_consignorDeclarationSignature)
    @JsonProperty(Vocabulary.s_p_consignorDeclarationSignature)
    protected Set<String> consignorDeclarationSignature;
    /**
     * Charges levied at destination accruing to the last carrier, in destination currency
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_destinationCharges)
    @JsonProperty(Vocabulary.s_p_destinationCharges)
    protected Set<Double> destinationCharges;
    /**
     * ISO 3-letter currency code of destination. Refer to ISO 4217
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_destinationCurrencyCode)
    @JsonProperty(Vocabulary.s_p_destinationCurrencyCode)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String destinationCurrencyCode;
    /**
     * Conversion rate applied
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_destinationCurrencyRate)
    @JsonProperty(Vocabulary.s_p_destinationCurrencyRate)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#double", max = 1)
    })
    protected Double destinationCurrencyRate;
    /**
     * The shipper or its Agent may enter the appropriate optional shipping
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_optionalShippingInfo)
    @JsonProperty(Vocabulary.s_p_optionalShippingInfo)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String optionalShippingInfo;
    /**
     * Optional shipping reference number if any
     *
     */
    @OWLDataProperty(iri = Vocabulary.s_p_optionalShippingRefNo)
    @JsonProperty(Vocabulary.s_p_optionalShippingRefNo)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String optionalShippingRefNo;
    /**
     * ISO alpha 3 Code used to indicate the Origin Currency, refer to ISO 4217 currency codes
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_originCurrency)
    @JsonProperty(Vocabulary.s_p_originCurrency)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String originCurrency;
    /**
     * House or Master Waybill unique identifier
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_waybillNumber_A_A_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", min = 1, max = -1),
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_waybillNumber_A_A)
    protected String waybillNumber;
    /**
     * Prefix used for the Waybill Number. Refer to IATA Airlines Codes
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_waybillPrefix)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_waybillPrefix)
    protected String waybillPrefix;
    /**
     * Type of the Waybill: House, Direct or Master
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_waybillType)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_waybillType)
    protected String waybillType;

    public void setBooking(BookingOption booking) {
        this.booking = booking;
    }

    public BookingOption getBooking() {
        return booking;
    }

    public void setBookingRef(Booking bookingRef) {
        this.bookingRef = bookingRef;
    }

    public Booking getBookingRef() {
        return bookingRef;
    }

    public void setCarrierDeclarationPlace(Location carrierDeclarationPlace) {
        this.carrierDeclarationPlace = carrierDeclarationPlace;
    }

    public Location getCarrierDeclarationPlace() {
        return carrierDeclarationPlace;
    }

    public void setContainedWaybills(Set<Waybill> containedWaybills) {
        this.containedWaybills = containedWaybills;
    }

    public Set<Waybill> getContainedWaybills() {
        return containedWaybills;
    }

    public void setAccountingInformation(String accountingInformation) {
        this.accountingInformation = accountingInformation;
    }

    public String getAccountingInformation() {
        return accountingInformation;
    }

    public void setCarrierDeclarationDate(Date carrierDeclarationDate) {
        this.carrierDeclarationDate = carrierDeclarationDate;
    }

    public Date getCarrierDeclarationDate() {
        return carrierDeclarationDate;
    }

    public void setCarrierDeclarationSignature(String carrierDeclarationSignature) {
        this.carrierDeclarationSignature = carrierDeclarationSignature;
    }

    public String getCarrierDeclarationSignature() {
        return carrierDeclarationSignature;
    }

    public void setConsignorDeclarationSignature(Set<String> consignorDeclarationSignature) {
        this.consignorDeclarationSignature = consignorDeclarationSignature;
    }

    public Set<String> getConsignorDeclarationSignature() {
        return consignorDeclarationSignature;
    }

    public void setDestinationCharges(Set<Double> destinationCharges) {
        this.destinationCharges = destinationCharges;
    }

    public Set<Double> getDestinationCharges() {
        return destinationCharges;
    }

    public void setDestinationCurrencyCode(String destinationCurrencyCode) {
        this.destinationCurrencyCode = destinationCurrencyCode;
    }

    public String getDestinationCurrencyCode() {
        return destinationCurrencyCode;
    }

    public void setDestinationCurrencyRate(Double destinationCurrencyRate) {
        this.destinationCurrencyRate = destinationCurrencyRate;
    }

    public Double getDestinationCurrencyRate() {
        return destinationCurrencyRate;
    }

    public void setOptionalShippingInfo(String optionalShippingInfo) {
        this.optionalShippingInfo = optionalShippingInfo;
    }

    public String getOptionalShippingInfo() {
        return optionalShippingInfo;
    }

    public void setOptionalShippingRefNo(String optionalShippingRefNo) {
        this.optionalShippingRefNo = optionalShippingRefNo;
    }

    public String getOptionalShippingRefNo() {
        return optionalShippingRefNo;
    }

    public void setOriginCurrency(String originCurrency) {
        this.originCurrency = originCurrency;
    }

    public String getOriginCurrency() {
        return originCurrency;
    }

    public void setWaybillNumber(String waybillNumber) {
        this.waybillNumber = waybillNumber;
    }

    public String getWaybillNumber() {
        return waybillNumber;
    }

    public void setWaybillPrefix(String waybillPrefix) {
        this.waybillPrefix = waybillPrefix;
    }

    public String getWaybillPrefix() {
        return waybillPrefix;
    }

    public void setWaybillType(String waybillType) {
        this.waybillType = waybillType;
    }

    public String getWaybillType() {
        return waybillType;
    }

    public Set<String> getTypes() {
        return types;
    }

    public void setTypes(Set<String> types) {
        this.types = types;
    }

}
