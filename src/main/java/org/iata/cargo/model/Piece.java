
package org.iata.cargo.model;

import java.io.Serializable;
import java.util.Set;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLObjectProperty;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraint;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraints;
import cz.cvut.kbss.jopa.model.annotations.Types;
import io.swagger.annotations.ApiModelProperty;
import org.iata.cargo.Vocabulary;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Individual piece or virtual grouping of pieces
 * 
 * This class was generated by OWL2Java 0.16.4
 * 
 */
@OWLClass(iri = Vocabulary.s_c_Piece)
public class Piece
    extends LogisticsObject
    implements Serializable
{

    @Types
    @JsonProperty("@type")
    @ApiModelProperty(allowableValues = Vocabulary.s_c_Piece)
    protected Set<String> types;

    /**
     * Reference to the item(s) contained in the piece
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_containedItems)
    @JsonProperty(Vocabulary.s_p_containedItems)
    protected Set<Item> containedItems;
    /**
     * Details of contained piece(s)
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_containedPieces)
    @JsonProperty(Vocabulary.s_p_containedPieces)
    protected Set<Piece> containedPieces;
    /**
     * Customs details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_customsInfo)
    @JsonProperty(Vocabulary.s_p_customsInfo)
    protected Set<CustomsInfo> customsInfo;
    /**
     * Dimensions details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_dimensions_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_dimensions_A)
    protected Dimensions dimensions;
    /**
     * Reference documents details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_externalReferences)
    @JsonProperty(Vocabulary.s_p_externalReferences)
    protected Set<ExternalReference> externalReferences;
    /**
     * Weight details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_grossWeight)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1),
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, min = 1, max = -1)
    })
    @JsonProperty(Vocabulary.s_p_grossWeight)
    protected Value grossWeight;
    /**
     * Other piece identification ( e.g. Shipping Marks, Seal)
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_otherIdentifiers_A_A)
    @JsonProperty(Vocabulary.s_p_otherIdentifiers_A_A)
    protected Set<OtherIdentifier> otherIdentifiers;
    /**
     * Other party company details - e.g. the party to be notified
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_otherParty)
    @JsonProperty(Vocabulary.s_p_otherParty)
    protected Set<Company> otherParty;
    /**
     * Packaging details 
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_packagingType)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_packagingType)
    protected PackagingType packagingType;
    /**
     * Other party company details - e.g. the party to be notified
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_parties_A_A)
    @JsonProperty(Vocabulary.s_p_parties_A_A)
    protected Set<Party> parties;
    /**
     * Product of the piece, mandatory when there are no items
     * 
     */
    @JsonProperty(Vocabulary.s_p_product_A_A)
    @OWLObjectProperty(iri = Vocabulary.s_p_product_A_A)
    protected Set<Product> product;
    /**
     * Goods production country, mandatory when there are no Items
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_productionCountry_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_productionCountry_A)
    protected Country productionCountry;
    /**
     * Security details of the piece
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_securityDeclaration)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_securityDeclaration)
    protected SecurityDeclaration securityDeclaration;
    /**
     * Security details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_securityStatus)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_securityStatus)
    protected SecurityDeclaration securityStatus;
    /**
     * Security requests
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_serviceRequest)
    @JsonProperty(Vocabulary.s_p_serviceRequest)
    protected Set<ServiceRequest> serviceRequest;
    /**
     * Shipment on which the piece is assigned to
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_shipment)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_shipment)
    protected Shipment shipment;
    /**
     * Shipper company details - e.g. the party shipping the piece
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_shipper_A_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_shipper_A_A)
    protected Company shipper;
    /**
     * Special Handling details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_specialHandling)
    @JsonProperty(Vocabulary.s_p_specialHandling)
    protected Set<SpecialHandling> specialHandling;
    /**
     * Transport Movements on which the piece is transported
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_transportMovements)
    @JsonProperty(Vocabulary.s_p_transportMovements)
    protected Set<TransportMovement> transportMovements;
    /**
     * Segment related to the transport status
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_transportSegments)
    @JsonProperty(Vocabulary.s_p_transportSegments)
    protected Set<TransportSegment> transportSegments;
    /**
     * ULD on which the (virtual) piece has been loaded into - URIs of the ULD
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_uldReference)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_uldReference)
    protected ULD uldReference;
    /**
     * Volumetric weight details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_volumetricWeight)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, min = 1, max = -1),
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_volumetricWeight)
    protected VolumetricWeight volumetricWeight;
    /**
     * Coload indicator for the pieces (boolean)
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_coload)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#boolean", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_coload)
    protected Boolean coload;
    /**
     * The value of a shipment declared for carriage purposes , NVD if no value declared
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_declaredValueForCarriage)
    @JsonProperty(Vocabulary.s_p_declaredValueForCarriage)
    protected Set<String> declaredValueForCarriage;
    /**
     * The value of a shipment declared for customs purposes , NVD if no value declared
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_declaredValueForCustoms)
    @JsonProperty(Vocabulary.s_p_declaredValueForCustoms)
    protected Set<String> declaredValueForCustoms;
    /**
     * General goods description
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_goodsDescription)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1),
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", min = 1, max = -1)
    })
    @JsonProperty(Vocabulary.s_p_goodsDescription)
    protected String goodsDescription;
    /**
     * Specify how the piece will be delivered (bulk or ULD)
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_loadType)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_loadType)
    protected String loadType;
    /**
     * When no value is declared for Carriage, this field may be completed with the value TRUE otherwise FALSE
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_nvdForCarriage)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#boolean", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_nvdForCarriage)
    protected Boolean nvdForCarriage;
    /**
     * When no value is declared for Customs, this field may be completed with the value TRUE otherwise FALSE
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_nvdForCustoms)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#boolean", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_nvdForCustoms)
    protected Boolean nvdForCustoms;
    /**
     * Reference identifying how the package is marked. Field is hardcode to "SSCC-18", "UPC" or "Other"
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_packageMarkCoded)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_packageMarkCoded)
    protected String packageMarkCoded;
    /**
     * SSCC-18 code for the value of the package mark, company or bar code, free text, pallet code, etc.
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_packagedeIdentifier)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_packagedeIdentifier)
    protected String packagedeIdentifier;
    /**
     * Shipping marks
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_shippingMarks)
    @JsonProperty(Vocabulary.s_p_shippingMarks)
    protected Set<String> shippingMarks;
    /**
     * Shipper's Load And Count  ( total contained piece count as provided by shipper)
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_slac)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#integer", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_slac)
    protected Integer slac;
    /**
     * Stackable indicator for the pieces (boolean)
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_stackable)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#boolean", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_stackable)
    protected Boolean stackable;
    /**
     * Turnable indicator for the pieces (boolean)
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_turnable)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#boolean", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_turnable)
    protected Boolean turnable;
    /**
     * Unique Piece Identifier (UPID) of the piece. Refer IATA Recommended Practice 1689
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_upid_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_upid_A)
    protected String upid;

    public void setContainedItems(Set<Item> containedItems) {
        this.containedItems = containedItems;
    }

    public Set<Item> getContainedItems() {
        return containedItems;
    }

    public void setContainedPieces(Set<Piece> containedPieces) {
        this.containedPieces = containedPieces;
    }

    public Set<Piece> getContainedPieces() {
        return containedPieces;
    }

    public void setCustomsInfo(Set<CustomsInfo> customsInfo) {
        this.customsInfo = customsInfo;
    }

    public Set<CustomsInfo> getCustomsInfo() {
        return customsInfo;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setExternalReferences(Set<ExternalReference> externalReferences) {
        this.externalReferences = externalReferences;
    }

    public Set<ExternalReference> getExternalReferences() {
        return externalReferences;
    }

    public void setGrossWeight(Value grossWeight) {
        this.grossWeight = grossWeight;
    }

    public Value getGrossWeight() {
        return grossWeight;
    }

    public void setOtherIdentifiers(Set<OtherIdentifier> otherIdentifiers) {
        this.otherIdentifiers = otherIdentifiers;
    }

    public Set<OtherIdentifier> getOtherIdentifiers() {
        return otherIdentifiers;
    }

    public void setOtherParty(Set<Company> otherParty) {
        this.otherParty = otherParty;
    }

    public Set<Company> getOtherParty() {
        return otherParty;
    }

    public void setPackagingType(PackagingType packagingType) {
        this.packagingType = packagingType;
    }

    public PackagingType getPackagingType() {
        return packagingType;
    }

    public void setParties(Set<Party> parties) {
        this.parties = parties;
    }

    public Set<Party> getParties() {
        return parties;
    }

    public void setProduct(Set<Product> product) {
        this.product = product;
    }

    public Set<Product> getProduct() {
        return product;
    }

    public void setProductionCountry(Country productionCountry) {
        this.productionCountry = productionCountry;
    }

    public Country getProductionCountry() {
        return productionCountry;
    }

    public void setSecurityDeclaration(SecurityDeclaration securityDeclaration) {
        this.securityDeclaration = securityDeclaration;
    }

    public SecurityDeclaration getSecurityDeclaration() {
        return securityDeclaration;
    }

    public void setSecurityStatus(SecurityDeclaration securityStatus) {
        this.securityStatus = securityStatus;
    }

    public SecurityDeclaration getSecurityStatus() {
        return securityStatus;
    }

    public void setServiceRequest(Set<ServiceRequest> serviceRequest) {
        this.serviceRequest = serviceRequest;
    }

    public Set<ServiceRequest> getServiceRequest() {
        return serviceRequest;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipper(Company shipper) {
        this.shipper = shipper;
    }

    public Company getShipper() {
        return shipper;
    }

    public void setSpecialHandling(Set<SpecialHandling> specialHandling) {
        this.specialHandling = specialHandling;
    }

    public Set<SpecialHandling> getSpecialHandling() {
        return specialHandling;
    }

    public void setTransportMovements(Set<TransportMovement> transportMovements) {
        this.transportMovements = transportMovements;
    }

    public Set<TransportMovement> getTransportMovements() {
        return transportMovements;
    }

    public void setTransportSegments(Set<TransportSegment> transportSegments) {
        this.transportSegments = transportSegments;
    }

    public Set<TransportSegment> getTransportSegments() {
        return transportSegments;
    }

    public void setUldReference(ULD uldReference) {
        this.uldReference = uldReference;
    }

    public ULD getUldReference() {
        return uldReference;
    }

    public void setVolumetricWeight(VolumetricWeight volumetricWeight) {
        this.volumetricWeight = volumetricWeight;
    }

    public VolumetricWeight getVolumetricWeight() {
        return volumetricWeight;
    }

    public void setCoload(Boolean coload) {
        this.coload = coload;
    }

    public Boolean getCoload() {
        return coload;
    }

    public void setDeclaredValueForCarriage(Set<String> declaredValueForCarriage) {
        this.declaredValueForCarriage = declaredValueForCarriage;
    }

    public Set<String> getDeclaredValueForCarriage() {
        return declaredValueForCarriage;
    }

    public void setDeclaredValueForCustoms(Set<String> declaredValueForCustoms) {
        this.declaredValueForCustoms = declaredValueForCustoms;
    }

    public Set<String> getDeclaredValueForCustoms() {
        return declaredValueForCustoms;
    }

    public void setGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription;
    }

    public String getGoodsDescription() {
        return goodsDescription;
    }

    public void setLoadType(String loadType) {
        this.loadType = loadType;
    }

    public String getLoadType() {
        return loadType;
    }

    public void setNvdForCarriage(Boolean nvdForCarriage) {
        this.nvdForCarriage = nvdForCarriage;
    }

    public Boolean getNvdForCarriage() {
        return nvdForCarriage;
    }

    public void setNvdForCustoms(Boolean nvdForCustoms) {
        this.nvdForCustoms = nvdForCustoms;
    }

    public Boolean getNvdForCustoms() {
        return nvdForCustoms;
    }

    public void setPackageMarkCoded(String packageMarkCoded) {
        this.packageMarkCoded = packageMarkCoded;
    }

    public String getPackageMarkCoded() {
        return packageMarkCoded;
    }

    public void setPackagedeIdentifier(String packagedeIdentifier) {
        this.packagedeIdentifier = packagedeIdentifier;
    }

    public String getPackagedeIdentifier() {
        return packagedeIdentifier;
    }

    public void setShippingMarks(Set<String> shippingMarks) {
        this.shippingMarks = shippingMarks;
    }

    public Set<String> getShippingMarks() {
        return shippingMarks;
    }

    public void setSlac(Integer slac) {
        this.slac = slac;
    }

    public Integer getSlac() {
        return slac;
    }

    public void setStackable(Boolean stackable) {
        this.stackable = stackable;
    }

    public Boolean getStackable() {
        return stackable;
    }

    public void setTurnable(Boolean turnable) {
        this.turnable = turnable;
    }

    public Boolean getTurnable() {
        return turnable;
    }

    public void setUpid(String upid) {
        this.upid = upid;
    }

    public String getUpid() {
        return upid;
    }

    public Set<String> getTypes() {
        return types;
    }

    public void setTypes(Set<String> types) {
        this.types = types;
    }
}
