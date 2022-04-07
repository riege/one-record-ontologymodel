package org.iata.cargo.codelists;

/**
 * Refers to the type of handling information provided:
 *
 * Special Service Request (SSR),
 * Special Handling Codes (SPH) or
 * Other Service Information (OSI)
 *
 */
public enum HandlingInstructionsServiceType {

    SPH("SPH"),
    SSR("SSR"),
    OSI("OSI")
    ;

    private final String code;

    private HandlingInstructionsServiceType(String code) {
        this.code = code;
    }

    public String code() {
        return code;
    }
}
