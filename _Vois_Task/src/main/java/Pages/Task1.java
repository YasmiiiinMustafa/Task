package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1{

    private WebDriver driver;

    public Task1(WebDriver driver)
    {
        this.driver=driver;
    }
    public void GetURL(String url)
    {
        driver.get(url);
    }

    public String GetTitle()
    {
        return driver.getTitle();
    }
}
