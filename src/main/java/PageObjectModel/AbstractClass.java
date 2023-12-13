package PageObjectModel;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;


public abstract class AbstractClass {


    private WebDriver driver = Driver.getDriver();

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


    public void clickFunction(WebElement clicElement){
        wait.until(ExpectedConditions.elementToBeClickable(clicElement));
        clicElement.click();
    }

    public void sendKeysFunction(WebElement sendKeysElement, String value){
        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
        sendKeysElement.sendKeys(value);
    }

    public void selectElementFromDropdown(WebElement dropdown, String element){
        Select slc =new Select(dropdown);
        slc.selectByVisibleText(element);
    }


    public void assertion(WebElement actual, String expected) {
        wait.until(ExpectedConditions.visibilityOf(actual));
        Assert.assertEquals(actual.getText(), expected);
        System.out.println("My Message: " + actual.getText());
    }



}
