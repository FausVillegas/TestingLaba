package com.solvd.carina.demo;

import com.solvd.carina.demo.gui.twitch.components.Header;
import com.solvd.carina.demo.gui.twitch.components.LogInForm;
import com.solvd.carina.demo.gui.twitch.components.SignUpForm;
import com.solvd.carina.demo.gui.twitch.pages.HomePage;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.utils.R;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class WebTwitchTest implements IAbstractTest {
    @Test(dataProvider = "LogInUsers")
    public void logInTest(String name, String password) {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        LogInForm logInForm = homePage.getHeader().clickLogInButton();
        logInForm.typeUsername("fausv");
        logInForm.typePassword("password");
        logInForm.clickLogInButton();
        assertTrue(logInForm.isUsernameErrorMessagePresent(),"Username error message isn't present");
        assertTrue(logInForm.isPasswordErrorMessagePresent(),"Password error message isn't present");
    }

    @Test
    public void singUpTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();

        SignUpForm signUpForm = homePage.getHeader().clickSignUpButton();
        signUpForm.typeUsername("fausvsadsDASFFt");
        signUpForm.typePassword("3443FFF222");
        signUpForm.typeConfirmPassword("3443FFF222");

        signUpForm.selectBirthdayMonth("May");
        signUpForm.typeBirthdayDay(12);
        signUpForm.typeBirthdayYear(2004);

        signUpForm.typePhoneNumber(222222222);

        assertTrue(signUpForm.isUsernameUnavailableErrorPresent(),"Username error message isn't present");
        assertTrue(signUpForm.isPasswordErrorPresent(),"Password error message isn't present");
        assertTrue(signUpForm.isInvalidDateErrorPresent(),"Birth error message isn't present");

        signUpForm.clickSignUpButton();
    }

    @Test
    public void searchTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Header header = homePage.getHeader();
        header.typeSearchInput("csgo");
        header.clickSearchButton();
    }

    @Test
    public void darkThemeTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Header header = homePage.getHeader();
        header.clickUserMenuButton().clickThemeToggle();
        assertTrue(header.isDarkThemeActive(),"Dark theme isn't active");
        assertFalse(header.isDarkThemeActive(), "Dark theme is active");
    }

    @DataProvider(name = "LogInUsers")
    public Object[][] dataProvider() {
        return new Object[][] {
                {"faus","pass1"},
                {"juan","pass2"},
                {"ivan","pass3"},
        };
    }
}
