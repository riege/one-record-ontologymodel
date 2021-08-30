
package org.iata.cargo.model;

import java.io.Serializable;
import java.util.Set;

import org.iata.cargo.Vocabulary;

import com.fasterxml.jackson.annotation.JsonProperty;

import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLObjectProperty;


/**
 * Sensor measurements details for Geolocation sensors (sensorType = "Geolocation")
 * 
 * This class was generated by OWL2Java 0.16.4
 * 
 */
@OWLClass(iri = Vocabulary.s_c_SensorGeoloc)
public class SensorGeoloc
    extends Sensor
    implements Serializable
{

    /**
     * Reference to the measurements recorded by the geolocation sensor
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_val)
    @JsonProperty(Vocabulary.s_p_val)
    protected Set<MeasurementsGeoloc> val;

    public void setVal(Set<MeasurementsGeoloc> val) {
        this.val = val;
    }

    public Set<MeasurementsGeoloc> getVal() {
        return val;
    }

}
