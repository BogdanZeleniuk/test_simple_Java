package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BaseTest {

	@FindBy(css = "[data-ga-click='(Logged out) Header, clicked Sign in, text:sign-in']")
	WebElement signInBtn;

	@FindBy(xpath = "//nav[@aria-label='Global']/following-sibling::div/a")
	WebElement signUpBtn;
	
	public MainPage() {
			PageFactory.initElements(driver, this);
	}

	public void clickSignInBtn() {
		click(signInBtn);
	}

	public void clickSignUpBtn() {
		click(signUpBtn);
	}
}
