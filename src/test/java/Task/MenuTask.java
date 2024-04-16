package Task;

import UserInterface.MenuUI;
import UserInterface.PopupUI;
import UserInterface.TestOptionllUI;
import UserInterface.TestOptionsUI;
import io.cucumber.plugin.event.TestSourceParsed;
import org.testng.annotations.Test;

import java.util.Objects;

public class MenuTask {
    public void menu_general() throws InterruptedException {
        MenuUI testing = new MenuUI();
        testing.menu_general.click();
        Thread.sleep(5_000);
        System.out.println("---- * Seleccionaste Menu General * ----");
    }

    public void submenugprincipal(String menuprincipal) throws InterruptedException{
        if(Objects.equals(menuprincipal, "Internal Use")){
            MenuUI submenu = new MenuUI();
            submenu.submenugprincipal1.click();
        }if(Objects.equals(menuprincipal, "M&V Billing")) {
            MenuUI submenu = new MenuUI();
            submenu.submenugprincipal2.click();
        }if(Objects.equals(menuprincipal, "M&V Interchange")) {
            MenuUI submenu = new MenuUI();
            submenu.submenugprincipal3.click();
        }if(Objects.equals(menuprincipal, "Business Intelligence")) {
            MenuUI submenu = new MenuUI();
            submenu.submenugprincipal4.click();
        }if(Objects.equals(menuprincipal, "Portfolio Management")) {
            MenuUI submenu = new MenuUI();
            submenu.submenugprincipal5.click();
        }if(Objects.equals(menuprincipal, "File Exchange")) {
            MenuUI submenu = new MenuUI();
            submenu.submenugprincipal6.click();
        }else{
            System.out.println("Error with: "+menuprincipal);
        }
        //Select x = new Select(submenu.submenugprincipal);
        //x.selectByVisibleText(menuprincipal);
        //submenu.submenugprincipal.click();
        System.out.println("Seleccionaste Sub-Menu: "+menuprincipal); // se enviara como variable // esto es un listado
        Thread.sleep(5_000);
    }

    public void option_from_submenu(String submenu) throws InterruptedException {
        if (Objects.equals(submenu, "Fee Summary")) {
            TestOptionsUI option = new TestOptionsUI();
            option.option_from_submenu1.click();
            System.out.println("Seleccionaste Sub-Menu: " + submenu); // se enviara como variable // esto es un listado
            Thread.sleep(5_000);
        }if (Objects.equals(submenu, "Fee Library")) {
            TestOptionsUI option = new TestOptionsUI();
            option.option_from_submenu2.click();
            System.out.println("Seleccionaste Sub-Menu: " + submenu); // se enviara como variable // esto es un listado
            Thread.sleep(5_000);
        }if (Objects.equals(submenu, "Brand Files")) {
            TestOptionsUI option = new TestOptionsUI();
            option.option_from_submenu3.click();
            System.out.println("Seleccionaste Sub-Menu: " + submenu); // se enviara como variable // esto es un listado
            Thread.sleep(5_000);
        }if (Objects.equals(submenu, "Fee Dashboard")) {
            TestOptionsUI option = new TestOptionsUI();
            option.option_from_submenu4.click();
            System.out.println("Seleccionaste Sub-Menu: " + submenu); // se enviara como variable // esto es un listado
            Thread.sleep(5_000);
        }if (Objects.equals(submenu, "Fee Reports")) {
            TestOptionsUI option = new TestOptionsUI();
            option.option_from_submenu5.click();
            System.out.println("Seleccionaste Sub-Menu: " + submenu); // se enviara como variable // esto es un listado
            Thread.sleep(5_000);
        }if (Objects.equals(submenu, "Penalties")) {
            TestOptionsUI option = new TestOptionsUI();
            option.option_from_submenu6.click();
            System.out.println("Seleccionaste Sub-Menu: " + submenu); // se enviara como variable // esto es un listado
            Thread.sleep(5_000);
        }else{
            System.out.println("Error with: "+submenu);
        }
    }
    public void options_options(String option) throws InterruptedException{
        if(Objects.equals(option, "Original Invoice")){
            TestOptionllUI options_options = new TestOptionllUI();
            options_options.option_from_option1.click();
            System.out.println("Select Option: Original Invoice");
            Thread.sleep(20_000);
        }if(Objects.equals(option, "Intelica Allocated")){
            TestOptionllUI options_options = new TestOptionllUI();
            options_options.option_from_option2.click();
            System.out.println("Select Option: Original Invoice");
            Thread.sleep(20_000);
        }
    }
    public void closepopup() throws InterruptedException{
        PopupUI select = new PopupUI();
        select.close_popup.click();
        System.out.println("You select (x) on this pop up");
        Thread.sleep(4_000);
    }
}
