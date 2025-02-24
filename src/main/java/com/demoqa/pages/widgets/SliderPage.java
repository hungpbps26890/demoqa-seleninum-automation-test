package com.demoqa.pages.widgets;

import com.demoqa.utilities.ActionsUtility;
import com.demoqa.utilities.GetUtility;
import org.openqa.selenium.By;

public class SliderPage extends WidgetsPage {

    private By slider = By.xpath("//div[@id='sliderContainer']//input[@type='range']");

    private By sliderValue = By.id("sliderValue");

    public void moveSlider(int x, int y) {
        ActionsUtility.dragAndDropBy(find(slider), x, y);
    }

    public String getSliderValue() {
        return GetUtility.getAttribute(sliderValue, "value");
    }
}
