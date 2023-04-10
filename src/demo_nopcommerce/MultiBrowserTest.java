package demo_nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {

    static String browser = "Chrome";

    static WebDriver driver;
    static String baseurl = "https://demo.nopcommerce.com/login?returnUrl=%2/";

    public static void main(String[] args) {
        //If and else if statements
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }
        driver.get(baseurl);
        driver.manage().window().maximize();
        //Get the title of the page with the method of Get()
        String title = driver.getTitle();
        System.out.println(title);
        //get the Current URL
        System.out.println("Current URL : " + driver.getCurrentUrl());
        //Get the current page source
        System.out.println("Page Source : " + driver.getPageSource());
        //Find the Email Field element
        WebElement emailfield = driver.findElement(By.id("Email"));
        emailfield.sendKeys("Prime123@gmail.com");
        //Find the Password field element
        WebElement passwordfield = driver.findElement(By.id("Password"));
        passwordfield.sendKeys("Prime123");
        //Closing driver
        driver.close();
    }


}
