package com.demoqa.tests.forms;

import com.demoqa.base.BaseTest;
import com.demoqa.pages.forms.PracticeFormPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxTest extends BaseTest {

    @Test
    public void testCheckbox() {
        //given
        PracticeFormPage practiceFormPage = homePage.goToFormsPage().clickPracticeForm();

        //when
        practiceFormPage.selectSportsHobbyCheckbox();
        practiceFormPage.selectReadingHobbyCheckbox();
        practiceFormPage.selectMusicHobbyCheckbox();

        practiceFormPage.deselectReadingHobbyCheckbox();

        boolean actualIsReadingHobbyCheckboxSelected = practiceFormPage.isReadingHobbyCheckboxSelected();

        //then
        String message = "\nReading Checkbox Is Selected\n";

        Assert.assertFalse(actualIsReadingHobbyCheckboxSelected, message);
    }
}
