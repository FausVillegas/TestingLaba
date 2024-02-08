package com.solvd.carina.demo.gui.twitch.pages;

import com.solvd.carina.demo.gui.twitch.components.Header;
import com.zebrunner.carina.utils.R;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {
    @FindBy(xpath = "//nav[@data-a-target='top-nav-container']")
    private Header header;
    public HomePage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(R.CONFIG.get("url"));
    }
    public Header getHeader() {
        return header;
    }
}
