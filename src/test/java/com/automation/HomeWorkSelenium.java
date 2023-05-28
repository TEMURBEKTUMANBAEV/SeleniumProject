package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HomeWorkSelenium {


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.saucedemo.com/");
        WebElement userName = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement buttonLogin = driver.findElement(By.id("login-button"));
        userName.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        buttonLogin.click();
        WebElement buttonAddCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        buttonAddCart.click();
        WebElement buttonCart = driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a"));
        buttonCart.click();
        WebElement buttonCheckout = driver.findElement(By.id("checkout"));
        buttonCheckout.click();
        WebElement firstName = driver.findElement(By.id("first-name"));
        WebElement lastName = driver.findElement(By.id("last-name"));
        WebElement zipCode = driver.findElement(By.id("postal-code"));
        firstName.sendKeys("Tumanbaev");
        lastName.sendKeys("Temurbek");
        zipCode.sendKeys("19467");
        WebElement buttonContinue = driver.findElement(By.id("continue"));
        buttonContinue.click();
        WebElement total = driver.findElement(By.xpath("// div [@class='summary_info_label summary_total_label']"));
        System.out.println(total.getText());
        WebElement buttonFinish = driver.findElement(By.id("finish"));
        buttonFinish.click();
        WebElement confirmationMessage = driver.findElement(By.xpath("// div [@id='checkout_complete_container']/h2"));
        WebElement confirmationMessage1 = driver.findElement(By.xpath("// div [@id='checkout_complete_container']/div"));
        System.out.println(confirmationMessage.getText());
        System.out.println(confirmationMessage1.getText());
        driver.manage().window().minimize();
    }
}

