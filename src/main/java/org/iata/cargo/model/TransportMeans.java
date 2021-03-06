
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
 * Transport means details
 *
 * This class was generated by OWL2Java 0.17.2
 *
 */
@OWLClass(iri = Vocabulary.s_c_TransportMeans)
public class TransportMeans
    extends LogisticsObject
    implements Serializable
{

    @Types
    @JsonProperty("@type")
    @ApiModelProperty(allowableValues = Vocabulary.s_c_TransportMeans)
    protected Set<String> types;

    /**
     * Company operating the transport means
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_transportCompany)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_transportCompany)
    protected Company transportCompany;
    /**
     * Transport Movement on which the Transport Means is used
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_transportMovement_A_A_A_A_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_transportMovement_A_A_A_A_A)
    protected TransportMovement transportMovement;
    /**
     * Associated transport segment
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_transportSegment)
    @JsonProperty(Vocabulary.s_p_transportSegment)
    protected Set<TransportSegment> transportSegment;
    /**
     * Required for some CO2 calculations
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_typicalCO2Coefficient)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_typicalCO2Coefficient)
    protected Value typicalCO2Coefficient;
    /**
     * Typical fuel comsumption (e.g. 20 000L / 1 000nm)
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_typicalFuelConsumption)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_typicalFuelConsumption)
    protected Value typicalFuelConsumption;
    /**
     * Model or make of the vehicle (e.g. A330-300)
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_vehicleModel)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_vehicleModel)
    protected String vehicleModel;
    /**
     * Vehicle identification - e.g. aircraft registration number
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_vehicleRegistration)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_vehicleRegistration)
    protected String vehicleRegistration;
    /**
     * Size of the vehicle - free text
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_vehicleSize)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_vehicleSize)
    protected String vehicleSize;
    /**
     * Vehicle or container type. Refer UNECE28, e.g. 4.00.0 - Aircraft, type unknown.For Air refer to IATA Standard Schedules Information Manua in section ATA/IATA Aircraft Types
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_vehicleType)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_vehicleType)
    protected String vehicleType;

    public void setTransportCompany(Company transportCompany) {
        this.transportCompany = transportCompany;
    }

    public Company getTransportCompany() {
        return transportCompany;
    }

    public void setTransportMovement(TransportMovement transportMovement) {
        this.transportMovement = transportMovement;
    }

    public TransportMovement getTransportMovement() {
        return transportMovement;
    }

    public void setTransportSegment(Set<TransportSegment> transportSegment) {
        this.transportSegment = transportSegment;
    }

    public Set<TransportSegment> getTransportSegment() {
        return transportSegment;
    }

    public void setTypicalCO2Coefficient(Value typicalCO2Coefficient) {
        this.typicalCO2Coefficient = typicalCO2Coefficient;
    }

    public Value getTypicalCO2Coefficient() {
        return typicalCO2Coefficient;
    }

    public void setTypicalFuelConsumption(Value typicalFuelConsumption) {
        this.typicalFuelConsumption = typicalFuelConsumption;
    }

    public Value getTypicalFuelConsumption() {
        return typicalFuelConsumption;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleRegistration(String vehicleRegistration) {
        this.vehicleRegistration = vehicleRegistration;
    }

    public String getVehicleRegistration() {
        return vehicleRegistration;
    }

    public void setVehicleSize(String vehicleSize) {
        this.vehicleSize = vehicleSize;
    }

    public String getVehicleSize() {
        return vehicleSize;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public Set<String> getTypes() {
        return types;
    }

    public void setTypes(Set<String> types) {
        this.types = types;
    }

}
