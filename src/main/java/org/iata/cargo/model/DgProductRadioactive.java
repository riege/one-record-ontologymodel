
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
 * Details of the radioactive products 
 * 
 * This class was generated by OWL2Java 0.17.2
 * 
 */
@OWLClass(iri = Vocabulary.s_c_DgProductRadioactive)
public class DgProductRadioactive
    extends LogisticsObject
    implements Serializable
{

    @Types
    @JsonProperty("@type")
    @ApiModelProperty(allowableValues = Vocabulary.s_c_DgProductRadioactive)
    protected Set<String> types;

    /**
     * DgRadioactiveIsotope.
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_isotopes)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_isotopes)
    protected DgRadioactiveIsotope isotopes;
    /**
     * The category of the package or all packed in one. Complete text to be transmitted: I-White, II-Yellow, III-Yellow instead of I, II, III
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_dgRaTypeCode)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_dgRaTypeCode)
    protected String dgRaTypeCode;
    /**
     * Indicates if Fissile is excepted
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_fissileExceptionIndicator)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#boolean", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_fissileExceptionIndicator)
    protected Boolean fissileExceptionIndicator;
    /**
     * Fissile exception reference, mandatory if Fissile Exception Indicator is true.
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_fissileExceptionReference)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_fissileExceptionReference)
    protected String fissileExceptionReference;
    /**
     * Radioactive Transport-Index value of the package or all packed in one. Conditionally mandator and applies to categories II-Yellow and III-Yellow only; field only contains the value, if printed, TI must be added as a prefix to the value  to be printed in the Packing Instructions column
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_transportIndexNumeric)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#integer", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_transportIndexNumeric)
    protected Integer transportIndexNumeric;

    public void setIsotopes(DgRadioactiveIsotope isotopes) {
        this.isotopes = isotopes;
    }

    public DgRadioactiveIsotope getIsotopes() {
        return isotopes;
    }

    public void setDgRaTypeCode(String dgRaTypeCode) {
        this.dgRaTypeCode = dgRaTypeCode;
    }

    public String getDgRaTypeCode() {
        return dgRaTypeCode;
    }

    public void setFissileExceptionIndicator(Boolean fissileExceptionIndicator) {
        this.fissileExceptionIndicator = fissileExceptionIndicator;
    }

    public Boolean getFissileExceptionIndicator() {
        return fissileExceptionIndicator;
    }

    public void setFissileExceptionReference(String fissileExceptionReference) {
        this.fissileExceptionReference = fissileExceptionReference;
    }

    public String getFissileExceptionReference() {
        return fissileExceptionReference;
    }

    public void setTransportIndexNumeric(Integer transportIndexNumeric) {
        this.transportIndexNumeric = transportIndexNumeric;
    }

    public Integer getTransportIndexNumeric() {
        return transportIndexNumeric;
    }

    public Set<String> getTypes() {
        return types;
    }

    public void setTypes(Set<String> types) {
        this.types = types;
    }

}
