package demo_nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NopCommerce {

    public static void main(String[] args) {
        //Launch the browser(How to launch the webbrowser
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2/";
        //Open the URL in web browser
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        // Getting Title for URL
        String title = driver.getTitle();
        System.out.println(title);
        //Gettring Curent URL
        System.out.println("Current URL : " + driver.getCurrentUrl());
        System.out.println("");
        driver.manage().window().maximize();
        System.out.println("Page Source : " + driver.getPageSource());//To get page source
        //Enter the email to email field
        WebElement emailfield = driver.findElement(By.id("Email"));
        emailfield.sendKeys("Prime123@gmail.com");
        //Find the password element
        WebElement password = driver.findElement(By.name("Password"));
        password.sendKeys("Prime123");

        //closing Browser
         driver.close();


    }

}
