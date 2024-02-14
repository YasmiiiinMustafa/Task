package Task7;

import BaseTest.BaseModule;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTask7 extends BaseModule {

    @Test
     public void TestSuccessfulDragAndDrop()
    {
        task7.GetURL("https://jqueryui.com/resources/demos/droppable/default.html");
        task7.DragAndDrop();
        Assert.assertEquals(task7.GetDroppedText(),"Dropped!");


    }
}
