package com.demoqa.pages.widgets;

import org.openqa.selenium.By;

import static com.demoqa.utilities.DropDownUtility.selectByVisibleText;

public class DatePickerPage extends WidgetsPage {

    private By datePickerInput = By.id("datePickerMonthYearInput");

    private By monthSelect = By.className("react-datepicker__month-select");

    private By yearSelect = By.className("react-datepicker__year-select");

    public void clickDatePickerInput() {
        click(datePickerInput);
    }

    public void selectMonth(String month) {
        selectByVisibleText(monthSelect, month);
    }

    public void selectYear(String year) {
        selectByVisibleText(yearSelect, year);
    }

    public By dayLocator(String day) {
        String xpath = "//div[contains(@class, 'react-datepicker__day')][text()='" + day + "']";
        return By.xpath(xpath);
    }

    public boolean isDateInMonth(String day) {
        return find(dayLocator(day)).isDisplayed();
    }

    public void clickDate(String day) {
        click(dayLocator(day));
    }

    public String getSelectedDate() {
        return find(datePickerInput).getAttribute("value");
    }
}
