package com.umitkirtil.demos.vaadinflow2neo4jspringsec.frontend.util.css;

public enum Display {

    BLOCK("block"), INLINE("inline"), FLEX("flex"), INLINE_FLEX("inline-flex");

    private String value;

    Display(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
