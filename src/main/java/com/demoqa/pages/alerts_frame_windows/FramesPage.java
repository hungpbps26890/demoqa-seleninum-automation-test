package com.demoqa.pages.alerts_frame_windows;

import com.demoqa.utilities.JavaScriptUtility;
import com.demoqa.utilities.WaitUtility;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.demoqa.utilities.JavaScriptUtility.scrollToElementJS;
import static com.demoqa.utilities.SwitchToUtility.*;

public class FramesPage extends AlertsFrameWindowsPage {

    private By headerFramesText = By.xpath("//div[@id='app']//h1[text()='Frames']");

    private By sampleHeadingInFrame = By.xpath("/html/body/h1");

    private By iFrameBigBox = By.xpath("//div[@id='frame1Wrapper']/iframe");

    public String getHeaderFramesText() {
        switchToDefaultContent();
        scrollToElementJS(headerFramesText);
        return find(headerFramesText).getText();
    }

    public String getSampleHeadingInBigBox() {
        WaitUtility.implicitWait(2);

        scrollToElementJS(iFrameBigBox);
        switchToFrameWebElement(find(iFrameBigBox));

        return find(sampleHeadingInFrame).getText();
    }
}
