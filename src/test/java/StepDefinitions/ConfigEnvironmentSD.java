package StepDefinitions;
import Task.ConfigEnvironmentTask;
import Util.Readfilexlsx;
import Util.fileLog;
import Util.fileelogs;
import Util.newTestexcel;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.exc.InvalidFormatException;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ConfigEnvironmentSD {
/*
    @Before
    public void setup() throws IOException {
        ConfigEnvironmentTask tst = new ConfigEnvironmentTask();
        tst.config_drivers();
    }
    @After
    public void tearDown() {
        ConfigEnvironmentTask tst = new ConfigEnvironmentTask();
        tst.tear();
    }

    @Given("Read the excel file {},{}")
    public void read_the_excel_file(String Sheetname, Integer Rownumber) throws IOException {
        newTestexcel reader = new newTestexcel();
        List<Map<String, String>> testdata = reader.getData("src/test/resources/ExcelData/Inputfile.xlsx",Sheetname);
        String environment = testdata.get(Rownumber).get("environment");
    }


    @And("I access to the platform {},{}")
    public void i_access_to_the_platform(String Sheetname, Integer Rownumber) throws IOException {
        newTestexcel reader = new newTestexcel();
        List<Map<String, String>> testdata = reader.getData("src/test/resources/ExcelData/Inputfile.xlsx",Sheetname);
        String environment = testdata.get(Rownumber).get("environment");

        ConfigEnvironmentTask tst = new ConfigEnvironmentTask();
        tst.intelica_environment(environment);
    }

 */
private newTestexcel reader;
    private ConfigEnvironmentTask tst;
    private String environment;

    @Before
    public void setup() throws IOException {
        reader = new newTestexcel();
        tst = new ConfigEnvironmentTask();
        tst.config_drivers();
    }

    @After
    public void tearDown() {
        tst.tear();
    }

    @Given("Read the excel file {},{}")
    public void read_the_excel_file(String Sheetname, Integer Rownumber) throws IOException {
        List<Map<String, String>> testdata = reader.getData("src/test/resources/ExcelData/Inputfile.xlsx", Sheetname);
        environment = testdata.get(Rownumber).get("environment");
    }

    @And("I access to the platform {},{}")
    public void i_access_to_the_platform(String Sheetname, Integer Rownumber) throws IOException {
        List<Map<String, String>> testdata = reader.getData("src/test/resources/ExcelData/Inputfile.xlsx", Sheetname);
        environment = testdata.get(Rownumber).get("environment");
        tst.intelica_environment(environment);
    }
}