package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SimpleFormDemoPage extends PageBase{

    private By inputForm         = By.cssSelector("#get-input");
    private By messageTextField  = By.cssSelector("#user-message");
    private By showMessageButton = By.cssSelector(".btn-default");
    private By resultText        = By.cssSelector("#display");

    public SimpleFormDemoPage (WebDriver driver)
    {
        super(driver);
    }

    public void populateMessageText(String messageText)
    {
        this.driver.findElement(inputForm)
                .findElement(messageTextField)
                .sendKeys(messageText)
        ;
    }

    public void clickShowMessageButton()
    {
        this.driver.findElement(inputForm)
                .findElement(showMessageButton)
                .click()
        ;
    }

    public String getMessageText()
    {
        return this.driver.findElement(resultText).getText();
    }
}
