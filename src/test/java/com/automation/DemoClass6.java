package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoClass6 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // 1. Открываем веб-сайт
        driver.get("https://auth-react-node.netlify.app/login");

        // 2. Получаем имя пользователя (username) и пароль (password) с веб-сайта
        WebElement usernameInput = driver.findElement(By.cssSelector("input[placeholder='Username']"));
        WebElement passwordInput = driver.findElement(By.cssSelector("input[placeholder='Password']"));

        String username = "Elcho911";
        String password = "pass12345";


        // 3. Входим с использованием имени пользователя и пароля
        WebElement loginBtn = driver.findElement(By.xpath("//button[contains(@class,'button')]"));

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();

        // Дополнительные действия после входа (если необходимо)

        WebElement signOutBtn = driver.findElement(By.className("_btn_q2jfc_29"));
        signOutBtn.click();
    }
}
