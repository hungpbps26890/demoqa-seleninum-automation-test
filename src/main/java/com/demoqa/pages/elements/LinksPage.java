package com.demoqa.pages.elements;

import org.openqa.selenium.By;

import static com.demoqa.utilities.JavaScriptUtility.scrollToElementJS;

public class LinksPage extends ElementsPage {

    private By badRequestLink = By.id("bad-request");

    private By linkResponse = By.id("linkResponse");

    public void clickBadRequestLink() {
        scrollToElementJS(badRequestLink);
        click(badRequestLink);
    }

    public String getLinkResponseResult() {
        delay(500);
        return find(linkResponse).getText();
    }
}
