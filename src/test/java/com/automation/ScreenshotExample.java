package com.automation;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class ScreenshotExample {
    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        driver.get("https://www.google.com/");


        TakesScreenshot ts = (TakesScreenshot)driver;
        File screenshot = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("target//screenshot.png"));
    }
}
