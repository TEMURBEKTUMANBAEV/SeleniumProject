package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyboardAndMouseAction {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        driver.get("https://www.ebay.com");

        WebElement signInLink = driver.findElement(By.xpath("//span[@id='gh-ug']/a"));

        Actions action = new Actions(driver);

        action.keyDown(Keys.CONTROL).click(signInLink).keyUp(Keys.CONTROL).build().perform();
    }
}
