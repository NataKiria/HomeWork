package Utils;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class ChromeRunner {
    public static WebDriver driver = new ChromeDriver();

    @BeforeMethod
    @Description ("Open Chrome browser")
    public void launchChrome (){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://veli.store/");
    }


    @AfterMethod
    @Description ("Close the Chrome browser")
    public void closeChrome () {

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        driver.close();
    }
}
