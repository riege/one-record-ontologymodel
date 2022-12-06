package org.iata.cargo.codelists;

public enum BillingChargeCode implements CodedEnum {
    CASS_INVOICE_AMOUNT("NI"),
    CASS_NET_AMOUNT("CN"),
    CHARGE_SUMMARY_TOTAL("CT"),
    COMMISSION("CO"),
    INSURANCE("IN"),
    SALES_INCENTIVE("SI"),
    TAXES("TX"),
    TOTAL_OTHER_CHARGES_DUE_AGENT("OA"),
    TOTAL_OTHER_CHARGES_DUE_CARRIER("OC"),
    TOTAL_WEIGHT_CHARGE("WT"),
    VALUATION_CHARGE("VC")
    ;

    private final String code;

    private BillingChargeCode(String code) {
        this.code = code;
    }

    public String code() {
        return code;
    }

    public static BillingChargeCode getByCode(String code) {
        return CodedEnum.getByCode(values(), code);
    }

}
