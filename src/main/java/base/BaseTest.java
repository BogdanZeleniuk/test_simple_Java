package base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest extends BaseClass {

    public Logger Log = LogManager.getLogger(this.getClass().getName());
    private final String expectedTitle = "GitHub: Where the world builds software · GitHub";

    @BeforeClass
    public void checkMainPageLoaded() {
        initialization();
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    protected void click(WebElement element){
        Log.info("click on the element");
        if(element.isDisplayed()) {
            waitToBeClickable(element);
            element.click();
        }
    }

    protected WebElement waitToBeClickable(WebElement element) {
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    protected WebElement waitForVisibility(WebElement element) {
        return wait
                .ignoring(StaleElementReferenceException.class)
                .until(ExpectedConditions.visibilityOf(element));
    }

    protected void typeText(WebElement webElement, String text) {
        Log.info("type text into input " + text);
        waitForVisibility(webElement);
        webElement.sendKeys(text);
    }
}
