package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Task6 {

    private WebDriver driver;
    private  By inputFile = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By UploadedFile = By.id("uploaded-files");
    public Task6(WebDriver driver)
    {
        this.driver=driver;
    }

    public void GetURL(String url)
    {
        driver.get(url);
    }

    public void ClickUploadButton()
    {
        driver.findElement(uploadButton).click();
    }
    public void uploadFile(String PathOfFile)
    {
        driver.findElement(inputFile).sendKeys(PathOfFile);
        ClickUploadButton();
    }
    public String getUploadedFiles()
    {
        return driver.findElement(UploadedFile).getText();
    }

}
