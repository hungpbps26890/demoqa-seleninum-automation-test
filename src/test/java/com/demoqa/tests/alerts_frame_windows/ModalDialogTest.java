package com.demoqa.tests.alerts_frame_windows;

import com.demoqa.base.BaseTest;
import com.demoqa.pages.alerts_frame_windows.ModalDialogsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ModalDialogTest extends BaseTest {

    @Test
    public void testSmallModalDialog() {
        //given
        String expectedText = "This is a big modal. It has very less content";

        ModalDialogsPage modalDialogsPage = homePage.goToAlertsFrameWindows().clickModalDialogs();

        //when
        modalDialogsPage.clickSmallModalButton();
        String actualText = modalDialogsPage.getSmallModalText();

        //then
        Assert.assertEquals(actualText, expectedText,
                "\nActual & Expected Text Do Not Match\n");

        modalDialogsPage.clickSmallModalCloseButton();
    }
}
