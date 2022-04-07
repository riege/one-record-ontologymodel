
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
 * Transport segment details
 *
 * This class was generated by OWL2Java 0.17.2
 * 
 */
@OWLClass(iri = Vocabulary.s_c_TransportSegment)
@Deprecated
public class TransportSegment
    extends LogisticsObject
    implements Serializable
{

    @Types
    @JsonProperty("@type")
    @ApiModelProperty(allowableValues = Vocabulary.s_c_TransportSegment)
    protected Set<String> types;

    /**
     * Arrival location details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_arrivalLocation_A_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_arrivalLocation_A_A)
    protected Location arrivalLocation;
    /**
     * Amount of CO2 emitted (e.g. 34 kg/km)
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_co2Emissions)
    @JsonProperty(Vocabulary.s_p_co2Emissions)
    protected Set<CO2Emissions> co2Emissions;
    /**
     * Departure location details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_departureLocation_A_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_departureLocation_A_A)
    protected Location departureLocation;
    /**
     * Distance calculated if distance measured is not available
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_distanceCalculated)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_distanceCalculated)
    protected Value distanceCalculated;
    /**
     * Distance measured
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_distanceMeasured)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_distanceMeasured)
    protected Value distanceMeasured;
    /**
     * Reference to document or logistics object (URI)
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_externalReferences_A_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_externalReferences_A_A)
    protected ExternalReference externalReferences;
    /**
     * calculated fuel consumption, if measured not available
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_fuelAmountCalculated)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_fuelAmountCalculated)
    protected Value fuelAmountCalculated;
    /**
     * actual measured fuel consumption
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_fuelAmountMeasured)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_fuelAmountMeasured)
    protected Value fuelAmountMeasured;
    /**
     * Actual payload for the transport
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_payload)
    @JsonProperty(Vocabulary.s_p_payload)
    protected Set<Value> payload;
    /**
     * Transport means details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_transportMeans)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_transportMeans)
    protected TransportMeans transportMeans;
    /**
     * Name of the person operating the transport means (e.g. aircraft captain, truck driver)
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_transportMeansOperators)
    @JsonProperty(Vocabulary.s_p_transportMeansOperators)
    protected Set<Person> transportMeansOperators;
    /**
     * Pieces assigned to the transport segment
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_transportedPieces)
    @JsonProperty(Vocabulary.s_p_transportedPieces)
    protected Set<Piece> transportedPieces;
    /**
     * ULDs assigned to the transport segment
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_transportedUlds)
    @JsonProperty(Vocabulary.s_p_transportedUlds)
    protected Set<ULD> transportedUlds;
    /**
     * e.g. Kerosene, Diesel, SAF, Electricity [renewable], Electricity [non-renewable]
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_fuelType)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_fuelType)
    protected String fuelType;
    /**
     * Mode of transport code, refer to UNECE Rec. 19
     * https://unece.org/fileadmin/DAM/cefact/recommendations/rec19/rec19_01cf19e.pdf
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_modeCode)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_modeCode)
    protected String modeCode;
    /**
     * Pre-Carriage, Main-Carriage or On-Carriage
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_modeQualifier)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_modeQualifier)
    protected String modeQualifier;
    /**
     * Seal identifier
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_seal)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_seal)
    protected String seal;
    /**
     * Airline flight number, or rail /  truck / maritime line id
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_transportIdentifier)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_transportIdentifier)
    protected String transportIdentifier;

    @Deprecated
    public void setArrivalLocation(Location arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    @Deprecated
    public Location getArrivalLocation() {
        return arrivalLocation;
    }

    @Deprecated
    public void setCo2Emissions(Set<CO2Emissions> co2Emissions) {
        this.co2Emissions = co2Emissions;
    }

    @Deprecated
    public Set<CO2Emissions> getCo2Emissions() {
        return co2Emissions;
    }

    @Deprecated
    public void setDepartureLocation(Location departureLocation) {
        this.departureLocation = departureLocation;
    }

    @Deprecated
    public Location getDepartureLocation() {
        return departureLocation;
    }

    @Deprecated
    public void setDistanceCalculated(Value distanceCalculated) {
        this.distanceCalculated = distanceCalculated;
    }

    @Deprecated
    public Value getDistanceCalculated() {
        return distanceCalculated;
    }

    @Deprecated
    public void setDistanceMeasured(Value distanceMeasured) {
        this.distanceMeasured = distanceMeasured;
    }

    @Deprecated
    public Value getDistanceMeasured() {
        return distanceMeasured;
    }

    @Deprecated
    public void setExternalReferences(ExternalReference externalReferences) {
        this.externalReferences = externalReferences;
    }

    @Deprecated
    public ExternalReference getExternalReferences() {
        return externalReferences;
    }

    @Deprecated
    public void setFuelAmountCalculated(Value fuelAmountCalculated) {
        this.fuelAmountCalculated = fuelAmountCalculated;
    }

    @Deprecated
    public Value getFuelAmountCalculated() {
        return fuelAmountCalculated;
    }

    @Deprecated
    public void setFuelAmountMeasured(Value fuelAmountMeasured) {
        this.fuelAmountMeasured = fuelAmountMeasured;
    }

    @Deprecated
    public Value getFuelAmountMeasured() {
        return fuelAmountMeasured;
    }

    @Deprecated
    public void setPayload(Set<Value> payload) {
        this.payload = payload;
    }

    @Deprecated
    public Set<Value> getPayload() {
        return payload;
    }

    @Deprecated
    public void setTransportMeans(TransportMeans transportMeans) {
        this.transportMeans = transportMeans;
    }

    @Deprecated
    public TransportMeans getTransportMeans() {
        return transportMeans;
    }

    @Deprecated
    public void setTransportMeansOperators(Set<Person> transportMeansOperators) {
        this.transportMeansOperators = transportMeansOperators;
    }

    @Deprecated
    public Set<Person> getTransportMeansOperators() {
        return transportMeansOperators;
    }

    @Deprecated
    public void setTransportedPieces(Set<Piece> transportedPieces) {
        this.transportedPieces = transportedPieces;
    }

    @Deprecated
    public Set<Piece> getTransportedPieces() {
        return transportedPieces;
    }

    @Deprecated
    public void setTransportedUlds(Set<ULD> transportedUlds) {
        this.transportedUlds = transportedUlds;
    }

    @Deprecated
    public Set<ULD> getTransportedUlds() {
        return transportedUlds;
    }

    @Deprecated
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Deprecated
    public String getFuelType() {
        return fuelType;
    }

    @Deprecated
    public void setModeCode(String modeCode) {
        this.modeCode = modeCode;
    }

    @Deprecated
    public String getModeCode() {
        return modeCode;
    }

    @Deprecated
    public void setModeQualifier(String modeQualifier) {
        this.modeQualifier = modeQualifier;
    }

    @Deprecated
    public String getModeQualifier() {
        return modeQualifier;
    }

    @Deprecated
    public void setSeal(String seal) {
        this.seal = seal;
    }

    @Deprecated
    public String getSeal() {
        return seal;
    }

    @Deprecated
    public void setTransportIdentifier(String transportIdentifier) {
        this.transportIdentifier = transportIdentifier;
    }

    @Deprecated
    public String getTransportIdentifier() {
        return transportIdentifier;
    }

}
