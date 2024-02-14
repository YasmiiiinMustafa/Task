package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Task2 {

    private WebDriver driver;

    private By GoogleLogo = By.cssSelector("img[alt=\"Google\"]");
    public Task2(WebDriver driver)
    {
        this.driver=driver;
    }
    public void GetURL(String url)
    {
        driver.get(url);
    }


    public Boolean GoogleLogoIsDisplayed()
    {
        return driver.findElement(GoogleLogo).isDisplayed();

    }
}
