package StepDefinitions;

import Task.PerfilTask;
import Util.ScreenShot;
import Util.newTestexcel;
import io.cucumber.java.en.Then;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class PerfilSD {
    @Then("I select perfil {},{}")
    public void i_select_perfil(String Sheetname, Integer Rownumber) throws InterruptedException, IOException {
        newTestexcel reader = new newTestexcel();
        List<Map<String, String>> testdata = reader.getData("src/test/resources/ExcelData/Inputfile.xlsx",Sheetname);
        String perfil = testdata.get(Rownumber).get("perfil");

        PerfilTask tst = new PerfilTask();
        tst.perfil(perfil);

        ScreenShot shoot = new ScreenShot();
        shoot.TakeScreenShot();
    }
}
