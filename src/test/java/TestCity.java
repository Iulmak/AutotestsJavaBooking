import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCity extends PageObjectMainPage {

    public TestCity(){

        super();
    }

    WebDriverWait wait;

    @Test
    public void testCity() {

        try {
            this.clickCityField();
            String chooseCity = this.checkChooseCity();
            this.clickChooseCity();
            this.clickCheckPrice();
            String cityHotelPage = this.getCityFieldValue();
            if (chooseCity.equals(cityHotelPage)) {
                System.out.println("Selected City was saved");
            } else {
                Assert.fail("Selected City wasn't saved");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Assert.fail(e.getMessage());
        }
    }
}
