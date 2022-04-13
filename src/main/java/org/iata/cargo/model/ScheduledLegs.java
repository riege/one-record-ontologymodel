
package org.iata.cargo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import cz.cvut.kbss.jopa.model.annotations.Id;
import cz.cvut.kbss.jopa.model.annotations.OWLAnnotationProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLObjectProperty;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraint;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraints;
import cz.cvut.kbss.jopa.model.annotations.Properties;
import cz.cvut.kbss.jopa.model.annotations.Types;
import cz.cvut.kbss.jopa.vocabulary.RDFS;
import org.iata.cargo.Vocabulary;


/**
 * Scheduled Legs class to be used to identify legs. Can be used with Booking Option Request as an indicator of preferred Routing or with Booking Option when a carrier proposes a specific Routing.
 * 
 * This class was generated by OWL2Java 0.17.2
 * 
 */
@OWLClass(iri = Vocabulary.s_c_ScheduledLegs)
public class ScheduledLegs
    implements Serializable
{

    @Id(generated = true)
    protected String id;
    @OWLAnnotationProperty(iri = RDFS.LABEL)
    protected String name;
    @OWLAnnotationProperty(iri = cz.cvut.kbss.jopa.vocabulary.DC.Elements.DESCRIPTION)
    protected String description;
    @Types
    protected Set<String> types;
    @Properties
    protected Map<String, Set<String>> properties;
    /**
     * Arrival location of the leg
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_arrivalLocation_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, min = 1, max = -1),
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    protected Location arrivalLocation;
    /**
     * Departure Location of the leg
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_departureLocation_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1),
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, min = 1, max = -1)
    })
    protected Location departureLocation;
    /**
     * Arrival date and time of the leg
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_arrivalDate)
    protected Set<Date> arrivalDate;
    /**
     * Departure date and time of the leg
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_departureDate)
    protected Set<Date> departureDate;
    /**
     * Sequence number of the leg
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_sequenceNumber)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#integer", max = 1),
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#integer", min = 1, max = -1)
    })
    protected Integer sequenceNumber;
    /**
     * Transport Id of the leg. E.g. Flight number, truck route identifier, etc.
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_transportId)
    protected Set<String> transportId;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setTypes(Set<String> types) {
        this.types = types;
    }

    public Set<String> getTypes() {
        return types;
    }

    public void setProperties(Map<String, Set<String>> properties) {
        this.properties = properties;
    }

    public Map<String, Set<String>> getProperties() {
        return properties;
    }

    @Override
    public String toString() {
        return ((((("ScheduledLegs {"+ name)+"<")+ id)+">")+"}");
    }

    public void setArrivalLocation(Location arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    public Location getArrivalLocation() {
        return arrivalLocation;
    }

    public void setDepartureLocation(Location departureLocation) {
        this.departureLocation = departureLocation;
    }

    public Location getDepartureLocation() {
        return departureLocation;
    }

    public void setArrivalDate(Set<Date> arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Set<Date> getArrivalDate() {
        return arrivalDate;
    }

    public void setDepartureDate(Set<Date> departureDate) {
        this.departureDate = departureDate;
    }

    public Set<Date> getDepartureDate() {
        return departureDate;
    }

    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    public void setTransportId(Set<String> transportId) {
        this.transportId = transportId;
    }

    public Set<String> getTransportId() {
        return transportId;
    }

}
