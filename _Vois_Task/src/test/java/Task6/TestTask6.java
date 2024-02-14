package Task6;

import BaseTest.BaseModule;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTask6 extends BaseModule {

    @Test
    public void testSuccessfulFileUpload()
    {
        task6.GetURL("http://the-internet.herokuapp.com/upload");
        task6.uploadFile("C:\\Users\\yasmine mostafa\\Downloads\\email.jpeg");
        Assert.assertEquals(task6.getUploadedFiles(),"email.jpeg");

    }
}
