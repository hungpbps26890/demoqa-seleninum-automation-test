package com.demoqa.pages.alerts_frame_windows;

import org.openqa.selenium.By;

public class AlertsPage extends AlertsFrameWindowsPage {

    private By informationAlertButton = By.id("alertButton");

    public void clickInformationAlertButton() {
        click(informationAlertButton);
    }
}
