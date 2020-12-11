import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestParallelCityDate extends PageObjectMainPage {

    public TestParallelCityDate(){

        super();
    }

    WebDriverWait wait;

    @Test
    public void testDates() {
        try {

            this.clickCityField();
            this.clickChooseCity();
            this.clickCalendar();
            this.clickFirstDate();
            this.clickChooseFirstDate();
            String firstDayFromMain = this.checkFirstDate();
            this.clickChooseEndDate();
            String secondDayFromMain = this.checkEndDate();
            this.clickCheckPrice();

            String firstDateFromHotel = this.checkFirstDateFromHotel();
            String endDateFromHotel = this.checkEndDateFromHotel();
            if (firstDayFromMain.equals(firstDateFromHotel) && secondDayFromMain.equals(endDateFromHotel)) {
                System.out.println("Selected dates were saved");
            } else {
                Assert.fail("Selected dates weren't saved");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Assert.fail(e.getMessage());
        }

    }
}

