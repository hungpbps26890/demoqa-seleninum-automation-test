package com.demoqa.tests.elements;

import com.demoqa.base.BaseTest;
import com.demoqa.pages.elements.LinksPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinkTest extends BaseTest {

    @Test
    public void testLink() {
        //given
        String expectedStatus = "400";
        String expectedStatusText = "Bad Request";

        LinksPage linksPage = homePage.goToElementsPage().clickLinks();

        //when
        linksPage.clickBadRequestLink();

        String actualLinkResponseResult = linksPage.getLinkResponseResult();

        //then
        String message = "\nActual Response ("
                + actualLinkResponseResult + ")\n"
                + " Does Not Contains " + expectedStatus + " and " + expectedStatusText + "\n";

        boolean condition = actualLinkResponseResult.contains(expectedStatus)
                && actualLinkResponseResult.contains(expectedStatusText);

        Assert.assertTrue(condition, message);
    }
}
