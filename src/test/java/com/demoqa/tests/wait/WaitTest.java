package com.demoqa.tests.wait;

import com.demoqa.base.BaseTest;
import com.demoqa.pages.elements.DynamicPropertiesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaitTest extends BaseTest {

    @Test
    public void testVisibleAfterButton() {
        //given
        DynamicPropertiesPage dynamicPropertiesPage = homePage.goToElementsPage().clickDynamicProperties();

        //when
        String actualText = dynamicPropertiesPage.getVisibleAfterButtonText();
        String expectedText = "Visible After 5 Seconds";

        //given
        Assert.assertEquals(actualText, expectedText,
                "\nActual & Expected Text Do Not Match\n");
    }
}
