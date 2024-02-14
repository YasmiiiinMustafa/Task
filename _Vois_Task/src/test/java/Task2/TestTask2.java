package Task2;

import BaseTest.BaseModule;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TestTask2 extends BaseModule {

    @Test
    public void TestSuccessfulLogoDisplayed()
    {
        task2.GetURL("https://www.google.com/ncr");

        Assert.assertTrue(task2.GoogleLogoIsDisplayed(),"Google logo is displayed");
    }

}
