package StepDefinitions;

import Task.ConfigEnvironmentTask;
import Task.CredentialsTask;
import Util.Readfilexlsx;
import Util.ScreenShot;
import Util.TimeLoad;
import Util.newTestexcel;
import io.cucumber.java.en.And;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static Util.newlog.log;

public class CredentialsSD {
    @And("I enter the credentials {},{}")
    public void i_enter_a_username(String Sheetname, Integer Rownumber) throws InterruptedException, IOException {
        newTestexcel reader = new newTestexcel();
        List<Map<String, String>> testdata = reader.getData("src/test/resources/ExcelData/Inputfile.xlsx", Sheetname);
        String username = testdata.get(Rownumber).get("username");
        String passwords = testdata.get(Rownumber).get("password");

        CredentialsTask tst = new CredentialsTask();
        tst.username(username);
        tst.password(passwords);
        ScreenShot shoot = new ScreenShot();
        shoot.TakeScreenShot();

    }
    @And("Select generate token button")
    public void select_generate_token_button() throws InterruptedException {
        CredentialsTask tst = new CredentialsTask();
        tst.token();
        //ConfigEnvironmentTask test = new ConfigEnvironmentTask();
        //test.waittime();

    }
    /*
    @Test
    public void newtestloading(){
        TimeLoad pruebas = new TimeLoad();
        pruebas.waitload_test();
    }

     */
}
