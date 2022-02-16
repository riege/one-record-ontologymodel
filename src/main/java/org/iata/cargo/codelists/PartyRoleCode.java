package org.iata.cargo.codelists;

/**
 * Valid codes listed as enum - note that the {@link #code()} needs to be used to access the ONE Record code value.
 *
 * NOTE: This is not generated from the Ontology but hand-crafted!
 * NOTE: See https://github.com/IATA-Cargo/ONE-Record/issues/92 for "Standard values of enumerations"
 */
public enum PartyRoleCode {

    AGT("Agent"),
    AIRLINE("Airline"),
    AIRPORT("Airport Authority"),
    BROKER("Broker"),
    /** Use COMMISSIONABLE_AGENT instead */
    @Deprecated COMMISSIONABLEAGENT("Commissionable Agent"),
    COMMISSIONABLE_AGENT("Commissionable Agent"),
    CNE("Consignee"),
    CUSTOMS("Customs"),
    DECLARANT("Declarant"),
    DECONSOLIDATOR("Deconsolidator"),
    FFW("Freight Forwarder"),
    GHA("Ground Handling Agent"),
    NOM("Nominated freight company"),
    NFY("Notify Party"),
    OPI("Other Participant Identifier"),
    POSTOFFICE("Post Office"),
    SHP("Shipper"),
    TRUCKER("Trucker"),
    ;

    private final String code;

    private PartyRoleCode(String code) {
        this.code = code;
    }

    public String code() {
        return code;
    }

}
