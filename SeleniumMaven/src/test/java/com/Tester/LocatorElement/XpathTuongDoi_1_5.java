package com.Tester.LocatorElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XpathTuongDoi_1_5 {
    public static void main(String[] args) {
        WebDriver driver;
        driver =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");

        driver.findElement(By.xpath("//imput[@type = 'email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//imput[@type = 'password']")).sendKeys("123456");
        driver.findElement(By.xpath("//imput[@type = 'submit']")).click();

        driver.quit();
    }
}
