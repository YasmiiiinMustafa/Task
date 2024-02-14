package BaseTest;

import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseModule {

    private WebDriver Chromedriver;

    protected Task1 task1;
    protected Task2 task2;
    protected Task3 task3;
    protected Task5 task5;
    protected Task6 task6;
    protected Task7 task7;




    @BeforeClass
    public void ChromeSetup()
    {
            System.setProperty("webdriver.chrome,driver", "Resources/chromedriver.exe");
            Chromedriver = new ChromeDriver();

            task1 = new Task1(Chromedriver);
            task2 = new Task2(Chromedriver);
            task3 = new Task3(Chromedriver);
            task5 = new Task5(Chromedriver);
            task6 = new Task6(Chromedriver);
            task7 = new Task7(Chromedriver);

        }





    @AfterClass
    public void TearDown()
    {
        Chromedriver.quit();

    }


    public static void main(String arg[])
    {
        /*

        BaseModule test = new BaseModule();
        test.setup();

         */
    }




}
