package StepDefinitions;

import Task.LenguageTask;
import Util.ScreenShot;
import Util.newTestexcel;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class LenguageSD {
    @And("Select lenguage {},{}")
    public void lenguageplatform(String Sheetname, Integer Rownumber) throws InterruptedException, IOException {
        newTestexcel reader = new newTestexcel();
        List<Map<String, String>> testdata = reader.getData("src/test/resources/ExcelData/Inputfile.xlsx",Sheetname);
        String lenguage = testdata.get(Rownumber).get("lenguage");

        LenguageTask select = new LenguageTask();
        select.lenguagebutton(lenguage);
    }
}
