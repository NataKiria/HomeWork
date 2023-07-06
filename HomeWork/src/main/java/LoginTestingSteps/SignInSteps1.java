package LoginTestingSteps;

import TestingPageObject.LogInPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class SignInSteps1 extends LogInPage {
    WebDriver driver;

    public SignInSteps1(WebDriver driver1) {
        driver = driver1;
    }

    @Step("click sign in button")
    public void SignInButton() {
        driver.findElement(SignInButton).click();
    }

    @Step("Fill out Email field")
    public void EmailInput(String Email) {
        driver.findElement(EmailField).sendKeys(Email);
    }

    @Step("Fill out password field")
    public void PasswordInput(String Password) {
        driver.findElement(PasswordField).sendKeys(Password);
    }

    @Step("Click on the Log in button")
    public void ClickLoginButton() {
        driver.findElement(LogInButton).click();
    }

    @Step("Click on the Show password button")
    public void ClickShowPassButton() {
        driver.findElement(ShowPassButton).click();
    }

    @Step("Incorrect credentials validation massage testing")
    public void IncorrectCredentialsValidationText() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(IncorrectCredentialsValidation));
        String ExpectedResult = driver.findElement(IncorrectCredentialsValidation).getText();
        String ActualResult = "თქვენ ვერ გაიარეთ ავტორიზაცია";
        Assert.assertEquals(ActualResult, ExpectedResult);
    }

    @Step("Empty fields validation text")
    public void EmptyFieldsTesting() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(EmptyFieldsValidationText));
        String ExpectedResult = driver.findElement(EmptyFieldsValidationText).getText();
        String ActualResult = "გასაგრძელებლად შეავსე ყველა აუცილებელი ველი";
        Assert.assertEquals(ActualResult, ExpectedResult);
    }

    @Step("Empty Password field testing")
    public void EmptyPasswordFieldTesting() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(EmptyPasswordField));
        String ExpectedResult = driver.findElement(EmptyPasswordField).getText();
        String ActualResult = "გთხოვ, შეავსო პაროლის ველი";
        Assert.assertEquals(ActualResult, ExpectedResult);
    }
    @Step("Empty Email field testing")
    public void EmptyEmailFieldTesting() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(EmptyEmailField));
        String ExpectedResult = driver.findElement(EmptyEmailField).getText();
        String ActualResult = "გთხოვ, შეავსო მეილის ველი";
        Assert.assertEquals(ActualResult, ExpectedResult);
    }
    @Step("Password length validation testing")
    public void PasswordLengthtesting() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(PasswordLengthValidation));
        String ExpectedResult = driver.findElement(PasswordLengthValidation).getText();
        String ActualResult = "პაროლი უნდა შეიცავდეს მინიმუმ 8 სიმბოლოს";
        Assert.assertEquals(ActualResult, ExpectedResult);
    }
}
