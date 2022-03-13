package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BaseTest {

    @FindBy(css = "[name='login']")
    WebElement userName;

    @FindBy(css = "#password")
    WebElement password;

    @FindBy(css = "[name='commit']")
    WebElement signInBtn;

    @FindBy(css = "a[href='/password_reset']")
    WebElement forgotPassword;

    @FindBy(css = "div[class*='flash-error'] div")
    WebElement incorrectCredentialsMessage;

    public SignInPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickSignInBtn() {
        click(signInBtn);
    }

    public void setUserName() {
        typeText(userName, getUserName());
    }

    public void setPassword() {
        typeText(password, getUserPassword());
    }

    public void clickForgotPassword() {
        click(forgotPassword);
    }

    public String getInvalidCredentialsMessage() {
        return incorrectCredentialsMessage.getText();
    }
}
