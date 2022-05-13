
package org.iata.cargo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import java.util.Set;

import org.iata.cargo.Vocabulary;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import cz.cvut.kbss.jopa.model.annotations.Id;
import cz.cvut.kbss.jopa.model.annotations.OWLAnnotationProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLObjectProperty;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraint;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraints;
import cz.cvut.kbss.jopa.model.annotations.Properties;
import cz.cvut.kbss.jopa.model.annotations.Types;
import cz.cvut.kbss.jopa.vocabulary.DC;
import cz.cvut.kbss.jopa.vocabulary.RDFS;
import io.swagger.annotations.ApiModelProperty;


/**
 * Event details
 *
 * This class was generated by OWL2Java 0.17.2
 * 
 */
@OWLClass(iri = Vocabulary.s_c_Event)
public class Event
    implements Serializable
{

    @Id(generated = true)
    @ApiModelProperty(readOnly = true)
    protected String id;
    @JsonIgnore
    @OWLAnnotationProperty(iri = RDFS.LABEL)
    protected String name;
    @JsonIgnore
    @OWLAnnotationProperty(iri = cz.cvut.kbss.jopa.vocabulary.DC.Elements.DESCRIPTION)
    protected String description;
    @Types
    @JsonProperty("@type")
    @ApiModelProperty(allowableValues = Vocabulary.s_c_Event)
    protected Set<String> types;
    @Properties
    @JsonIgnore
    protected Map<String, Set<String>> properties;

    @JsonProperty("language")
    @OWLAnnotationProperty(iri = DC.Terms.LANGUAGE)
    protected String language;

    /**
     * Refers to the URI of the linked object(s)
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_linkedObject)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_LogisticsObject, min = 1, max = -1),
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_linkedObject)
    protected LogisticsObject linkedObject;
    /**
     * Location of event
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_location_A_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_location_A_A)
    protected Location location;
    /**
     * Party performing the event
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_performedBy)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_performedBy)
    protected Company performedBy;
    @OWLObjectProperty(iri = Vocabulary.s_p_performedByPerson)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_performedByPerson)
    protected Person performedByPerson;
    /**
     * Date and time of the event
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_dateTime)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#dateTime", min = 1, max = -1),
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#dateTime", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_dateTime)
    protected Date dateTime;
    /**
     * Movement or milestone code. Can refer to CXML Code List 1.18, e.g. DEP, ARR, FOH, RCS but not restricted to it.
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_eventCode)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_eventCode)
    protected String eventCode;
    /**
     * If no EventCode provided, event name - e.g. Security clearance
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_eventName)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_eventName)
    protected String eventName;
    /**
     * Indicates type of event e.g.  Scheduled, Estimated, Actual
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_eventTypeIndicator)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", min = 1, max = -1),
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_eventTypeIndicator)
    protected String eventTypeIndicator;

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
        return ((((("Event {"+ name)+"<")+ id)+">")+"}");
    }

    public void setLinkedObject(LogisticsObject linkedObject) {
        this.linkedObject = linkedObject;
    }

    public LogisticsObject getLinkedObject() {
        return linkedObject;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setPerformedBy(Company performedBy) {
        this.performedBy = performedBy;
    }

    public Company getPerformedBy() {
        return performedBy;
    }

    public void setPerformedByPerson(Person performedByPerson) {
        this.performedByPerson = performedByPerson;
    }

    public Person getPerformedByPerson() {
        return performedByPerson;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setEventCode(String eventCode) {
        this.eventCode = eventCode;
    }

    public String getEventCode() {
        return eventCode;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventTypeIndicator(String eventTypeIndicator) {
        this.eventTypeIndicator = eventTypeIndicator;
    }

    public String getEventTypeIndicator() {
        return eventTypeIndicator;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

}
