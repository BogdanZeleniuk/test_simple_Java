package signIn;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.MainPage;
import pages.SignInPage;

public class SignInWithInvalidCredentialsFromStartPage extends BaseTest {

	private MainPage mainPage;
	private SignInPage signInPage;
	private String expectedValidationMessage = "Incorrect username or password.";

	@Test(priority = 1)
	public void signInAppFromMainPage() {
		mainPage = new MainPage();
		signInPage = new SignInPage();
		mainPage.clickSignInBtn();
		signInPage.setUserName();
		signInPage.setPassword();
		signInPage.clickSignInBtn();
		Assert.assertEquals(signInPage.getInvalidCredentialsMessage(), expectedValidationMessage);
	}
}
