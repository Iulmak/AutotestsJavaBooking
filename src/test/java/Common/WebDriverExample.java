package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverExample {
//    public static void main(String[] args) {
//        WebDriver driver = getDriver();
//        driver.get("https://www.booking.com/");
//    }

    public static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//resources//chromedriver.exe");
        return new ChromeDriver();
    }
}
