package testUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestBase {

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

    @AfterMethod
    public void tearDown()
    {
        this.driver.close();
    }
}
