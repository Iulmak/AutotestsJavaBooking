import Common.BaseTestingClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class PageObjectMainPage extends BaseTestingClass {

    public PageObjectMainPage(){
        super("https://www.booking.com/");
    }

    WebDriverWait wait;

    String checkboxApartmentSelector = "[data-id=ht_id-201]";

    public void clickCityField() {
        WebElement fieldCity = getDriver().findElement(By.id("ss"));
        fieldCity.clear();
        fieldCity.click();
    }

    public void clickCalendar() {
        WebElement openCalendar = getDriver().findElement(By.cssSelector(".xp__dates-inner"));
        openCalendar.click();
    }

    public void clickChooseCity() {
        WebElement chooseCity = getDriver().findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]"));
        chooseCity.click();
    }

    public String checkChooseCity() {
        WebElement chooseCity = getDriver().findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]"));
        String cityFromMainPage = chooseCity.getText();
        String[] arr = cityFromMainPage.split("\n");
        return arr[0];
    }

    public String getCityFieldValue() {
        WebElement cityField = getDriver().findElement(By.id("ss"));
        return cityField.getAttribute("value");
    }

    public void clickFirstDate() {
        WebElement firstDate = getDriver().findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[1]/div[2]/div/div/div/div/span"));
        firstDate.click();
    }

    public void clickChooseFirstDate() {
        WebElement chooseFirstDay = getDriver().findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[3]/td[4]/span"));
        chooseFirstDay.click();
    }

    public String checkFirstDate() {
        WebElement chooseFirstDay = getDriver().findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[3]/td[4]/span"));
        String str = (chooseFirstDay.getAttribute("aria-label"));
        String[] arr = str.split(" ");
        return arr[0];
    }

    public String checkFirstDateFromHotel() {
        WebElement firstDateFromHotel = getDriver().findElement(By.cssSelector("[data-calendar2-type=\"checkin\"]"));
        String dateFromHotel = firstDateFromHotel.getText();
        String[] arr = dateFromHotel.split(", ");
        return arr[arr.length - 1].split(" ")[0];
    }

    public String checkEndDateFromHotel() {
        WebElement endDateFromHotel = getDriver().findElement(By.cssSelector("[data-calendar2-type=\"checkout\"]"));
        String dateFromHotel = endDateFromHotel.getText();
        String[] arr = dateFromHotel.split(", ");
        return arr[arr.length - 1].split(" ")[0];
     }

    public void clickChooseEndDate() {
        WebElement chooseEndDate = getDriver().findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[3]/td[7]/span"));
        chooseEndDate.click();
    }

    public String checkEndDate() {
        WebElement chooseEndDate = getDriver().findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[3]/td[7]/span"));
        String str = chooseEndDate.getAttribute("aria-label");
        String[] arr = str.split(" ");
        return arr[0];
    }

    public int findBookingDate() {
        List<WebElement> bookingDate = getDriver().findElements(By.cssSelector(".bui-calendar__content [aria-selected=true]"));
        return bookingDate.size();
    }

    public void clickCheckPrice() {
        WebElement checkPrice = getDriver().findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button"));
        checkPrice.click();
    }

    public int checkApartmentCountFromCheckbox () {
        WebElement checkboxElement = getDriver().findElement(By.cssSelector(checkboxApartmentSelector));
        String str = checkboxElement.findElement(By.cssSelector(".filter_count")).getText();
        return Integer.parseInt(str);
    }

    public void clickCheckboxApartment() {
        WebElement checkPrice = getDriver().findElement(By.cssSelector(checkboxApartmentSelector));
        checkPrice.click();
    }

    public int getApartmentCountFromResult() {
        WebElement headerElement = getDriver().findElement(By.cssSelector(".sr_header--title h1"));
        String str = headerElement.getText().replaceAll("\\D+","");
        return Integer.parseInt(str);
    }


    public void clickGuests() {
        WebElement guestElement = getDriver().findElement(By.id("xp__guests__toggle"));
        guestElement.click();
    }

    protected void clickAddChildButton() {
        WebElement addChildButton = getDriver().findElement(By.xpath("//*[@id=\"xp__guests__inputs-container\"]/div/div/div[2]/div/div[2]/button[2]"));
        addChildButton.click();
    }

    public int countChildFields() {
        List<WebElement> childrenField = getDriver().findElements(By.name("age"));
        return childrenField.size();
    }




}
