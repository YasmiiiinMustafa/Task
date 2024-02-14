package Task1;

import BaseTest.BaseModule;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTask1 extends BaseModule {
    @Test
    public void TestSuccessfulGetTitle()
    {
        task1.GetURL("https://www.google.com/ncr");
        Assert.assertEquals(task1.GetTitle(),"Google");
    }
}
