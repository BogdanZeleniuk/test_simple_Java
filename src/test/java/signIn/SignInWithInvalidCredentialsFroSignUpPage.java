package signIn;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.SignInPage;
import pages.SignUpPage;

public class SignInWithInvalidCredentialsFroSignUpPage extends BaseTest {
    private MainPage mainPage;
    private SignInPage signInPage;
    private SignUpPage signUpPage;
    private String expectedValidationMessage = "Incorrect username or password.";

    @Test(priority = 1)
    public void signInAppFromSignUpPage() {
        mainPage = new MainPage();
        signInPage = new SignInPage();
        signUpPage = new SignUpPage();
        mainPage.clickSignUpBtn();
        signUpPage.clickSignInBtn();
        signInPage.setUserName();
        signInPage.setPassword();
        signInPage.clickSignInBtn();
        Assert.assertEquals(signInPage.getInvalidCredentialsMessage(), expectedValidationMessage);
    }
}
