package com.demoqa.pages.forms;

import org.openqa.selenium.By;

import static com.demoqa.utilities.JavaScriptUtility.*;

public class PracticeFormPage extends FormsPage {

    private By femaleRadioButton = By.xpath("//*[@id=\"gender-radio-2\"]");

    private By sportsHobbyCheckbox = By.xpath("//*[@id=\"hobbies-checkbox-1\"]");

    private By readingHobbyCheckbox = By.xpath("//*[@id=\"hobbies-checkbox-2\"]");

    private By musicHobbyCheckbox = By.xpath("//*[@id=\"hobbies-checkbox-3\"]");

    public void clickFemaleRadioButton() {
        scrollToElementJS(femaleRadioButton);
        clickJS(femaleRadioButton);
    }

    public boolean isFemaleRadioButtonSelected() {
        return find(femaleRadioButton).isSelected();
    }

    public void selectSportsHobbyCheckbox() {
        if (!find(sportsHobbyCheckbox).isSelected()) {
            scrollToElementJS(sportsHobbyCheckbox);
            clickJS(sportsHobbyCheckbox);
        }
    }

    public void selectReadingHobbyCheckbox() {
        if (!find(readingHobbyCheckbox).isSelected()) {
            scrollToElementJS(readingHobbyCheckbox);
            clickJS(readingHobbyCheckbox);
        }
    }

    public void selectMusicHobbyCheckbox() {
        if (!find(musicHobbyCheckbox).isSelected()) {
            scrollToElementJS(musicHobbyCheckbox);
            clickJS(musicHobbyCheckbox);
        }
    }

    public void deselectReadingHobbyCheckbox() {
        if (find(readingHobbyCheckbox).isSelected()) {
            scrollToElementJS(readingHobbyCheckbox);
            clickJS(readingHobbyCheckbox);
        }
    }

    public boolean isReadingHobbyCheckboxSelected() {
        return find(readingHobbyCheckbox).isSelected();
    }
}
