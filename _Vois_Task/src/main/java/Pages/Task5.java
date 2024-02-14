package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Task5 {

    private WebDriver driver;
    private By CheckBox1 = By.xpath("//input[@type=\"checkbox\"][1]");
    private By CheckBox2 = By.xpath("//input[@type=\"checkbox\"][2]");


    public Task5 (WebDriver driver)
    {
        this.driver=driver;
    }

  public void GetURL(String url)
  {
      driver.get(url);
  }

  public void CheckBox1Click()
  {
      driver.findElement(CheckBox1).click();

  }

  public boolean BothCheckBoxChecked()
  {
      return driver.findElement(CheckBox1).isSelected() && driver.findElement(CheckBox2).isSelected();

  }

}
