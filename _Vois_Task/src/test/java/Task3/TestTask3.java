package Task3;

import BaseTest.BaseModule;
import Pages.GoogleResult;
import Pages.Task3;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.naming.directory.SearchResult;
import java.io.File;

public class TestTask3 extends BaseModule {

    @Test
    public void TestSuccessfulSearch()
    {
        File text = new File("src/test/resources/file.json");
        task3.GetURL("https://www.google.com/ncr");

        task3.SearchFor("Selenium WebDriver");
            GoogleResult GoogleSecondResult = task3.ClickButton();
            //Assert.assertTrue(GoogleSecondResult.GetSecondResult().contains("Selenium Webdriver Tutorial with Examples"));

       Assert.assertEquals(GoogleSecondResult.GetSecondResult(),"Selenium Webdriver Tutorial in Java with Examples");

    }
}
