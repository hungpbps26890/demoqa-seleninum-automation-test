package com.demoqa.pages.alerts_frame_windows;

import org.openqa.selenium.By;

public class AlertsPage extends AlertsFrameWindowsPage {

    private By informationAlertButton = By.id("alertButton");

    private By confirmationAlertButton = By.id("confirmButton");

    private By confirmationResult = By.id("confirmResult");

    private By promptAlertButton = By.id("promtButton");

    private By promptResult = By.id("promptResult");

    public void clickInformationAlertButton() {
        click(informationAlertButton);
    }

    public void clickConfirmationButton() {
        click(confirmationAlertButton);
    }

    public String getConfirmationResult() {
        return find(confirmationResult).getText();
    }

    public void clickPromptAlertButton() {
        click(promptAlertButton);
    }

    public String getPromptResult() {
        return find(promptResult).getText();
    }
}
