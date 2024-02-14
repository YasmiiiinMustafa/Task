package Task4;

import BaseTest.BaseModule;
import Pages.Task4;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTak4 {
    @Test
    public void TestSuccessfulSearch()
    {
        Task4 task4 = new Task4();
        task4.GetURL("https://www.google.com/ncr");

        task4.SearchFor("TestNG");
        Assert.assertEquals(task4.GetFourthResult(),"TestNG Tutorial");

    }
}
