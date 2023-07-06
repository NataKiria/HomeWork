import LoginTestingSteps.SignInSteps1;
import Utils.ChromeRunner;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

import static DataObject.LogInData1.*;

public class LogIn1 extends ChromeRunner {

    @Test(priority = 1)
    @Description("Log in with correct credentials")
    public void LogInWithCorrectCredentials() throws InterruptedException {
        SignInSteps1 case2 = new SignInSteps1(driver);
        case2.SignInButton();
        case2.EmailInput(CorrectEmail);
        case2.PasswordInput(CorrectPassword);
        case2.ClickLoginButton();
        Thread.sleep(5000);
    }

    @Test(priority = 2)
    @Description("Sign in with correct Email and incorrect password")
    public void LogInWithCorrectEmail() throws InterruptedException {
        SignInSteps1 case1 = new SignInSteps1(driver);
        case1.SignInButton();
        case1.EmailInput(CorrectEmail);
        case1.PasswordInput(IncorrectPassword);
        case1.ClickLoginButton();
        case1.IncorrectCredentialsValidationText();
        Thread.sleep(5000);
    }

    @Test(priority = 3)
    @Description("Log in with incorrect Email and correct password")
    public void LogInWhithIncorrectPassword() throws InterruptedException {
        SignInSteps1 case3 = new SignInSteps1(driver);
        case3.SignInButton();
        case3.EmailInput(IncorrectEmail);
        case3.PasswordInput(CorrectPassword);
        case3.ClickLoginButton();
        case3.IncorrectCredentialsValidationText();
        Thread.sleep(5000);
    }

    @Test(priority = 4)
    @Description("Log in with empty fields")
    public void LogInWithEmptyFields() throws InterruptedException {
        SignInSteps1 case4 = new SignInSteps1(driver);
        case4.SignInButton();
        case4.EmailInput(EmptyEmailfield);
        case4.PasswordInput(EmptyPasswordField);
        case4.ClickLoginButton();
        case4.EmptyFieldsTesting();
        Thread.sleep(5000);

    }

    @Test(priority = 5)
    @Description("Log in with empty Email field")
    public void LoginWithEmptyEmail() throws InterruptedException {
        SignInSteps1 case5 = new SignInSteps1(driver);
        case5.SignInButton();
        case5.EmailInput(EmptyEmailfield);
        case5.PasswordInput(CorrectPassword);
        case5.ClickLoginButton();
        case5.EmptyEmailFieldTesting();
        Thread.sleep(5000);
    }

    @Test(priority = 6)
    @Description("Log in with empty Password field")
    public void LoginWithEmptyPassword() throws InterruptedException {
        SignInSteps1 case6 = new SignInSteps1(driver);
        case6.SignInButton();
        case6.EmailInput(CorrectEmail);
        case6.PasswordInput(EmptyPasswordField);
        case6.ClickLoginButton();
        case6.EmptyPasswordFieldTesting();
        Thread.sleep(5000);
    }

    @Test(priority = 7)
    @Description("Log in with Nonregistered Email")
    public void LoginWithNonregisteredEmail() throws InterruptedException {
        SignInSteps1 case7 = new SignInSteps1(driver);
        case7.SignInButton();
        case7.EmailInput(NonRegisteredEmail);
        case7.PasswordInput(CorrectPassword);
        case7.ClickLoginButton();
        case7.IncorrectCredentialsValidationText();
        Thread.sleep(5000);
    }

    @Test(priority = 8)
    @Description("Test Password length validation")
    public void SmallPassValidation() throws InterruptedException {
        SignInSteps1 case8 = new SignInSteps1(driver);
        case8.SignInButton();
        case8.EmailInput(CorrectEmail);
        case8.PasswordInput(PasswordLessThanSixChar);
        case8.ClickLoginButton();
        case8.PasswordLengthtesting();
        Thread.sleep(5000);
    }

    @Test(priority = 9)
    @Description("Log in with incorrect format Email")
    public void IncorrectFormatEmail() throws InterruptedException {
        SignInSteps1 case9 = new SignInSteps1(driver);
        case9.SignInButton();
        case9.EmailInput(EmailWithIncorrectFormat);
        case9.PasswordInput(CorrectPassword);
        case9.ClickLoginButton();
        Thread.sleep(5000);

    }

    @Test(priority = 10)
    @Description("Test Show password functionality")
    public void ShowPassButton() throws InterruptedException {
        SignInSteps1 case10 = new SignInSteps1(driver);
        case10.SignInButton();
        case10.EmailInput(EmailWithIncorrectFormat);
        case10.PasswordInput(CorrectPassword);
        case10.ClickShowPassButton();
        Thread.sleep(5000);

    }
}