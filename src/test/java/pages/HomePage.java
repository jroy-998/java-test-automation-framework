package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase{

    private By inputFormsLink     = By.linkText("Input Forms");
    private By simpleFormDemoLink = By.linkText("Simple Form Demo");

    public HomePage(WebDriver driver)
    {
        super(driver);
    }

    public void navigateToHomepage ()
    {
        this.driver.navigate().to("https://www.seleniumeasy.com/test/");
    }

    public SimpleFormDemoPage clickSimpleFormDemoLink()
    {
        this.driver.findElement(inputFormsLink).click();
        this.driver.findElement(simpleFormDemoLink).click();

        return new SimpleFormDemoPage(this.driver);
    }
}
