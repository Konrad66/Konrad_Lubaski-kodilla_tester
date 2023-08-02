package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class KodillaStorePom {
    /*

    @FindBy(css = "input[name='search']")
    WebElement searchField;

    //@FindBy(css = "input[type='submit']")


    @FindBy(className = "cookies-submit btn btn-primary")
    WebElement submitButton;

    WebDriver driver;
    public KodillaStorePom() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        PageFactory.initElements(driver, this);

        driver.navigate().to("https://kodilla.com/pl/test/store");

    }

    public void setSubmitButton() throws InterruptedException {
        Thread.sleep(2000);
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='cookies-submit btn btn-primary']"))).click();
        submitButton.click();
    }

    public void search(String phrase) {
        searchField.sendKeys(phrase);
        searchField.submit();
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("my_Class")));
    }


     */




    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver;
        driver = new ChromeDriver(chromeOptions);
        PageFactory.initElements(driver, KodillaStorePom.class);

        driver.navigate().to("https://kodilla.com/pl/test/store");

        try {
            driver.get("https://kodilla.com/pl/test/store");

            WebElement searchBox = driver.findElement(By.name("search"));

            searchBox.sendKeys("NoteBook");

            searchBox.submit();

            Thread.sleep(5000);

            boolean searchResultsContainNotebook = driver.getPageSource().contains("NoteBook");

            if (searchResultsContainNotebook) {
                System.out.println("Wyniki wyszukiwania zawierają frazę \"NoteBook\".");
            } else {
                System.out.println("Wyniki wyszukiwania nie zawierają frazy \"NoteBook\".");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            //driver.quit();
        }
    }
}
