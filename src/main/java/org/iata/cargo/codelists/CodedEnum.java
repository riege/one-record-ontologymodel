package org.iata.cargo.codelists;

public interface CodedEnum {
    String code();

    public static <T extends CodedEnum> T getByCode(T[] values, String code) {
        for (T candidate: values) {
            if (candidate.code().equals(code)) {
                return candidate;
            }
        }
        return null;
    }
}
