import LoginTestingSteps.SignInSteps;
import Utils.ChromeRunner;
import org.testng.annotations.Test;
import static DataObject.LogInData.*;

public class LogIn extends ChromeRunner {
    @Test


        public void SignInWithcorrectEmail () {


            SignInSteps case2 = new SignInSteps(driver);

            case2.signInEmail(CorrectEmail);
            case2.passwordTesting(IncorrectPassword);
            case2.signInButtonTesting();

    }

    @Test

        public void SignInFailure1() {


            SignInSteps case1 = new SignInSteps(driver);

            case1.signInEmail(IncorrectEmail);
            case1.passwordTesting(IncorrectPassword);
            case1.signInButtonTesting();


    }
}
