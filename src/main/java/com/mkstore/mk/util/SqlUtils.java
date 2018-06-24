package com.mkstore.mk.util;

public class SqlUtils {
    public static String LIKE(String condition) {
        return "%" + condition + "%";
    }

    public static String LIKEFRONT(String condition) {
        return "%" + condition;
    }

    public static String LIKEBEHIND(String condition) {
        return condition + "%";
    }
}
