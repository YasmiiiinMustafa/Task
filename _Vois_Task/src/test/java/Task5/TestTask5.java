package Task5;

import BaseTest.BaseModule;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTask5 extends BaseModule {

    @Test
    public void TestSuccessfulCheckBox()
    {
        task5.GetURL("http://the-internet.herokuapp.com/checkboxes");
        task5.CheckBox1Click();
        Assert.assertTrue(task5.BothCheckBoxChecked(),"Both checkboxes are checked");
    }
}
