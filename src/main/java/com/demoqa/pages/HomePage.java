package com.demoqa.pages;

import com.demoqa.base.BasePage;
import com.demoqa.pages.forms.FormsPage;
import com.demoqa.utilities.JavaScriptUtility;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private By formsCard = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[3]/h5");

    public FormsPage goToFormsPage() {
        JavaScriptUtility.scrollToElementJS(formsCard);
        click(formsCard);
        return new FormsPage();
    }
}
