package com.demoqa.tests.widgets;

import com.demoqa.base.BaseTest;
import com.demoqa.pages.widgets.SliderPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SliderTest extends BaseTest {

    @Test
    public void testSlider() {
        //given
        int x = 180;
        int y = 0;

        SliderPage sliderPage = homePage.goToWidgetsPage().clickSlider();

        //when
        sliderPage.moveSlider(x, y);

        String actualValue = sliderPage.getSliderValue();
        String expectedValue = "85";

        //then
        Assert.assertEquals(actualValue, expectedValue,
                "\nActual & Expected Value Do Not Match\n");
    }
}
