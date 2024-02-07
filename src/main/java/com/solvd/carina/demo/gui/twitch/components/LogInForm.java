package com.solvd.carina.demo.gui.twitch.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LogInForm extends AbstractUIObject {
    @FindBy(xpath = "//input[@id=\"login-username\"]")
    private ExtendedWebElement usernameInput;

    @FindBy(xpath = "//input[@id='password-input']")
    private ExtendedWebElement passwordInput;

    @FindBy(xpath = "//button[@data-a-target=\"passport-login-button\"]")
    private ExtendedWebElement logInButton;

    @FindBy(xpath = "//*[text()='This username does not exist.']/../..")
    private ExtendedWebElement usernameErrorMessage;

    @FindBy(xpath = "//*[text()='That password was incorrect. Please try again.']/../..")
    private ExtendedWebElement passwordErrorMessage;

    protected LogInForm(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void typeUsername(String username) {
        usernameInput.type(username);
    }
    public void typePassword(String password) {
        passwordInput.type(password);
    }

    public void clickLogInButton() {
        logInButton.click();
    }

    public boolean isUsernameErrorMessagePresent() {
        return usernameErrorMessage.isElementPresent();
    }

    public boolean isPasswordErrorMessagePresent() {
        return passwordErrorMessage.isElementPresent();
    }

    public ExtendedWebElement getUsernameInput() {
        return usernameInput;
    }

    public ExtendedWebElement getPasswordInput() {
        return passwordInput;
    }

    public ExtendedWebElement getLogInButton() {
        return logInButton;
    }

    public ExtendedWebElement getUsernameErrorMessage() {
        return usernameErrorMessage;
    }

    public ExtendedWebElement getPasswordErrorMessage() {
        return passwordErrorMessage;
    }
}