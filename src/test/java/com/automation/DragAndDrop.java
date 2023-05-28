package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class DragAndDrop {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));

        driver.switchTo().frame(iframe);

        List<WebElement> images = driver.findElements(By.xpath("//ul[@id='gallery']/li/img"));

        WebElement elementToDrop = driver.findElement(By.xpath("//div[@id='trash']"));

        Actions action = new Actions(driver);

        for (WebElement image : images) {
            action.pause(1000).dragAndDrop(image, elementToDrop).build().perform();
        }
    }
}
