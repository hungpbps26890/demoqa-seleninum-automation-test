package com.demoqa.tests.alerts_frame_windows;

import com.demoqa.base.BaseTest;
import com.demoqa.pages.alerts_frame_windows.AlertsPage;
import com.demoqa.utilities.SwitchToUtility;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTest extends BaseTest {

    @Test
    public void testInformationAlert() throws InterruptedException {
        //given
        AlertsPage alertsPage = homePage.goToAlertsFrameWindows().clickAlerts();

        //when
        alertsPage.clickInformationAlertButton();

        String actualAlertText = SwitchToUtility.getAlertText();
        String expectedAlertText = "You clicked a button";

        //then
        Assert.assertEquals(actualAlertText, expectedAlertText,
                "\nActual & Expected Alert Text Do Not Match\n");

        SwitchToUtility.acceptAlert();
    }

    @Test
    public void testConfirmationAlert() {
        //given
        AlertsPage alertsPage = homePage.goToAlertsFrameWindows().clickAlerts();

        //when
        alertsPage.clickConfirmationButton();
        SwitchToUtility.dismissAlert();

        String actualResult = alertsPage.getConfirmationResult();
        String expectedResult = "You selected Cancel";

        //then
        Assert.assertEquals(actualResult, expectedResult,
                "\nActual & Expected Result Do Not Match\n");
    }

    @Test
    public void testPromptAlert() {
        //given
        String text = "Hello, World!";

        AlertsPage alertsPage = homePage.goToAlertsFrameWindows().clickAlerts();

        //when
        alertsPage.clickPromptAlertButton();
        SwitchToUtility.setAlertText(text);
        SwitchToUtility.acceptAlert();

        String actualText = alertsPage.getPromptResult();
        String expectedText = "You entered " + text;

        //then
        Assert.assertEquals(actualText, expectedText,
                "\nActual & Expected Text Do Not Match\n");
    }
}
