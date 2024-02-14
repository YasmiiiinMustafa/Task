package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.naming.directory.SearchResult;

public class Task3 {
    private WebDriver driver;

    private By SearchBar = By.cssSelector("textarea[title =\"Search\"]");
    public Task3(WebDriver driver)
    {
        this.driver=driver;
    }
    public void GetURL(String url)
    {
        driver.get(url);
    }
    public void SearchFor(String Text)
    {
        driver.findElement(SearchBar).sendKeys(Text);


    }

    public GoogleResult ClickButton()
    {
        driver.findElement(SearchBar).submit();
        return new GoogleResult(driver);
    }

}
