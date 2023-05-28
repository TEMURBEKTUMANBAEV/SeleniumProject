package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class DemoClass5 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();



        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        driver.get("https://www.ebay.com/");

        WebElement dropdown = driver.findElement(By.id("gh-cat"));


        Select catDropdown = new Select(dropdown);


        catDropdown.selectByVisibleText("Baby");
        catDropdown.selectByIndex(12);
        catDropdown.selectByValue("58058");

        List<WebElement> listOfOptions = catDropdown.getOptions();
        for(WebElement option : listOfOptions){
            System.out.println(option.getText());
        }


    }
}
