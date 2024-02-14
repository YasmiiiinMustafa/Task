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

    private By SecondResult = By.xpath("(//h3[contains(@class,'LC20lb MBeuO DKV0Md')])[2]");

    private WebDriver driver;

    public GoogleResult(WebDriver driver) {
        this.driver = driver;
    }

    public String GetSecondResult() {
        return driver.findElement(SecondResult).getText();



    }
}

