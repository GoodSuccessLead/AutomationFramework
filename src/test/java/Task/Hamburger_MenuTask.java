package Task;

import UserInterface.Filters_FieldsUI;
import UserInterface.Hamburger_MenuUI;
import UserInterface.MenuUI;

import static Util.newlog.log;

public class Hamburger_MenuTask {
    public void hamburger_menu() throws InterruptedException{
        Hamburger_MenuUI mhamgurger = new Hamburger_MenuUI();
        mhamgurger.hamburger_menu.click();
        System.out.println("Select the hamburger menu");
        log("Select the hamburger menu");
        Thread.sleep(2_000);//3
    }
    public void filters() throws InterruptedException{
        Filters_FieldsUI mhamgurger = new Filters_FieldsUI();
        mhamgurger.filters.click();
        System.out.println("Option Filters");
        log("Option Filters");
        Thread.sleep(5_000);//10
    }
}
