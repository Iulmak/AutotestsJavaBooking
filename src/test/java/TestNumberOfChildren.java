import org.openqa.selenium.devtools.v84.page.Page;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNumberOfChildren extends PageObjectMainPage {

    public TestNumberOfChildren () {
        super();
    }


    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }


    @Test
    public void test() {

        try {
            this.clickGuests();
            int countsClick = this.getRandomNumber(1, 10);
            for (int i = 0; i < countsClick; i++) {
                this.clickAddChildButton();
            }

            int countFields = this.countChildFields();
            if (countsClick != countFields) {
                Assert.fail("countsClick != countFields");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            Assert.fail(e.getMessage());
        }
    }
}
