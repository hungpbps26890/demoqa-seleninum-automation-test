package com.demoqa.pages.elements;

import com.demoqa.utilities.JavaScriptUtility;
import com.demoqa.utilities.WaitUtility;
import org.openqa.selenium.By;

public class DynamicPropertiesPage extends ElementsPage {

    private By visibleAfterButton = By.id("visibleAfter");

    public String getVisibleAfterButtonText() {
        WaitUtility.explicitWaitUntilVisible(5, visibleAfterButton);
        JavaScriptUtility.scrollToElementJS(visibleAfterButton);
        return find(visibleAfterButton).getText();
    }
}
