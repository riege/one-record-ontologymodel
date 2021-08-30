
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
 * Sensor details and measurements, linked to Connected Devices
 * 
 * This class was generated by OWL2Java 0.16.4
 * 
 */
@OWLClass(iri = Vocabulary.s_c_Sensor)
public class Sensor
    extends LogisticsObject
    implements Serializable
{

    @Types
    @JsonProperty("@type")
    @ApiModelProperty(allowableValues = Vocabulary.s_c_Sensor)
    protected Set<String> types;

    /**
     * Reference to the IoT Device to which the sensor is linked
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_iotDevice)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, min = 1, max = -1)
    })
    @JsonProperty(Vocabulary.s_p_iotDevice)
    protected Set<IotDevice> iotDevice;
    /**
     * Natural language description of the sensor
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_sensorDescription)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_sensorDescription)
    protected String sensorDescription;
    /**
     * Name of the sensor defined by the sensor's manufacturer
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_sensorName)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_sensorName)
    protected String sensorName;
    /**
     * Serial number that allows to uniquely identify the sensor
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_sensorSerialNumber)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_sensorSerialNumber)
    protected String sensorSerialNumber;
    /**
     * Type of sensor as described in Interactive Cargo RP
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_sensorType)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_sensorType)
    protected String sensorType;

    public void setIotDevice(Set<IotDevice> iotDevice) {
        this.iotDevice = iotDevice;
    }

    public Set<IotDevice> getIotDevice() {
        return iotDevice;
    }

    public void setSensorDescription(String sensorDescription) {
        this.sensorDescription = sensorDescription;
    }

    public String getSensorDescription() {
        return sensorDescription;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorSerialNumber(String sensorSerialNumber) {
        this.sensorSerialNumber = sensorSerialNumber;
    }

    public String getSensorSerialNumber() {
        return sensorSerialNumber;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    public String getSensorType() {
        return sensorType;
    }

    public Set<String> getTypes() {
        return types;
    }

    public void setTypes(Set<String> types) {
        this.types = types;
    }

}
