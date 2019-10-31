package com.umitkirtil.demos.vaadinflow2neo4jspringsec.frontend.util.css.lumo;

public enum BadgeSize {

    S("small"), M("medium");

    private String style;

    BadgeSize(String style) {
        this.style = style;
    }

    public String getThemeName() {
        return style;
    }

}
