package com.asalazargale.util;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
    /**
     * Initialize a WebDriver instance with ChromeOptions to use Brave Browser
     * If you want to use Chrome Browser, you can remove the ChromeOptions object and use ChromeDriver() instead
     * @return WebDriver instance
     */
    public static WebDriver initializeDriver() {
        ChromeOptions options = new ChromeOptions().setBinary("/Applications/Brave Browser.app/Contents/MacOS/Brave Browser");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }
}