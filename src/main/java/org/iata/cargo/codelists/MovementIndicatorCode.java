package org.iata.cargo.codelists;

/**
 * Valid codes listed as enum - note that the {@link #code()} needs to be used to access the ONE Record code value.
 *
 * NOTE: This is not generated from the Ontology but hand-crafted!
 * NOTE: See https://github.com/IATA-Cargo/ONE-Record/issues/92 for "Standard values of enumerations"
 */
public enum MovementIndicatorCode {

    /** Use ACTUAL_ARRIVAL instead */
    @Deprecated ACTUALARRIVAL("AA"),
    ACTUAL_ARRIVAL("AA"),
    /** Use ACTUAL_DEPARTURE instead */
    @Deprecated ACTUALDEPARTURE("AD"),
    ACTUAL_DEPARTURE("AD"),
    /** Use ESTIMATED_ARRIVAL instead */
    @Deprecated ESTIMATEDARRIVAL("EA"),
    ESTIMATED_ARRIVAL("EA"),
    /** Use ESTIMATED_DEPARTURE instead */
    @Deprecated ESTIMATEDDEPARTURE("ED"),
    ESTIMATED_DEPARTURE("ED"),
    DELAYED("DL"),
    /** Use NEXT_INFORMATION instead */
    @Deprecated NEXTINFORMATION("NI"),
    NEXT_INFORMATION("NI"),
    /** Use SCHEDULED_ARRIVAL instead */
    @Deprecated SCHEDULEDARRIVAL("SA"),
    SCHEDULED_ARRIVAL("SA"),
    /** Use SCHEDULED_DEPARTURE instead */
    @Deprecated SCHEDULEDDEPARTURE("SD"),
    SCHEDULED_DEPARTURE("SD"),
    CANCELLATION("CN"),
    /** Note: subject to approval by IATA Cargo Service Conference (CSC) */
    DIVERSION("DV"),
    /** Use DOC_ARRIVAL instead */
    @Deprecated DOCARRIVAL("DA"),
    /** Note: subject to approval by IATA Cargo Service Conference (CSC) */
    DOC_ARRIVAL("DA"),
    /** Use FORCE_RETURN instead */
    @Deprecated FORCERETURN("FR"),
    /** Note: subject to approval by IATA Cargo Service Conference (CSC) */
    FORCE_RETURN("FR"),
    /** Use RETURN_TO_RAMP instead */
    @Deprecated RETURNTO_RAMP("RR"),
    /** Note: subject to approval by IATA Cargo Service Conference (CSC) */
    RETURN_TO_RAMP("RR"),
    ;

    private final String code;

    private MovementIndicatorCode(String code) {
        this.code = code;
    }

    public String code() {
        return code;
    }

}
