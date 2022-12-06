package org.iata.cargo.codelists;

public enum RegulatedEntityCategoryCode implements CodedEnum {
    AIRCRAFT_OPERATOR("AO"),
    KNOWN_CONSIGNOR("KC"),
    REGULATED_AGENT("RA"),
    REGULATED_CARRIER("RC")
    ;

    private final String code;

    private RegulatedEntityCategoryCode(String code) {
        this.code = code;
    }

    public String code() {
        return code;
    }

    public static RegulatedEntityCategoryCode getByCode(String code) {
        return CodedEnum.getByCode(values(), code);
    }

}
