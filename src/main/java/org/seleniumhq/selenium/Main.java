package org.seleniumhq.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args)  {

        //System.out.println("Hello world!");

        //CHROME
        // System.setProperty("webdriver.chrome.driver", "D:/Project/Selenium/BrowserDrivers/chrome/chromedriver.exe");
        //WebDriver driver = new ChromeDriver();

        //FIREFOX
        //System.setProperty("webdriver.gecko.driver", "D:\\Project\\Selenium\\BrowserDrivers\\firefox64\\geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();

        //EDGE
        System.setProperty("webdriver.edge.driver", "D:\\Project\\Selenium\\BrowserDrivers\\edge\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();



        //RETAIN THIS PART
        driver.get("https://rahulshettyacademy.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.quit();

    }
}