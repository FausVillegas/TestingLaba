package com.solvd.carina.demo.gui.twitch.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Header extends AbstractUIObject {

    @FindBy(xpath = "//*[contains(@class,'tw-root--theme-dark')]")
    private ExtendedWebElement darkThemePage;

    @FindBy(xpath = "//button[@data-a-target='login-button']")
    private ExtendedWebElement logInButton;

    @FindBy(xpath = "//button[@data-a-target='signup-button']")
    private ExtendedWebElement signUpButton;

    @FindBy(xpath = "//*[text()=\"Log in to Twitch\"]/../../../../../../../..")
    private LogInForm logInForm;

    @FindBy(xpath = "//*[text()=\"Join Twitch today\"]/../../../../../../../..")
    private SignUpForm signUpForm;

    @FindBy(xpath = "//input[@id=\"tw-83e47923c5910b1425cbe7a7fb0681d7\"]")
    private ExtendedWebElement searchInput;

    @FindBy(xpath = "//button[@aria-label=\"Search Button\"]")
    private ExtendedWebElement searchButton;

    @FindBy(xpath = "//button[@aria-label=\"User Menu\"]")
    private ExtendedWebElement userMenuButton;

    @FindBy(css = "div[aria-label=\"User Menu Options\"]")
    private UserMenu userMenu;

    public Header(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public LogInForm clickLogInButton(){
        logInButton.click();
        return logInForm;
    }

    public SignUpForm clickSignUpButton(){
        signUpButton.click();
        return signUpForm;
    }

    public void typeSearchInput(String input) {
        searchInput.type(input);
    }

    public void clickSearchButton () {
        searchButton.click();
    }

    public UserMenu clickUserMenuButton() {
        userMenuButton.click();
        return userMenu;
    }

    public boolean isDarkThemeActive () {
        return darkThemePage.isElementPresent();
    }

    public ExtendedWebElement getLogInButton() {
        return logInButton;
    }

    public LogInForm getLogInForm() {
        return logInForm;
    }

    public ExtendedWebElement getDarkThemePage() {
        return darkThemePage;
    }

    public ExtendedWebElement getSignUpButton() {
        return signUpButton;
    }

    public SignUpForm getSignUpForm() {
        return signUpForm;
    }

    public ExtendedWebElement getSearchInput() {
        return searchInput;
    }

    public ExtendedWebElement getSearchButton() {
        return searchButton;
    }

    public ExtendedWebElement getUserMenuButton() {
        return userMenuButton;
    }

    public UserMenu getUserMenu() {
        return userMenu;
    }
}
