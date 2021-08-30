
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
 * Unit Load Device details
 * 
 * This class was generated by OWL2Java 0.16.4
 * 
 */
@OWLClass(iri = Vocabulary.s_c_ULD)
public class ULD
    extends LogisticsObject
    implements Serializable
{

    @Types
    @JsonProperty("@type")
    @ApiModelProperty(allowableValues = Vocabulary.s_c_ULD)
    protected Set<String> types;

    /**
     * Reference documents details 
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_externalReference)
    @JsonProperty(Vocabulary.s_p_externalReference)
    protected Set<ExternalReference> externalReference;
    /**
     * Tare weight of the empty ULD
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_tareWeight)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_tareWeight)
    protected Value tareWeight;
    /**
     * Transport Movements on which the ULD are transported
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_transportMovements_A)
    @JsonProperty(Vocabulary.s_p_transportMovements_A)
    protected Set<TransportMovement> transportMovements;
    /**
     * Segment related to the ULD movement
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_transportSegments_A)
    @JsonProperty(Vocabulary.s_p_transportSegments_A)
    protected Set<TransportSegment> transportSegments;
    /**
     * Details of contained (virtual) piece(s)
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_upid)
    @JsonProperty(Vocabulary.s_p_upid)
    protected Set<Piece> upid;
    /**
     * US / ATA Unit Load Device type code e.g. M2
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_ataDesignator)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_ataDesignator)
    protected String ataDesignator;
    /**
     * Indicates if the ULD is Damaged
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_damageFlag)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#boolean", max = 1),
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#boolean", min = 1, max = -1)
    })
    @JsonProperty(Vocabulary.s_p_damageFlag)
    protected Boolean damageFlag;
    /**
     * Contains three designator of demurrage code, refer to RP 1654 (BCC, HHH, XXX, ZZZ)
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_demurrageCode)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", min = 1, max = -1),
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_demurrageCode)
    protected String demurrageCode;
    /**
     * ULD height or loading limitation code. Refer CXML Code List 1.47,  e.g. R - ULD Height above 244 centimetres
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_loadingIndicator)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_loadingIndicator)
    protected String loadingIndicator;
    /**
     * Number of doors
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_nbDoor)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#integer", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_nbDoor)
    protected Integer nbDoor;
    /**
     * Number of fittings
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_nbFittings)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#integer", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_nbFittings)
    protected Integer nbFittings;
    /**
     * Number of nets
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_nbNets)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#integer", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_nbNets)
    protected Integer nbNets;
    /**
     * Number of straps
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_nbStraps)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#integer", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_nbStraps)
    protected Integer nbStraps;
    /**
     * Contains two designator codes of ODLN or Operational Damage Limit Notices. ODLN code is used to define type of damage after visually check the serviceability of ULDs section 7, Standard Specifications 40/3 or 40/4 in ULD Regulations
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_odlnCode)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_odlnCode)
    protected String odlnCode;
    /**
     * Owner code of the ULD in aa, an or na format - owner can be an airline or leasing company
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_ownerCode)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_ownerCode)
    protected String ownerCode;
    /**
     * ULD serial number
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_serialNumber)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_serialNumber)
    protected String serialNumber;
    /**
     * Designator of serviceablity condition e.g. SER or DAM 
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_serviceabilityCode)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", min = 1, max = -1),
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_serviceabilityCode)
    protected String serviceabilityCode;
    /**
     * Remarks or Supplement Information
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_uldRemarks)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_uldRemarks)
    protected String uldRemarks;
    /**
     * ULD seal number if applicable
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_uldSealNumber)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_uldSealNumber)
    protected String uldSealNumber;
    /**
     * Standard Unit Load Device type code e.g. AKE - Certified Container - Contoured
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_uldTypeCode)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_uldTypeCode)
    protected String uldTypeCode;

    public void setExternalReference(Set<ExternalReference> externalReference) {
        this.externalReference = externalReference;
    }

    public Set<ExternalReference> getExternalReference() {
        return externalReference;
    }

    public void setTareWeight(Value tareWeight) {
        this.tareWeight = tareWeight;
    }

    public Value getTareWeight() {
        return tareWeight;
    }

    public void setTransportMovements(Set<TransportMovement> transportMovements) {
        this.transportMovements = transportMovements;
    }

    public Set<TransportMovement> getTransportMovements() {
        return transportMovements;
    }

    @Deprecated
    public void setTransportSegments(Set<TransportSegment> transportSegments) {
        this.transportSegments = transportSegments;
    }

    @Deprecated
    public Set<TransportSegment> getTransportSegments() {
        return transportSegments;
    }

    public void setUpid(Set<Piece> upid) {
        this.upid = upid;
    }

    public Set<Piece> getUpid() {
        return upid;
    }

    public void setAtaDesignator(String ataDesignator) {
        this.ataDesignator = ataDesignator;
    }

    public String getAtaDesignator() {
        return ataDesignator;
    }

    public void setDamageFlag(Boolean damageFlag) {
        this.damageFlag = damageFlag;
    }

    public Boolean getDamageFlag() {
        return damageFlag;
    }

    public void setDemurrageCode(String demurrageCode) {
        this.demurrageCode = demurrageCode;
    }

    public String getDemurrageCode() {
        return demurrageCode;
    }

    public void setLoadingIndicator(String loadingIndicator) {
        this.loadingIndicator = loadingIndicator;
    }

    public String getLoadingIndicator() {
        return loadingIndicator;
    }

    public void setNbDoor(Integer nbDoor) {
        this.nbDoor = nbDoor;
    }

    public Integer getNbDoor() {
        return nbDoor;
    }

    public void setNbFittings(Integer nbFittings) {
        this.nbFittings = nbFittings;
    }

    public Integer getNbFittings() {
        return nbFittings;
    }

    public void setNbNets(Integer nbNets) {
        this.nbNets = nbNets;
    }

    public Integer getNbNets() {
        return nbNets;
    }

    public void setNbStraps(Integer nbStraps) {
        this.nbStraps = nbStraps;
    }

    public Integer getNbStraps() {
        return nbStraps;
    }

    public void setOdlnCode(String odlnCode) {
        this.odlnCode = odlnCode;
    }

    public String getOdlnCode() {
        return odlnCode;
    }

    public void setOwnerCode(String ownerCode) {
        this.ownerCode = ownerCode;
    }

    public String getOwnerCode() {
        return ownerCode;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setServiceabilityCode(String serviceabilityCode) {
        this.serviceabilityCode = serviceabilityCode;
    }

    public String getServiceabilityCode() {
        return serviceabilityCode;
    }

    public void setUldRemarks(String uldRemarks) {
        this.uldRemarks = uldRemarks;
    }

    public String getUldRemarks() {
        return uldRemarks;
    }

    public void setUldSealNumber(String uldSealNumber) {
        this.uldSealNumber = uldSealNumber;
    }

    public String getUldSealNumber() {
        return uldSealNumber;
    }

    public void setUldTypeCode(String uldTypeCode) {
        this.uldTypeCode = uldTypeCode;
    }

    public String getUldTypeCode() {
        return uldTypeCode;
    }

    public Set<String> getTypes() {
        return types;
    }

    public void setTypes(Set<String> types) {
        this.types = types;
    }

}
