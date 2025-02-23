package com.demoqa.tests.alerts_frame_windows;

import com.demoqa.base.BaseTest;
import com.demoqa.pages.alerts_frame_windows.FramesPage;
import com.demoqa.utilities.SwitchToUtility;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FrameTest extends BaseTest {

    @Test
    public void testBigFrame() {
        //given
        FramesPage framesPage = homePage.goToAlertsFrameWindows().clickFrames();

        //when
        String actualSampleHeadingInBigFrame = framesPage.getSampleHeadingInBigBox();
        String expectedSampleHeadingInBigFrame = "This is a sample page";

        String actualHeaderFramesText = framesPage.getHeaderFramesText();
        String expectedHeaderFramesText = "Frames";

        //then
        Assert.assertEquals(actualSampleHeadingInBigFrame, expectedSampleHeadingInBigFrame,
                "\nActual & Expected Sample Headings In Frame Do Not Match\n");

        Assert.assertEquals(actualHeaderFramesText, expectedHeaderFramesText,
                "\n Actual & Expected Header Text Do Not Match \n");
    }
}
