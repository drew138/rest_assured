package com.asalazargale.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProfilePage extends BasePage {
    @FindBy(xpath = "//button[@id='submit' and text()='Delete Account']")
    WebElement deleteAccountButton;
    @FindBy(xpath = "//button[@id='closeSmallModal-ok' and text()='OK']")
    WebElement confirmDeletelButton;

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    public void deleteAccount() {
        wait.until(ExpectedConditions.elementToBeClickable(deleteAccountButton)).click();
    }

    public void confirmDeleteAccount() {
        wait.until(ExpectedConditions.elementToBeClickable(confirmDeletelButton)).click();
        wait.until(ExpectedConditions.alertIsPresent()).accept();
    }
}
