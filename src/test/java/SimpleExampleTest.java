import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SimpleExampleTest {

    protected WebDriver driver;
    protected ChromeOptions capabilities;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        this.capabilities = new ChromeOptions();
        this.driver       = new RemoteWebDriver(
                new URL("http://localhost:4444/wd/hub"),
                this.capabilities
        );

        this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        this.driver.manage().window().maximize();
    }

    @Test
    public void testSimpleExample()
    {
        this.driver.navigate().to("https://www.seleniumeasy.com/test/");
    }

    @AfterMethod
    public void tearDown()
    {
        this.driver.close();
    }

}
