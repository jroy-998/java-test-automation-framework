import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SimpleFormDemoPage;
import testUtilities.TestBase;

public class SimpleFormsTest extends TestBase {

    @Test
    public void testSingleInputField()
    {
        String messageText = "this is a test message";

        SimpleFormDemoPage simpleFormPage = this.homePage.clickSimpleFormDemoLink();

        simpleFormPage.populateMessageText(messageText);
        simpleFormPage.clickShowMessageButton();
        String resultText = simpleFormPage.getMessageText();

        Assert.assertEquals(messageText, resultText);
    }
}
