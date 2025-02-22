package com.demoqa.tests.widgets;

import com.demoqa.base.BaseTest;
import com.demoqa.pages.widgets.SelectMenuPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SelectMenuTest extends BaseTest {

    @Test
    public void testMultiSelect() {
        //given
        String volvo = "Volvo", saab = "Saab", opel = "Opel", audi = "Audi";

        SelectMenuPage selectMenuPage = homePage.goToWidgetsPage().clickSelectMenu();

        //when
        selectMenuPage.select(volvo);
        selectMenuPage.select(1);
        selectMenuPage.select(opel);
        selectMenuPage.select(3);

        selectMenuPage.deselect(volvo.toLowerCase());

        List<String> actualSelectedOptions = selectMenuPage.getAllSelectedMultiOptions();

        //then
        Assert.assertFalse(actualSelectedOptions.contains(volvo),
                "\nVolvo Is Selected\n");

        Assert.assertTrue(actualSelectedOptions.contains(saab));
        Assert.assertTrue(actualSelectedOptions.contains(opel));
        Assert.assertTrue(actualSelectedOptions.contains(audi));
    }
}
