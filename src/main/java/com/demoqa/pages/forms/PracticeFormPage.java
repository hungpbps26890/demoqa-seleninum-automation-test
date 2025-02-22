package com.demoqa.pages.forms;

import com.demoqa.utilities.JavaScriptUtility;
import org.openqa.selenium.By;

public class PracticeFormPage extends FormsPage {

    private By femaleRadioButton = By.xpath("//*[@id=\"gender-radio-2\"]");

    public void clickFemaleRadioButton() {
        JavaScriptUtility.scrollToElementJS(femaleRadioButton);
        JavaScriptUtility.clickJS(femaleRadioButton);
    }

    public boolean isFemaleRadioButtonSelected() {
        return find(femaleRadioButton).isSelected();
    }
}
