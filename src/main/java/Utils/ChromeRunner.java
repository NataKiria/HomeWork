package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class ChromeRunner {
    public static WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void launchChrome (){
        driver.manage().window().maximize();
        driver.get("https://www.linkedin.com/");
    }

    @AfterMethod
    public void closeChrome () {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.close();
    }
}
