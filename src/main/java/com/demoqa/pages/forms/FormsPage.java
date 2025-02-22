package com.demoqa.pages.forms;

import com.demoqa.pages.HomePage;
import com.demoqa.utilities.JavaScriptUtility;
import org.openqa.selenium.By;

public class FormsPage extends HomePage {

    private By practiceFormMenuItem = By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[2]/div/ul/li/span");

    public PracticeFormPage clickPracticeForm() {
        JavaScriptUtility.scrollToElementJS(practiceFormMenuItem);
        click(practiceFormMenuItem);
        return new PracticeFormPage();
    }
}
