package StepDefinitions;

import Task.ConfigEnvironmentTask;
import Task.MenuTask;
import Util.ScreenShot;
import Util.TimeLoad;
import Util.newTestexcel;
import io.cucumber.java.en.And;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class MenuSD {

    @And("I select the menu")
    public void i_select_the_menu() throws InterruptedException {
        MenuTask tst = new MenuTask();
        tst.menu_general();
    }
    @And("Select suboption from menu intelica {},{}")
    public void Select_sub_menu_principal(String Sheetname, Integer Rownumber) throws InterruptedException, IOException {
        newTestexcel reader = new newTestexcel();
        List<Map<String, String>> testdata = reader.getData("src/test/resources/ExcelData/Inputfile.xlsx",Sheetname);
        String menuprincipal = testdata.get(Rownumber).get("menuprincipal");

        MenuTask tst = new MenuTask();
        tst.submenugprincipal(menuprincipal);
    }
    @And("Select suboption from principal menu suboption {},{}")
    public void Select_suboption_from_principal_suboption(String Sheetname, Integer Rownumber) throws InterruptedException, IOException {
        newTestexcel reader = new newTestexcel();
        List<Map<String, String>> testdata = reader.getData("src/test/resources/ExcelData/Inputfile.xlsx",Sheetname);
        String submenu = testdata.get(Rownumber).get("submenu");

        MenuTask tst = new MenuTask();
        tst.option_from_submenu(submenu);

        ScreenShot shoot = new ScreenShot();
        shoot.TakeScreenShot();
        /*
        MenuUI option = new MenuUI();
        option.option_from_submenu.click();
        System.out.println("Seleccionaste Sub-Menu_FeeSummary"); // se enviara como variable // esto es un listado
        Thread.sleep(10_000);
        */
    }
    @And("Select newoption from submenusubmenu {},{}")
    public void Select_newoption_from_submenusubmenu(String Sheetname, Integer Rownumber) throws InterruptedException, IOException {
        newTestexcel reader = new newTestexcel();
        List<Map<String, String>> testdata = reader.getData("src/test/resources/ExcelData/Inputfile.xlsx",Sheetname);
        String option = testdata.get(Rownumber).get("option");

        MenuTask tst = new MenuTask();
        tst.options_options(option);



    }
    //Control de Pop Ups
    @And("Close x popup")
    public void Selectxpopup() throws InterruptedException, IOException {
        //ConfigEnvironmentTask lp = new ConfigEnvironmentTask();
        //lp.waittime();
        MenuTask tst = new MenuTask();
        tst.closepopup();

        ScreenShot shoot = new ScreenShot();
        shoot.TakeScreenShot();
    }
}