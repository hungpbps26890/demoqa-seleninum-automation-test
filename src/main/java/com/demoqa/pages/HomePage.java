package com.demoqa.pages;

import com.demoqa.base.BasePage;
import com.demoqa.pages.elements.ElementsPage;
import com.demoqa.pages.forms.FormsPage;
import org.openqa.selenium.By;

import static com.demoqa.utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {

    private By formsCard = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[3]/h5");

    private By elementsCard = By.xpath("//div[@id='app']//h5[text()='Elements']");

    public FormsPage goToFormsPage() {
        scrollToElementJS(formsCard);
        click(formsCard);
        return new FormsPage();
    }

    public ElementsPage goToElementsPage() {
        scrollToElementJS(elementsCard);
        click(elementsCard);
        return new ElementsPage();
    }
}
