package SignUp;

import Common.BaseTestingClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SignUpPageObject extends BaseTestingClass {

    SignUpPageObject () {
        super("https://www.booking.com/");
    }

    public WebElement getSignUpFormButton () {
        List<WebElement> elements = getDriver().findElements(By.cssSelector(".js-header-login-link"));
        return elements.get(elements.size() - 1);
    }

    public WebElement getEmailField () {
        return getDriver().findElement(By.id("username"));
    }

    public WebElement getContinueButton () {
        return getDriver().findElement(By.cssSelector("form.nw-signin button[type=submit]"));
    }

    public WebElement getPasswordField () {
        return getDriver().findElement(By.id("password"));
    }
}
