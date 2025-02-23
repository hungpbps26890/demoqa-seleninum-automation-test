package com.demoqa.pages.alerts_frame_windows;

import org.openqa.selenium.By;

public class ModalDialogsPage extends AlertsFrameWindowsPage {

    private By smallModalButton = By.id("showSmallModal");

    private By smallModalText = By.xpath("//div[contains(text(), 'small modal')]");

    private By smallModalCloseButton = By.id("closeSmallModal");

    public void clickSmallModalButton() {
        click(smallModalButton);
    }

    public String getSmallModalText() {
        return find(smallModalText).getText();
    }

    public void clickSmallModalCloseButton() {
        click(smallModalCloseButton);
    }
}
