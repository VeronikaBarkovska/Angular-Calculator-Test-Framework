package com.way2automation.pages.enums;

public enum OperatorEnum {
    ADDITION("+"),
    DIVISION("/"),
    MODULO("%"),
    MULTIPLICATION("*"),
    SUBTRACTION("-");
    private String name;

    OperatorEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
