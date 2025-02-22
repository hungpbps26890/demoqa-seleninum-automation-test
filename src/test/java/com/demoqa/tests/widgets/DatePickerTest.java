package com.demoqa.tests.widgets;

import com.demoqa.base.BaseTest;
import com.demoqa.pages.widgets.DatePickerPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DatePickerTest extends BaseTest {

    @Test
    public void testDatePicker() {
        //given
        String month = "March",
                monthNumber = "03",
                year = "2025",
                day = "12";
        DatePickerPage datePickerPage = homePage.goToWidgetsPage().clickDatePicker();

        //when
        datePickerPage.clickDatePickerInput();
        datePickerPage.selectMonth(month);
        datePickerPage.selectYear(year);
        datePickerPage.clickDate(day);

        String actualDate = datePickerPage.getSelectedDate();
        String expectedDate = monthNumber + "/" + day + "/" + year;

        //then
        String message = "\nActual & Expected Dates Do Not Match" +
                "\nActual Date:   " + actualDate +
                "\nExpected Date: " + expectedDate + "\n";

        Assert.assertEquals(actualDate, expectedDate, message);
    }
}
