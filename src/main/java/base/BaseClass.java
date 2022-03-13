package base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BaseClass extends Config{

    protected static WebDriverWait wait;
    protected static WebDriver driver;
    protected static String browser;
    protected static String appUrl;

    public static void initialization() {
        appUrl = Config.getAppUrl();
        browser = Config.getBrowser();
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.get(appUrl);
        wait = new WebDriverWait(driver,30);
    }

    public WebDriver getDriver() {
        return driver;
    }
}


