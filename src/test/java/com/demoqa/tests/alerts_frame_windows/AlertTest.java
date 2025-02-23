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
}
