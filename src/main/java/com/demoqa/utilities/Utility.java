package com.demoqa.utilities;

import com.demoqa.base.BasePage;
import org.openqa.selenium.WebDriver;

public class Utility {

    public static WebDriver driver;

    public static void setUtilityDriver() {
        driver = BasePage.driver;
    }
}
