
package org.iata.cargo.model;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

import org.iata.cargo.Vocabulary;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import cz.cvut.kbss.jopa.model.annotations.Id;
import cz.cvut.kbss.jopa.model.annotations.OWLAnnotationProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraint;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraints;
import cz.cvut.kbss.jopa.model.annotations.Properties;
import cz.cvut.kbss.jopa.model.annotations.Types;
import cz.cvut.kbss.jopa.vocabulary.DC;
import cz.cvut.kbss.jopa.vocabulary.RDFS;
import io.swagger.annotations.ApiModelProperty;


/**
 * Volumetric weight details
 * 
 * This class was generated by OWL2Java 0.17.2
 * 
 */
@OWLClass(iri = Vocabulary.s_c_Value)
public class Value
    implements Serializable
{

    @Id(generated = true)
    @ApiModelProperty(readOnly = true)
    protected String id;
    @OWLAnnotationProperty(iri = RDFS.LABEL)
    @JsonIgnore
    protected String name;
    @JsonIgnore
    @OWLAnnotationProperty(iri = cz.cvut.kbss.jopa.vocabulary.DC.Elements.DESCRIPTION)
    protected String description;
    @Types
    @JsonProperty("@type")
    @ApiModelProperty(allowableValues = Vocabulary.s_c_Value)
    protected Set<String> types;
    @Properties
    @JsonIgnore
    protected Map<String, Set<String>> properties;

    @JsonProperty("language")
    @OWLAnnotationProperty(iri = DC.Terms.LANGUAGE)
    protected String language;

    /**
     * Unit of measurement/ unit of account e.g. CMT - Centimetre,  LTR - Litre (1 DM3), KGM - Kilogram, CHF - Swiss Franc
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_unit)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_unit)
    protected String unit;
    /**
     * Value
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_value_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#double", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_value_A)
    protected Double value;

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
        return ((((("Value {"+ name)+"<")+ id)+">")+"}");
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

}
