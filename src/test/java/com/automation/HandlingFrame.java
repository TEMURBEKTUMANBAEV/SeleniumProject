package com.automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingFrame {
    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//
//        driver.get("https://the-internet.herokuapp.com/iframe");
//
//
//        WebElement iFrame = driver.findElement(By.id("mce_0_ifr"));
//
//        // Switch to iframe
//        driver.switchTo().frame(iFrame);
//
//        WebElement textBox = driver.findElement(By.id("tinymce"));
//        textBox.clear();
//        textBox.sendKeys("Phone");


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");


        WebElement button = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        button.click();

        Alert alert = driver.switchTo().alert();

        System.out.println(alert.getText());
        alert.sendKeys("Hello");
        Thread.sleep(3000);
        alert.accept();
        // alert.dismiss();

    }
}
