package Task3;

import BaseTest.BaseModule;
import Pages.GoogleResult;
import Pages.Task3;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.naming.directory.SearchResult;

public class TestTask3 extends BaseModule {

    @Test
    public void TestSuccessfulSearch()
    {
        task3.GetURL("https://www.google.com/ncr");

        task3.SearchFor("Selenium WebDriver");
            GoogleResult GoogleSecondResult = task3.ClickButton();
            //Assert.assertTrue(GoogleSecondResult.GetSecondResult().contains("Selenium Webdriver Tutorial with Examples"));

       Assert.assertEquals(GoogleSecondResult.GetSecondResult(),"Selenium Webdriver Tutorial in Java with Examples");

    }
}
