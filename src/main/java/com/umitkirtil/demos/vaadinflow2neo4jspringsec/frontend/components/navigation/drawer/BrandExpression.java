package com.umitkirtil.demos.vaadinflow2neo4jspringsec.frontend.components.navigation.drawer;

import com.umitkirtil.demos.vaadinflow2neo4jspringsec.frontend.util.UIUtils;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;

@CssImport("./styles/components/brand-expression.css")
public class BrandExpression extends Div {

    private String CLASS_NAME = "brand-expression";

    private Image logo;
    private Label title;

    public BrandExpression(String text) {
        setClassName(CLASS_NAME);

        logo = new Image(UIUtils.IMG_PATH + "logos/logo.png", "");
        logo.setAlt(text + " logo");
        logo.setClassName(CLASS_NAME + "__logo");

        title = UIUtils.createH3Label(text);
        title.addClassName(CLASS_NAME + "__title");

        add(logo, title);
    }

}
