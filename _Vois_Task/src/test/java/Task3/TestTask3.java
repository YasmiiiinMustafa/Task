package Task3;

import BaseTest.BaseModule;
import Pages.GoogleResult;
import Pages.Task3;
import org.openqa.selenium.json.Json;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.FileReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import javax.naming.directory.SearchResult;
import java.io.File;

public class TestTask3 extends BaseModule {

    @Test(dataProvider = "jsonData")
    public void TestSuccessfulSearch(String searchText) {
        task3.GetURL("https://www.google.com/ncr");

        task3.SearchFor(searchText);
        GoogleResult GoogleSecondResult = task3.ClickButton();
        //Assert.assertTrue(GoogleSecondResult.GetSecondResult().contains("Selenium Webdriver Tutorial with Examples"));

        Assert.assertEquals(GoogleSecondResult.GetSecondResult(), "Selenium Webdriver Tutorial in Java with Examples");

    }

    @DataProvider(name = "jsonData")
    public Object[][] readJson() throws Exception {
        String jsonFilePath = "src/test/resources/file.json";
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader(jsonFilePath));

        String searchText = (String) jsonObject.get("text");
        return new Object[][]{{searchText}};
    }
}
