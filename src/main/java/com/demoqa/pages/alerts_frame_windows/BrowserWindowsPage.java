package com.demoqa.pages.alerts_frame_windows;

import org.openqa.selenium.By;

import java.util.Set;

import static com.demoqa.utilities.GetUtility.*;
import static com.demoqa.utilities.SwitchToUtility.*;

public class BrowserWindowsPage extends AlertsFrameWindowsPage {

    private By newWindowButton = By.id("windowButton");

    public void clickNewWindowButton() {
        click(newWindowButton);
    }

    public void switchToNewWindow() {
        //Step 1: Get the current "Main" window handle
        String currentHandle = getWindowHandle();

        //Step 2: Get all handles
        Set<String> allHandles = getWindowHandles();

        //Step 3:Switch to the "New" window using the window handle
        for (String handle : allHandles) {
            if (handle != currentHandle) {
                switchToWindow(handle);
            }
        }
    }
}
