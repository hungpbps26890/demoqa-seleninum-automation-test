package com.demoqa.tests.alerts_frame_windows;

import com.demoqa.base.BaseTest;
import com.demoqa.pages.alerts_frame_windows.BrowserWindowsPage;
import com.demoqa.utilities.GetUtility;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WindowTest extends BaseTest {

    @Test
    public void testNewWindow() {
        //given
        BrowserWindowsPage browserWindowsPage = homePage.goToAlertsFrameWindows().clickBrowserWindows();

        //when
        browserWindowsPage.clickNewWindowButton();
        browserWindowsPage.switchToNewWindow();

        String actualURL = GetUtility.getURL();
        String expectedURL = "https://demoqa.com/sample";

        //then
        Assert.assertEquals(actualURL, expectedURL,
                "\nActual & Expected URLs Do Not Match\n");
    }
}
