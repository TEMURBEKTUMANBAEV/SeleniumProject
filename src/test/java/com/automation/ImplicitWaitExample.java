package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaitExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        driver.get("https://www.minted.com");
        WebElement button = driver.findElement(By.id("bx-element-2192445-Gu64MsV-input"));
        button.sendKeys("Hello! I got you");
    }

}
