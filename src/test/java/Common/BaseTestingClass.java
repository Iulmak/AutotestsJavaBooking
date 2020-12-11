package Common;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTestingClass {

    public static String url;

    private WebDriver driver;
    public BaseTestingClass (String address) {
        url = address;
    }

    public WebDriver getDriver() {
        return driver;
    }
    @BeforeMethod
    public void beforeTest() {
        driver = WebDriverExample.getDriver();
        getDriver().get(url);
        getDriver().manage().window().maximize();
    }

    @AfterMethod
    public void afterTest() {
        getDriver().quit();
    }
}

