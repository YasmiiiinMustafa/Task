package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class GoogleResult {

    private By SecondResult = By.cssSelector("#rso > div:nth-child(4) > div > div > div.kb0PBd.cvP2Ce.jGGQ5e > div > div > span > a > h3");

    private WebDriver driver;

    public GoogleResult(WebDriver driver) {
        this.driver = driver;
    }

    public String GetSecondResult() {
        return driver.findElement(SecondResult).getText();



    }
}

