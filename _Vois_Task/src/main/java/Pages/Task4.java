package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task4 {
    private WebDriver driver;
    private By SearchBar = By.name("q");


    public Task4()
    {
        System.setProperty("webdriver.gecko.driver","Resources/geckodriver.exe");
        driver=new FirefoxDriver();
    }
    public void GetURL(String url)
    {
        driver.get(url);
    }
    public void SearchFor(String Text) {
        driver.findElement(SearchBar).sendKeys(Text);
        driver.findElement(SearchBar).submit();
    }

    public void TearDown()
    {
        driver.quit();

    }



}

