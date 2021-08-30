package org.iata.cargo.codelists;

/**
 * Valid codes listed as enum - note that the {@link #code()} needs to be used to access the ONE Record code value.
 *
 * NOTE: This is not generated from the Ontology but hand-crafted!
 * NOTE: See https://github.com/IATA-Cargo/ONE-Record/issues/92 for "Standard values of enumerations"
 */
public enum MovementIndicatorCode {

    ACTUALARRIVAL("AA"),
    ACTUALDEPARTURE("AD"),
    ESTIMATEDARRIVAL("EA"),
    ESTIMATEDDEPARTURE("ED"),
    DELAYED("DL"),
    NEXTINFORMATION("NI"),
    SCHEDULEDARRIVAL("SA"),
    SCHEDULEDDEPARTURE("SD"),
    CANCELLATION("CN"),
    /** Note: subject to approval by IATA Cargo Service Conference (CSC) */
    DIVERSION("DV"),
    /** Note: subject to approval by IATA Cargo Service Conference (CSC) */
    DOCARRIVAL("DA"),
    /** Note: subject to approval by IATA Cargo Service Conference (CSC) */
    FORCERETURN("FR"),
    /** Note: subject to approval by IATA Cargo Service Conference (CSC) */
    RETURNTORAMP("RR"),
    ;

    private final String code;

    private MovementIndicatorCode(String code) {
        this.code = code;
    }

    public String code() {
        return code;
    }

}
