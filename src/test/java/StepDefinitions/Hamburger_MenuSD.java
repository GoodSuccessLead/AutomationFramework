package StepDefinitions;

import Task.Hamburger_MenuTask;
import io.cucumber.java.en.And;

public class Hamburger_MenuSD {

    @And("Select the hamburger menu")
    public void Select_the_hamburger_menu() throws InterruptedException {
        Hamburger_MenuTask tst = new Hamburger_MenuTask();
        tst.hamburger_menu();
        /*
        Hamburger_MenuUI mhamgurger = new Hamburger_MenuUI();
        mhamgurger.hamburger_menu.click();
        System.out.println("Select the hamburger menu");
        Thread.sleep(2_000);
         */
    }
    @And("Select the first option filters")
    public void Select_the_first_option_filters() throws InterruptedException {
        Hamburger_MenuTask tst = new Hamburger_MenuTask();
        tst.filters();
        /*
        Hamburger_MenuUI option = new Hamburger_MenuUI();
        option.filters.click();
        System.out.println("Option Filters");
        Thread.sleep(3_000);
         */
    }
}
