package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends BaseTest {

    @FindBy(css = "header[role='banner'] span+a ")
    WebElement signInBtn;

    public SignUpPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickSignInBtn() {
        click(signInBtn);
    }
}
