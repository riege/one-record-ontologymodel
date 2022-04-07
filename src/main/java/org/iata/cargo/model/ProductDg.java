
package org.iata.cargo.model;

import java.io.Serializable;

import org.iata.cargo.Vocabulary;

import com.fasterxml.jackson.annotation.JsonProperty;

import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLObjectProperty;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraint;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraints;


/**
 * Dangerous Goods subtype of Product
 * 
 * This class was generated by OWL2Java 0.17.2
 * 
 */
@OWLClass(iri = Vocabulary.s_c_ProductDg)
public class ProductDg
    extends Product
    implements Serializable
{

    /**
     * Dg Radioactive Material
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_dgRadioactiveMaterial)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_dgRadioactiveMaterial)
    protected DgProductRadioactive dgRadioactiveMaterial;
    /**
     * Identifies the subsidiary hazard class / division identification containing a numeric field separated by a decimal. There may be 0, 1 or 2 subsidiary risk classes or divisions. If there is more than one, each should be separated by a comma. The subsidiary risk must be shown in parentheses. 
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_additionalHazardClassificationId)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_additionalHazardClassificationId)
    protected String additionalHazardClassificationId;
    /**
     * Contains additional information relating to an approval, permission or other specific detail applicable to the commodity (e.g. Dangerous Goods in excepted quantities) 
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_authorizationInformation)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_authorizationInformation)
    protected String authorizationInformation;
    /**
     * Specifies the reference to the group which identifies the kind of substances and articles that are deemed to be compatible. Mandatory field in case of transport of explosive articles or substances
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_explosiveCompatibilityGroupCode)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_explosiveCompatibilityGroupCode)
    protected String explosiveCompatibilityGroupCode;
    /**
     * Identifies the hazard class / division identification containing a numeric field separated by a decimal
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_hazardClassificationId)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_hazardClassificationId)
    protected String hazardClassificationId;
    /**
     * Packing group, If used must reference I, II or III
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_packagingDangerLevelCode)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_packagingDangerLevelCode)
    protected String packagingDangerLevelCode;
    /**
     * The packing instruction number applicable to the UN number / proper shipping name entry. A three-numeric value which may be preceded by the letter Y.  Mandatory field for air transport (Air) 
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_packingInstructionNumber)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_packingInstructionNumber)
    protected String packingInstructionNumber;
    /**
     * The name used to describe the particular article or substance as shown in the UN Model Regulations Dangerous Goods List
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_properShippingName)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_properShippingName)
    protected String properShippingName;
    /**
     * For Air Mode: Special Provision may show a single, double or triple digit number preceded by the letter A, against appropriate entries in the List of Dangerous Goods
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_specialProvisionId)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_specialProvisionId)
    protected String specialProvisionId;
    /**
     * This is additional chemical name(s) required for some proper shipping names. When added the technical must be shown in parentheses immediately following the proper shipping name. 
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_technicalName)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_technicalName)
    protected String technicalName;
    /**
     * Reference identifying the United Nations Dangerous Goods serial number assigned within the UN to substances and articles contained in a list of the dangerous goods most commonly carried. e.g. 1189 - Ethylene glycol monomethyl ether acetate
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_unNumber)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_unNumber)
    protected String unNumber;

    public void setDgRadioactiveMaterial(DgProductRadioactive dgRadioactiveMaterial) {
        this.dgRadioactiveMaterial = dgRadioactiveMaterial;
    }

    public DgProductRadioactive getDgRadioactiveMaterial() {
        return dgRadioactiveMaterial;
    }

    public void setAdditionalHazardClassificationId(String additionalHazardClassificationId) {
        this.additionalHazardClassificationId = additionalHazardClassificationId;
    }

    public String getAdditionalHazardClassificationId() {
        return additionalHazardClassificationId;
    }

    public void setAuthorizationInformation(String authorizationInformation) {
        this.authorizationInformation = authorizationInformation;
    }

    public String getAuthorizationInformation() {
        return authorizationInformation;
    }

    public void setExplosiveCompatibilityGroupCode(String explosiveCompatibilityGroupCode) {
        this.explosiveCompatibilityGroupCode = explosiveCompatibilityGroupCode;
    }

    public String getExplosiveCompatibilityGroupCode() {
        return explosiveCompatibilityGroupCode;
    }

    public void setHazardClassificationId(String hazardClassificationId) {
        this.hazardClassificationId = hazardClassificationId;
    }

    public String getHazardClassificationId() {
        return hazardClassificationId;
    }

    public void setPackagingDangerLevelCode(String packagingDangerLevelCode) {
        this.packagingDangerLevelCode = packagingDangerLevelCode;
    }

    public String getPackagingDangerLevelCode() {
        return packagingDangerLevelCode;
    }

    public void setPackingInstructionNumber(String packingInstructionNumber) {
        this.packingInstructionNumber = packingInstructionNumber;
    }

    public String getPackingInstructionNumber() {
        return packingInstructionNumber;
    }

    public void setProperShippingName(String properShippingName) {
        this.properShippingName = properShippingName;
    }

    public String getProperShippingName() {
        return properShippingName;
    }

    public void setSpecialProvisionId(String specialProvisionId) {
        this.specialProvisionId = specialProvisionId;
    }

    public String getSpecialProvisionId() {
        return specialProvisionId;
    }

    public void setTechnicalName(String technicalName) {
        this.technicalName = technicalName;
    }

    public String getTechnicalName() {
        return technicalName;
    }

    public void setUnNumber(String unNumber) {
        this.unNumber = unNumber;
    }

    public String getUnNumber() {
        return unNumber;
    }

}
