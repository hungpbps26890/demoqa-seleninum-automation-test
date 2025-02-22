package com.demoqa.pages.widgets;

import org.openqa.selenium.By;

import java.util.List;

import static com.demoqa.utilities.DropDownUtility.*;
import static com.demoqa.utilities.JavaScriptUtility.scrollToElementJS;

public class SelectMenuPage extends WidgetsPage {

    private By standardMultiSelect = By.id("cars");

    public void select(String text) {
        scrollToElementJS(standardMultiSelect);
        selectByVisibleText(standardMultiSelect, text);
    }

    public void select(int index) {
        scrollToElementJS(standardMultiSelect);
        selectByIndex(standardMultiSelect, index);
    }

    public void deselect(String value) {
        scrollToElementJS(standardMultiSelect);
        deselectByValue(standardMultiSelect, value);
    }

    public List<String> getAllSelectedMultiOptions() {
        return getAllSelectedOptions(standardMultiSelect);
    }
}
