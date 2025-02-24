package com.demoqa.pages.widgets;

import org.openqa.selenium.By;

import static com.demoqa.utilities.GetUtility.*;
import static com.demoqa.utilities.WaitUtility.*;

public class ProgressBarPage extends WidgetsPage {

    private By startStopButton = By.id("startStopButton");

    private By progressBarValue = By.xpath("//div[@id='progressBar']/div[@aria-valuenow='100']");

    public void clickStartStopButton() {
        click(startStopButton);
    }

    public String getProgressBarValue() {
        fluentWaitVisible(30, progressBarValue);
        return getText(progressBarValue);
    }
}
