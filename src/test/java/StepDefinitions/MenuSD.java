package StepDefinitions;

import Task.MenuTask;
import io.cucumber.java.en.And;

public class MenuSD {
    @And("I select the menu")
    public void i_select_the_menu() throws InterruptedException {
        MenuTask tst = new MenuTask();
        tst.menu_general();
    }
    @And("Select suboption from menu intelica {}")
    public void Select_sub_menu_principal(String menuprincipal) throws InterruptedException {
        MenuTask tst = new MenuTask();
        tst.submenugprincipal(menuprincipal);
        /*
        driver.findElement(By.xpath("//*[@id=\"default-sidebar\"]/div/nav/ul/li[2]/a/div/p")).click();// opcion 1
        MenuUI submenu = new MenuUI();
        submenu.submenugprincipal.click();
        //Select x = new Select(submenu.submenugprincipal);
        //x.selectByVisibleText(menuprincipal);
        //submenu.submenugprincipal.click();
        System.out.println("Seleccionaste Sub-Menu_"+menuprincipal); // se enviara como variable // esto es un listado
        Thread.sleep(10_000);
        */
    }
    @And("Select suboption from principal menu suboption {}")
    public void Select_suboption_from_principal_suboption(String submenu) throws InterruptedException {
        MenuTask tst = new MenuTask();
        tst.option_from_submenu(submenu);
        /*
        MenuUI option = new MenuUI();
        option.option_from_submenu.click();
        System.out.println("Seleccionaste Sub-Menu_FeeSummary"); // se enviara como variable // esto es un listado
        Thread.sleep(10_000);
        */
    }
    @And("Select newoption from submenusubmenu {}")
    public void Select_newoption_from_submenusubmenu(String option) throws InterruptedException {
        MenuTask tst = new MenuTask();
        tst.options_options(option);
        /*
        MenuUI options_options = new MenuUI();
        options_options.option_from_option.click();
        System.out.println("Seleccionaste Original Invoice");
        Thread.sleep(20_000);
         */
    }
    //Control de Pop Ups
    @And("Close x popup")
    public void Selectxpopup() throws InterruptedException {
        MenuTask tst = new MenuTask();
        tst.closepopup();
        /*
        MenuUI popup = new MenuUI();
        popup.closepopup.click();
        System.out.println("You close the PopUp");
        Thread.sleep(3_000);
         */
    }
}