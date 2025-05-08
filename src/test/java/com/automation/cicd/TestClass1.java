package com.automation.cicd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestClass1 {

    public static WebDriver driver;

    //launch driver
    @BeforeMethod
    public void launchDriver() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println("Driver launched successfully");
    }

    @Test
    public void Test1(){
        driver.get("https://www.google.com");
        System.out.println("Test 1 title : "+driver.getTitle());
        System.out.println("Test 1 title : "+driver.getTitle());
    }

    @Test
    public void Test2(){
        driver.get("https://www.google.com");
        System.out.println("Test 2 title : "+driver.getTitle());
        System.out.println("Test 2 title : "+driver.getTitle());
    }

    @Test
    public void Test3(){
        driver.get("https://www.google.com");
        System.out.println("Test 3 title : "+driver.getTitle());
        System.out.println("Test 2 title : "+driver.getTitle());
    }

    @AfterMethod
    public void closeDriver() {
        driver.quit();
        System.out.println("Driver closed successfully");
    }
}
