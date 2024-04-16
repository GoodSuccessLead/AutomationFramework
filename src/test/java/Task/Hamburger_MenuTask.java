package Task;

import UserInterface.Filters_FieldsUI;
import UserInterface.Hamburger_MenuUI;
import UserInterface.MenuUI;

public class Hamburger_MenuTask {
    public void hamburger_menu() throws InterruptedException{
        Hamburger_MenuUI mhamgurger = new Hamburger_MenuUI();
        mhamgurger.hamburger_menu.click();
        System.out.println("Select the hamburger menu");
        Thread.sleep(3_000);
    }
    public void filters() throws InterruptedException{
        Filters_FieldsUI mhamgurger = new Filters_FieldsUI();
        mhamgurger.filters.click();
        System.out.println("Option Filters");
        Thread.sleep(10_000);
    }
}
