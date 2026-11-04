package com.swag.pe.pages.validations;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ValidationPage extends PageObject {

    @FindBy(css = "[data-test='title']")
    protected WebElementFacade lbl_product;

    @FindBy(css = "h3[data-test='error']")
    protected WebElementFacade lbl_errorMessage;
}   
