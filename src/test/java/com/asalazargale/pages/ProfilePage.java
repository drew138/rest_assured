package com.asalazargale.pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage {
    private final WebDriverWait wait;

    @FindBy(xpath = "//button[@id='submit' and text()='Delete Account']")
    WebElement deleteAccountButton;

    public ProfilePage(WebDriver driver) {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void deleteAccount() {
        wait.until(ExpectedConditions.elementToBeClickable(deleteAccountButton)).click();
    }

    public void confirmDeleteAccount() {
       wait.until(ExpectedConditions.alertIsPresent()).accept();
    }
}
