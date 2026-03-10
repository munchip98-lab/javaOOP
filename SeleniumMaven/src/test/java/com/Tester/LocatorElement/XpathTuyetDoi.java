package com.Tester.LocatorElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XpathTuyetDoi {
    public static void main(String[] args) throws InterruptedException {
        // Setup trình duyệt chrome
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize(); // Phóng to trình duyệt
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Set 1 giá trị timeout để chờ tìm kiếm element

        //Code auto
        driver.get("https://crm.anhtester.com/admin/authentication");// mở website
        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("admin@example.com");
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.className("btn")).click();
        Thread.sleep(1000);



        driver.quit(); //Tắt trình duyệt
    }
}
