package com.demoqa.base;

import com.demoqa.pages.HomePage;
import com.demoqa.utilities.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    private WebDriver driver;
    private BasePage basePage;
    private HomePage homePage;
    private final String URL = "https://demoqa.com/";

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void loadApplication() {
        driver.get(URL);

        basePage = new BasePage();
        basePage.setDriver(driver);

        homePage = new HomePage();

        Utility.setUtilityDriver();
    }

    @AfterClass
    public void tearDown() {
        basePage.delay(2000);
        driver.quit();
    }
}
