package com.demoqa.pages.alerts_frame_windows;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static com.demoqa.utilities.JavaScriptUtility.scrollToElementJS;

public class AlertsFrameWindowsPage extends HomePage {

    private By modalDialogsMenuItem = By.xpath("//li[@id='item-4']//span[text()='Modal Dialogs']");

    public ModalDialogsPage clickModalDialogs() {
        scrollToElementJS(modalDialogsMenuItem);
        click(modalDialogsMenuItem);
        return new ModalDialogsPage();
    }
}
