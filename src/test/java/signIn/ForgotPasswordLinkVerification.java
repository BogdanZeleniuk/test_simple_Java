package signIn;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.SignInPage;

public class ForgotPasswordLinkVerification extends BaseTest {
    private MainPage mainPage;
    private SignInPage signInPage;
    private String expectedForgotPasswordTitle = "Forgot your password? · GitHub";

    @Test(priority = 1)
    public void verifyForgotPasswordLink() {
        mainPage = new MainPage();
        mainPage.clickSignInBtn();
        signInPage = new SignInPage();
        signInPage.clickForgotPassword();
        Assert.assertEquals(getDriver().getTitle(), expectedForgotPasswordTitle);
    }
}
