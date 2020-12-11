import Common.BaseTestingClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class TestBookingPrice extends PageObjectMainPage {

    public TestBookingPrice() {
      super();
    }


    @Test
    public void test() throws Exception {
        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), 120);

            this.clickCityField();
            this.clickChooseCity();
            this.clickCalendar();
            if (this.findBookingDate() > 0) {
                throw new Exception("Calendar has booking dates");
            }
            this.clickFirstDate();
            this.clickChooseFirstDate();
            this.clickChooseEndDate();
            this.clickCheckPrice();


            int apartmentCount = this.checkApartmentCountFromCheckbox();
            this.clickCheckboxApartment();

            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".sr-usp-overlay")));

            int apartmentCountFromResult = this.getApartmentCountFromResult();
            if (apartmentCount != apartmentCountFromResult) {
                throw new Exception("Numbers of apartment not equal with result");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

}
