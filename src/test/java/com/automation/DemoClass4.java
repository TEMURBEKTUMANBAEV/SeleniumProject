package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoClass4 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


//  1. Open Website
        driver.get("https://opensource-demo.orangehrmlive.com/");

// 2. Get Username and password from website
        WebElement usernameValue = driver.findElement(By.xpath("//p[text()='Username : Admin']"));
        WebElement passwordValue = driver.findElement(By.xpath("//p[text()='Password : admin123']"));

        String username = usernameValue.getText().split(":")[1].trim();
        String password = passwordValue.getText().split(":")[1].trim();

// 3. Login with same username and password
        WebElement usernameInput = driver.findElement(By.name("username"));
        WebElement passwordInput = driver.findElement(By.name("password"));
        WebElement loginBtn = driver.findElement(By.xpath("//button[contains(@class,'login-button')]"));

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();




    }
}
