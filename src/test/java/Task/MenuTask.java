package Task;

import UserInterface.MenuUI;
import UserInterface.PopupUI;
import UserInterface.TestOptionllUI;
import UserInterface.TestOptionsUI;
import io.cucumber.plugin.event.TestSourceParsed;
import org.testng.annotations.Test;

public class MenuTask {
    public void menu_general() throws InterruptedException {
        MenuUI testing = new MenuUI();
        testing.menu_general.click();
        Thread.sleep(5_000);
        System.out.println("---- * Seleccionaste Menu General * ----");
    }

    public void submenugprincipal(String menuprincipal) throws InterruptedException{
        MenuUI submenu = new MenuUI();
        submenu.submenugprincipal.click();
        //Select x = new Select(submenu.submenugprincipal);
        //x.selectByVisibleText(menuprincipal);
        //submenu.submenugprincipal.click();
        System.out.println("Seleccionaste Sub-Menu: "+menuprincipal); // se enviara como variable // esto es un listado
        Thread.sleep(10_000);
    }

    public void option_from_submenu() throws InterruptedException{
        TestOptionsUI option = new TestOptionsUI();
        option.option_from_submenu.click();
        System.out.println("Seleccionaste Sub-Menu: FeeSummary"); // se enviara como variable // esto es un listado
        Thread.sleep(10_000);
    }

    public void options_options() throws InterruptedException{
        TestOptionllUI options_options = new TestOptionllUI();
        options_options.option_from_option.click();
        System.out.println("Select Option: Original Invoice");
        Thread.sleep(20_000);
    }
    public void closepopup() throws InterruptedException{
        PopupUI select = new PopupUI();
        select.close_popup.click();
        System.out.println("You select (x) on this pop up");
        Thread.sleep(4_000);
    }
}
