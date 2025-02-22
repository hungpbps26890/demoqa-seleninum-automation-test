package com.demoqa.tests.forms;

import com.demoqa.base.BaseTest;
import com.demoqa.pages.forms.PracticeFormPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest {

    @Test
    public void testRadioButton() {
        //given
        PracticeFormPage practiceFormPage = homePage.goToFormsPage().clickPracticeForm();

        //when
        practiceFormPage.clickFemaleRadioButton();

        boolean actualIsFemaleRadioButtonSelected = practiceFormPage.isFemaleRadioButtonSelected();

        //then
        String message = "\nFemale Radio Button Is Not Selected\n";

        Assert.assertTrue(actualIsFemaleRadioButtonSelected, message);
    }
}
