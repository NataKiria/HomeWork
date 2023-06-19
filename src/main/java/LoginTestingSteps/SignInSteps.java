package LoginTestingSteps;

import TestingPageObject.LoginTesting;
import org.openqa.selenium.WebDriver;

public class SignInSteps extends LoginTesting {

    WebDriver driver;

    public SignInSteps (WebDriver driver1){
        driver = driver1;

    }

    public void signInEmail(String email){
        driver.findElement(EmailField).sendKeys(email);

    }
    public void passwordTesting (String password) {
        driver.findElement(PasswordField ).sendKeys(password);

    }

    public void signInButtonTesting (){
    driver.findElement(SignInButton).click();
    }
}
