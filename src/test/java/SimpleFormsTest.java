import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import testUtilities.TestBase;

public class SimpleFormsTest extends TestBase {

    @Test
    public void testSingleInputField()
    {
        this.driver.navigate().to("https://www.seleniumeasy.com/test/");
        this.driver.findElement(By.linkText("Input Forms")).click();
        this.driver.findElement(By.linkText("Simple Form Demo")).click();

        String messageText = "this is a test message";
        WebElement form    = this.driver.findElement(By.cssSelector("#get-input"));

        form.findElement(By.cssSelector("#user-message")).sendKeys(messageText);
        form.findElement(By.cssSelector(".btn-default")).click();

        String resultText = this.driver.findElement(By.cssSelector("#display")).getText();

        Assert.assertEquals(messageText, resultText);
    }
}
