package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllegroTestingApp {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\Chrome\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.ebay.com/");

        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='gdpr-banner-accept']"))).click();


        WebElement inputField = driver.findElement(By.name("_nkw"));
        wait.until(ExpectedConditions.visibilityOf(inputField));
        inputField.sendKeys("Mavic mini");


        WebElement categoryField = driver.findElement(By.xpath("//select[@id=\"gh-cat\"]"));
        Select categorySelect = new Select(categoryField);
        categorySelect.selectByIndex(6);

        inputField.submit();

    }
}