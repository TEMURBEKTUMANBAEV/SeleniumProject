package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.ebay.com/");


        WebElement electronicsLink = driver.findElement(By.xpath("//li/a[text()='Electronics']"));
        WebElement appleLink = driver.findElement(By.xpath("//ul/li/a[text()='Apple']"));

        Actions action = new Actions(driver);

        action.moveToElement(electronicsLink).pause(1000).click(appleLink).build().perform();
    }
}
