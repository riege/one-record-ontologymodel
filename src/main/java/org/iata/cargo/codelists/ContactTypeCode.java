package org.iata.cargo.codelists;

/**
 * Valid codes listed as enum - note that the {@link #code()} needs to be used to access the ONE Record code value.
 *
 * NOTE: This is not generated from the Ontology but hand-crafted!
 * NOTE: See https://github.com/IATA-Cargo/ONE-Record/issues/92 for "Standard values of enumerations"
 */
public enum ContactTypeCode {

    EMAIL("Email address"),
    FAX("Fax number"),
    PHONE("Phone number"),
    TELEX("Telex"),
    WEB("Website"),
    ALTERNATE_EMAIL("Alternate email address"),
    ALTERNATE_PHONE("Alternate phone number"),
    ;

    private final String code;

    private ContactTypeCode(String code) {
        this.code = code;
    }

    public String code() {
        return code;
    }

}
