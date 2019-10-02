import org.testng.annotations.Test;
import testUtilities.TestBase;

public class SimpleExampleTest extends TestBase {

    @Test
    public void testSimpleExample()
    {
        this.driver.navigate().to("https://www.seleniumeasy.com/test/");
    }
}
