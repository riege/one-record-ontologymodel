
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


/**
 * Transport movement details, replaces the TransportSegment in v1.1 and above
 * 
 * This class was generated by OWL2Java 0.16.4
 * 
 */
@OWLClass(iri = Vocabulary.s_c_TransportMovement)
public class TransportMovement
    extends LogisticsObject
    implements Serializable
{

    /**
     * Arrival location details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_arrivalLocation_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_arrivalLocation_A)
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
    @OWLObjectProperty(iri = Vocabulary.s_p_departureLocation_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_departureLocation_A)
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
     * Mode Code
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
    /**
     * Free text field to be used for additional details regarding unplanned stops such as technical stops.
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_unplannedStop)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_unplannedStop)
    protected String unplannedStop;

    public void setArrivalLocation(Location arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    public Location getArrivalLocation() {
        return arrivalLocation;
    }

    public void setCo2Emissions(Set<CO2Emissions> co2Emissions) {
        this.co2Emissions = co2Emissions;
    }

    public Set<CO2Emissions> getCo2Emissions() {
        return co2Emissions;
    }

    public void setDepartureLocation(Location departureLocation) {
        this.departureLocation = departureLocation;
    }

    public Location getDepartureLocation() {
        return departureLocation;
    }

    public void setDistanceCalculated(Value distanceCalculated) {
        this.distanceCalculated = distanceCalculated;
    }

    public Value getDistanceCalculated() {
        return distanceCalculated;
    }

    public void setDistanceMeasured(Value distanceMeasured) {
        this.distanceMeasured = distanceMeasured;
    }

    public Value getDistanceMeasured() {
        return distanceMeasured;
    }

    public void setExternalReferences(ExternalReference externalReferences) {
        this.externalReferences = externalReferences;
    }

    public ExternalReference getExternalReferences() {
        return externalReferences;
    }

    public void setFuelAmountCalculated(Value fuelAmountCalculated) {
        this.fuelAmountCalculated = fuelAmountCalculated;
    }

    public Value getFuelAmountCalculated() {
        return fuelAmountCalculated;
    }

    public void setFuelAmountMeasured(Value fuelAmountMeasured) {
        this.fuelAmountMeasured = fuelAmountMeasured;
    }

    public Value getFuelAmountMeasured() {
        return fuelAmountMeasured;
    }

    public void setPayload(Set<Value> payload) {
        this.payload = payload;
    }

    public Set<Value> getPayload() {
        return payload;
    }

    public void setTransportMeans(TransportMeans transportMeans) {
        this.transportMeans = transportMeans;
    }

    public TransportMeans getTransportMeans() {
        return transportMeans;
    }

    public void setTransportMeansOperators(Set<Person> transportMeansOperators) {
        this.transportMeansOperators = transportMeansOperators;
    }

    public Set<Person> getTransportMeansOperators() {
        return transportMeansOperators;
    }

    public void setTransportedPieces(Set<Piece> transportedPieces) {
        this.transportedPieces = transportedPieces;
    }

    public Set<Piece> getTransportedPieces() {
        return transportedPieces;
    }

    public void setTransportedUlds(Set<ULD> transportedUlds) {
        this.transportedUlds = transportedUlds;
    }

    public Set<ULD> getTransportedUlds() {
        return transportedUlds;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setModeCode(String modeCode) {
        this.modeCode = modeCode;
    }

    public String getModeCode() {
        return modeCode;
    }

    public void setModeQualifier(String modeQualifier) {
        this.modeQualifier = modeQualifier;
    }

    public String getModeQualifier() {
        return modeQualifier;
    }

    public void setSeal(String seal) {
        this.seal = seal;
    }

    public String getSeal() {
        return seal;
    }

    public void setTransportIdentifier(String transportIdentifier) {
        this.transportIdentifier = transportIdentifier;
    }

    public String getTransportIdentifier() {
        return transportIdentifier;
    }

    public void setUnplannedStop(String unplannedStop) {
        this.unplannedStop = unplannedStop;
    }

    public String getUnplannedStop() {
        return unplannedStop;
    }

}
