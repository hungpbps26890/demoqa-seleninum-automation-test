package com.demoqa.base;

import com.demoqa.pages.HomePage;
import com.demoqa.utilities.Utility;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BaseTest {

    private WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
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

    @AfterMethod
    public void takeFailedTestScreenshot(ITestResult testResult) {
        if (ITestResult.FAILURE == testResult.getStatus()) {
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File source = screenshot.getScreenshotAs(OutputType.FILE);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss");
            String now = LocalDateTime.now().format(formatter);
            String fileName = "(" + now + ")_" + testResult.getName() + ".png";

            File destination = new File(
                    System.getProperty("user.dir")
                            + "/resources/screenshots/"
                            + fileName
            );

            try {
                FileHandler.copy(source, destination);

                System.out.println("Screenshot Located At: " + destination);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @AfterClass
    public void tearDown() {
        basePage.delay(2000);
        driver.quit();
    }
}
