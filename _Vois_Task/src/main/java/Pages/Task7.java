package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Task7 {

    private WebDriver driver;

    private By Drag=By.id("draggable");
    private By Drop=By.id("droppable");
    public Task7(WebDriver driver)
    {
        this.driver=driver;
    }



    public void GetURL(String url)
    {
        driver.get(url);
    }

    public void DragAndDrop()
    {
        Actions action = new Actions(driver);

        WebElement DragElement= driver.findElement(Drag);
        WebElement DropElement = driver.findElement(Drop);
        action.dragAndDrop(DragElement,DropElement).perform();
    }

    public String GetDroppedText()
    {
        return driver.findElement(Drop).getText();
    }


}
