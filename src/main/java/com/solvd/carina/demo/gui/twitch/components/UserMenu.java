package com.solvd.carina.demo.gui.twitch.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class UserMenu extends AbstractUIObject {
    @FindBy(css = "*[data-a-target=\"dark-mode-toggle\"]>input")
    private ExtendedWebElement darkThemeInput;

    public UserMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public UserMenu(WebDriver driver) {
        super(driver);
    }

    public void clickThemeToggle() {
        darkThemeInput.click();
    }
}
