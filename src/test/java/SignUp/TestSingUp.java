package SignUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class TestSingUp extends SignUpPageObject {

    public static String email = "bookingautomationtest@gmail.com";
    public static String password = "Bookingautomationtest123";


    @Test
    public void test() {
        try {

            WebDriverWait wait = new WebDriverWait(getDriver(), 120);

            this.getSignUpFormButton().click();

            WebElement emailField = this.getEmailField();
            emailField.clear();
            emailField.sendKeys(email);
            this.getContinueButton().click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
            WebElement passwordField = this.getPasswordField();
            passwordField.clear();
            passwordField.sendKeys(password);
            this.getContinueButton().click();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }
}
