package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task4 {
    private WebDriver driver;
    private By SearchBar = By.name("q");
    private By FourthResult = By.xpath("(//h3[contains(@class,'LC20lb MBeuO DKV0Md')][contains(text(),'TestNG Tutorial')])[1]");


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
    public String GetFourthResult() {
        return driver.findElement(FourthResult).getText();

    }

    public void TearDown()
    {
        driver.quit();

    }



}

