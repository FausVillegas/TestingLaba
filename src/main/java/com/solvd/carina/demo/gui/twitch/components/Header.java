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

    @FindBy(xpath = "//*[@data-a-target=\"passport-modal\"]")
    private LogInForm logInForm;

    @FindBy(xpath = "//*[@data-a-target=\"passport-modal\"]")
    private SignUpForm signUpForm;

//    @FindBy(xpath = "//input[@id=\"tw-83e47923c5910b1425cbe7a7fb0681d7\" or ]")
    @FindBy(xpath = "//*[@aria-label=\"Entrada de búsqueda\"]")
    private ExtendedWebElement searchInput;

    @FindBy(xpath = "//*[@icon=\"NavSearch\"]")
    private ExtendedWebElement searchButton;

    @FindBy(xpath = "//button[@aria-label=\"User Menu\" or @aria-label=\"Menú de usuario\"]")
    private ExtendedWebElement userMenuButton;

//    @FindBy(css = "div[data-popper-placement=\"bottom-end\"]")
    @FindBy(xpath = "//div[@data-popper-placement=\"bottom-end\"]")
    private UserMenu userMenu;

    public Header(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public Header(WebDriver driver) {
        super(driver);
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

    public SignUpForm getSignUpForm() {
        return signUpForm;
    }

    public UserMenu getUserMenu() {
        return userMenu;
    }
}
