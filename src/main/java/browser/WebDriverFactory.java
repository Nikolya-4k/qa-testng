package browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.ConfigProvider;

import java.util.Locale;

import static utils.ConfigProvider.BROWSER;

public class WebDriverFactory {

    private static WebDriver driver;

    public static WebDriver getDriver() {
       driver = getDriver(Browser.valueOf(BROWSER.toUpperCase()));
        return driver;
    }

    public static WebDriver getDriver(Browser browser) {
        switch (browser) {
            case CHROME:
                return getChromeDriver();
            case FIREFOX:
                return getFirefoxDriver();
            default:
                throw new IllegalCallerException("Wrong browser type provided. Choices are: chrome, firefox");
        }

    }

    private static WebDriver getChromeDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver();
            driver = new ChromeDriver();
        }
        return null;
    }

    private static WebDriver getFirefoxDriver() {
        if (driver == null) {
            WebDriverManager.firefoxdriver();
            driver = new FirefoxDriver();
        }
        return null;
    }
}
