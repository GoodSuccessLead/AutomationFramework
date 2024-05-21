package StepDefinitions;

import Task.ConfigEnvironmentTask;
import Task.Filters_FieldsTask;
import Util.ScreenShot;
import Util.TimeLoad;
import Util.newTestexcel;
import io.cucumber.java.en.And;

import java.io.IOException;
import java.io.ObjectInputFilter;
import java.util.List;
import java.util.Map;

public class Filters_FieldsSD {
    @And("Select clear button")
    public void select_clear_button() throws InterruptedException, IOException {
        Filters_FieldsTask tst = new Filters_FieldsTask();
        tst.clear_button();

        ScreenShot shoot = new ScreenShot();
        shoot.TakeScreenShot();
        //boton clear
        /*FilterUi x = new FilterUi();
        x.clearbutton.click();
        System.out.println("Select clear button");*/
/*
        driver.findElement(By.xpath("//*[@id=\"HamburgerMenu\"]/div/div[2]/div[2]/app-filter/div[2]/button[2]")).click();
        Thread.sleep(3_000);
        System.out.println("Select clear button");*/

       /*  //ACTUALIZADO - UTILIAR ESTE
        Filters_FieldsUI button = new Filters_FieldsUI();
        button.clear_button.click();
        System.out.println("You select clear button.");

        */
    }
    @And("Select Group {},{}")
    public void select_group(String Sheetname, Integer Rownumber) throws InterruptedException, IOException {
        newTestexcel reader = new newTestexcel();
        List<Map<String, String>> testdata = reader.getData("src/test/resources/ExcelData/Inputfile.xlsx",Sheetname);
        String group = testdata.get(Rownumber).get("group");
        Filters_FieldsTask fil = new Filters_FieldsTask();
        fil.field_group(group);
    }
    @And("Select the Region {},{}")
    public void select_the_region(String Sheetname, Integer Rownumber) throws InterruptedException, IOException {
        newTestexcel reader = new newTestexcel();
        List<Map<String, String>> testdata = reader.getData("src/test/resources/ExcelData/Inputfile.xlsx",Sheetname);
        String region = testdata.get(Rownumber).get("region");
        String group = testdata.get(Rownumber).get("group");
        Filters_FieldsTask fil = new Filters_FieldsTask();
        fil.field_region(region,group);
    }
    @And("Select Country {},{}")
    public void select_country(String Sheetname, Integer Rownumber) throws InterruptedException, IOException {
        newTestexcel reader = new newTestexcel();
        List<Map<String, String>> testdata = reader.getData("src/test/resources/ExcelData/Inputfile.xlsx",Sheetname);
        String country = testdata.get(Rownumber).get("country");
        String region = testdata.get(Rownumber).get("region");
        Filters_FieldsTask fil = new Filters_FieldsTask();
        fil.field_country(country,region);
    }
    @And("Select Bank {},{}")
    public void select_bank(String Sheetname, Integer Rownumber) throws InterruptedException, IOException {
        newTestexcel reader = new newTestexcel();
        List<Map<String, String>> testdata = reader.getData("src/test/resources/ExcelData/Inputfile.xlsx",Sheetname);
        String bank = testdata.get(Rownumber).get("bank");
        String country = testdata.get(Rownumber).get("country");
        Filters_FieldsTask fil = new Filters_FieldsTask();
        fil.field_bank(bank,country);
    }
    @And("Select BankStatus {},{}")
    public void select_bankstatus(String Sheetname, Integer Rownumber) throws InterruptedException, IOException {
        newTestexcel reader = new newTestexcel();
        List<Map<String, String>> testdata = reader.getData("src/test/resources/ExcelData/Inputfile.xlsx",Sheetname);
        String bankstatus = testdata.get(Rownumber).get("bankstatus");
        String bank = testdata.get(Rownumber).get("bank");
        Filters_FieldsTask fil = new Filters_FieldsTask();
        fil.field_bank_status(bankstatus,bank);
    }
    @And("Select the Category {},{}")
    public void select_the_category(String Sheetname,Integer Rownumber) throws InterruptedException, IOException {
        newTestexcel reader = new newTestexcel();
        List<Map<String, String>> testdata = reader.getData("src/test/resources/ExcelData/Inputfile.xlsx",Sheetname);
        String category = testdata.get(Rownumber).get("category");
        String bankstatus = testdata.get(Rownumber).get("bankstatus");
        Filters_FieldsTask fil = new Filters_FieldsTask();
        fil.field_category(category,bankstatus);
    }
    @And("Select the SubCategory {},{}")
    public void select_subcategory(String Sheetname,Integer Rownumber) throws InterruptedException, IOException {
        newTestexcel reader = new newTestexcel();
        List<Map<String, String>> testdata = reader.getData("src/test/resources/ExcelData/Inputfile.xlsx",Sheetname);
        String subcategory = testdata.get(Rownumber).get("subcategory");
        String category = testdata.get(Rownumber).get("category");
        Filters_FieldsTask fil = new Filters_FieldsTask();
        fil.field_subcategory(subcategory,category);
    }
    @And("Field Fee code {},{}") //Field
    public void Fee_code(String Sheetname, Integer Rownumber) throws InterruptedException, IOException {
        newTestexcel reader = new newTestexcel();
        List<Map<String, String>> testdata = reader.getData("src/test/resources/ExcelData/Inputfile.xlsx",Sheetname);
        String feecode = testdata.get(Rownumber).get("feecode");

        Filters_FieldsTask fil = new Filters_FieldsTask();
        fil.field_feecode(feecode);
    }
    @And("Field Fee name {},{}") //Field
    public void Fee_name(String Sheetname, Integer Rownumber) throws InterruptedException, IOException {
        newTestexcel reader = new newTestexcel();
        List<Map<String, String>> testdata = reader.getData("src/test/resources/ExcelData/Inputfile.xlsx",Sheetname);
        String feename = testdata.get(Rownumber).get("feename");

        Filters_FieldsTask fil = new Filters_FieldsTask();
        fil.field_feename(feename);
    }
    @And("Field Invoice number {},{}") //Field
    public void Invoice_number(String Sheetname, Integer Rownumber) throws InterruptedException, IOException {
        newTestexcel reader = new newTestexcel();
        List<Map<String, String>> testdata = reader.getData("src/test/resources/ExcelData/Inputfile.xlsx",Sheetname);
        String invoicenum = testdata.get(Rownumber).get("invoicenum");
        String period = testdata.get(Rownumber).get("period");

        Filters_FieldsTask fil = new Filters_FieldsTask();
        fil.field_invoicenumber(invoicenum,period);

        ScreenShot shoot = new ScreenShot();
        shoot.TakeScreenShot();
    }

    @And("Select apply after complete any fields") //doy click en apply
    public void Select_apply_after_complete_any_fields() throws InterruptedException, IOException {
        Filters_FieldsTask fil = new Filters_FieldsTask();
        fil.applybuton();
        //ConfigEnvironmentTask testtimefilter = new ConfigEnvironmentTask();
        //testtimefilter.waittimefilters();

        //TimeLoad time = new TimeLoad(); // tiempo de espera
        //time.test();

        ScreenShot shoot = new ScreenShot();
        shoot.TakeScreenShot();
    }
}
