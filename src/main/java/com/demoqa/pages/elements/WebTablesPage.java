package com.demoqa.pages.elements;

import org.openqa.selenium.By;

public class WebTablesPage extends ElementsPage {

    private By registerFormAgeField = By.id("age");
    private By submitButton = By.id("submit");

    public void clickEdit(String email) {
        String xpath = "//div[text()='" + email + "']//following::span[@title='Edit']";
        By edit = By.xpath(xpath);
        click(edit);
    }

    public void setAge(String age) {
        setText(registerFormAgeField, age);
    }

    public void clickSubmit() {
        click(submitButton);
    }

    public String getTableAge(String email) {
        String xpath = "//div[text()='" + email + "']//preceding::div[1]";
        By tableAge = By.xpath(xpath);
        return find(tableAge).getText();
    }
}
