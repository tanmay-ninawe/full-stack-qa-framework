package com.introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {
    public static void main(String[] args) {
       
        //Invoking Browser

    //Method 1 - Using System.setProperty --> has to give the local browser driver path
        //System.setProperty("webdriver.chrome.driver", "C:\\Switch\\Git-course\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver ();

    //Method 2 - Using WebDriverManager --> no need to give the local browser driver path, it will automatically download the driver using WebDriverManager and seth the path.
        WebDriver driver = new ChromeDriver (); 
        driver.get("https://www.google.com");
    }
}