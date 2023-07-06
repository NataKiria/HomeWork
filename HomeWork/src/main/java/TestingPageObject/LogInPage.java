package TestingPageObject;

import org.openqa.selenium.By;

public class LogInPage {
    protected By

    SignInButton = By.xpath("//*[@id=\"__next\"]/header/div[4]/div[1]/div[3]/button[2]"),
    EmailField = By.id("sigin-email"),
    PasswordField =By.id("signin-password"),
    ShowPassButton = By.className("styled__ShowPasswordText-jo9xo0-3"),
    LogInButton = By.className("styled__AuthPrimaryBtn-mh0716-2"),
    IncorrectCredentialsValidation = By.xpath("//*[@id=\"portal-root\"]/div[2]/div/div/div[1]/div/p"),
    EmptyFieldsValidationText = By.xpath("//*[@id=\"portal-root\"]/div[2]/div/div/div[1]/div/p"),
    EmptyPasswordField = By.xpath("//*[@id=\"portal-root\"]/div[2]/div/div/form/div[2]/span"),
    EmptyEmailField = By.xpath("//*[@id=\"portal-root\"]/div[2]/div/div/form/div[1]/span"),
    PasswordLengthValidation = By.xpath("//*[@id=\"portal-root\"]/div[2]/div/div/form/div[2]/span");


}
