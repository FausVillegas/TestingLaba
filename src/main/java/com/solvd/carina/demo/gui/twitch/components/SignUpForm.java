package com.solvd.carina.demo.gui.twitch.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SignUpForm extends AbstractUIObject {
    @FindBy(xpath = "//p[text()=\"This username is unavailable.\"]")
    private ExtendedWebElement usernameUnavailableError;

    @FindBy(xpath = "//p[text()=\"Passwords must be at least 8 characters long.\"]")
    private ExtendedWebElement shortPasswordError;

    @FindBy(xpath = "//p[text()=\"That name is fairly common, so add characters or words.\"]")
    private ExtendedWebElement commonPasswordError;

    @FindBy(xpath = "//p[text()=\"Passwords do not match. Please try again\"]")
    private ExtendedWebElement passwordsNotMatchError;

    @FindBy(xpath = "//p[text()=\"Please enter a valid date.\"]")
    private ExtendedWebElement invalidDateError;

    @FindBy(xpath = "//input[@id=\"signup-username\"]")
    private ExtendedWebElement usernameInput;

    @FindBy(xpath = "//input[@id='password-input']")
    private ExtendedWebElement passwordInput;

    @FindBy(xpath = "//input[@id=\"password-input-confirmation\"]")
    private ExtendedWebElement passwordInputConfirmation;

    @FindBy(xpath = "//select[@data-a-target='birthday-month-select']")
    private ExtendedWebElement birthdayMonthSelect;

    @FindBy(xpath = "//input[@placeholder=\"Day\" or @placeholder=\"Día\"]")
    private ExtendedWebElement birthdayDayInput;

    @FindBy(xpath = "//input[@placeholder=\"Year\" or @placeholder=\"Año\"]")
    private ExtendedWebElement birthdayYearInput;

    @FindBy(xpath = "//input[@id=\"phone-input\"]")
    private ExtendedWebElement phoneInput;

    @FindBy(xpath = "//button[@screen=\"signup_form\"]")
    private ExtendedWebElement signUpButton;

    @FindBy(xpath = "//*[@data-a-target=\"segmented-signup-next-button\"]")
    private ExtendedWebElement signupNextButton;

    public SignUpForm(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public SignUpForm(WebDriver driver) {
        super(driver);
    }

    public void typeUsername(String username) {
        usernameInput.type(username);
    }
    public void typePassword(String password) {
        passwordInput.type(password);
    }

    public void typeConfirmPassword(String password) {
        passwordInputConfirmation.type(password);
    }

    public void selectBirthdayMonth(String month) {
        birthdayMonthSelect.select(month);
    }

    public void typeBirthdayDay(int day) {
        birthdayDayInput.type(String.valueOf(day));
    }

    public void typeBirthdayYear(int year) {
        birthdayYearInput.type(String.valueOf(year));
    }

    public void typePhoneNumber(long number) {
        phoneInput.type(String.valueOf(number));
    }

    public void clickSignUpButton(){
        signUpButton.click();
    }

    public void clickSignUpNextButton(){
        signupNextButton.click();
    }

    //Error messages

    public boolean isUsernameUnavailableErrorPresent() {
        return usernameUnavailableError.isElementPresent();
    }

    public boolean isPasswordErrorPresent() {
        return shortPasswordError.isElementPresent() || commonPasswordError.isElementPresent() || passwordsNotMatchError.isElementPresent();
    }

    public boolean isInvalidDateErrorPresent() {
        return invalidDateError.isElementPresent();
    }
}
