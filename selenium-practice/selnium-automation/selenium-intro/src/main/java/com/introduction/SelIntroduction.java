package com.introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {
    public static void main(String[] args) throws InterruptedException {
       
    //Invoking Browser
    //Method 1 - Using System.setProperty --> has to give the local browser driver path
        //System.setProperty("webdriver.chrome.driver", "C:\\Switch\\Git-course\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver ();

    //Method 2 - Using WebDriverManager --> no need to give the local browser driver path, it will automatically download the driver using WebDriverManager and seth the path.    
        WebDriver driver = new ChromeDriver ();  // Chromebrowser driver
        // WebDriver driver = new FirefoxDriver (); //Firefox browser driver
        // WebDriver driver = new EdgeDriver ();  //Edge browser driver
        // WebDriver driver = new SafariDriver ();  //Safari browser driver
        // WebDriver driver = new OperaDriver ();  //Opera browser driver

        driver.get("https://www.amazon.in/");

         // Wait for page to fully load
        Thread.sleep(3000);

    //get the title of the page
        System.out.println(driver.getTitle());

    //get the current URL of the page
        System.out.println(driver.getCurrentUrl());

    //close the browser only the current tab.
        driver.close();

    //quit the browser like close but it will also close the background process of the browser
        driver.quit();
    }
}
