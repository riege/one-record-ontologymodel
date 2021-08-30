
package org.iata.api.model;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

import org.iata.api.Vocabulary;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import cz.cvut.kbss.jopa.model.annotations.Id;
import cz.cvut.kbss.jopa.model.annotations.OWLAnnotationProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLObjectProperty;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraint;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraints;
import cz.cvut.kbss.jopa.model.annotations.Properties;
import cz.cvut.kbss.jopa.model.annotations.Types;
import cz.cvut.kbss.jopa.vocabulary.DC;
import cz.cvut.kbss.jopa.vocabulary.RDFS;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Audit trail of a Logistics Object
 * 
 * This class was generated by OWL2Java 0.16.4
 * 
 */
@OWLClass(iri = Vocabulary.s_c_AuditTrail)
@Document(collection = "auditTrails")
@ApiModel
public class AuditTrail
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
    @ApiModelProperty(allowableValues = Vocabulary.s_c_AuditTrail)
    protected Set<String> types;
    @Properties
    @JsonIgnore
    protected Map<String, Set<String>> properties;
    @JsonProperty("language")
    @OWLAnnotationProperty(iri = DC.Terms.LANGUAGE)
    protected String language;

    /**
     * List of change requests that were sent as PATCH on for a Logistics Object
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_changeRequests)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, min = 1, max = -1)
    })
    @JsonProperty(Vocabulary.s_p_changeRequests)
    protected Set<ChangeRequest> changeRequests;
    /**
     * Non mandatory error details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_errors)
    @JsonProperty(Vocabulary.s_p_errors)
    protected Set<Error> errors;
    /**
     * Initial content of the Logistics Object at the creation moment, represented via a Memento
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_loInitialSnapshot)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1),
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, min = 1, max = -1)
    })
    @JsonProperty(Vocabulary.s_p_loInitialSnapshot)
    protected Memento loInitialSnapshot;
    /**
     * Logistics Object Reference for which the audit trail applies
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_logisticsObjectRef)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, min = 1, max = -1),
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_logisticsObjectRef)
    protected LogisticsObjectRef logisticsObjectRef;

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
        return ((((("AuditTrail {"+ name)+"<")+ id)+">")+"}");
    }

    public void setChangeRequests(Set<ChangeRequest> changeRequests) {
        this.changeRequests = changeRequests;
    }

    public Set<ChangeRequest> getChangeRequests() {
        return changeRequests;
    }

    public void setErrors(Set<Error> errors) {
        this.errors = errors;
    }

    public Set<Error> getErrors() {
        return errors;
    }

    public void setLoInitialSnapshot(Memento loInitialSnapshot) {
        this.loInitialSnapshot = loInitialSnapshot;
    }

    public Memento getLoInitialSnapshot() {
        return loInitialSnapshot;
    }

    public void setLogisticsObjectRef(LogisticsObjectRef logisticsObjectRef) {
        this.logisticsObjectRef = logisticsObjectRef;
    }

    public LogisticsObjectRef getLogisticsObjectRef() {
        return logisticsObjectRef;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
