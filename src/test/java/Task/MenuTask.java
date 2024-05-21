package Task;

import StepDefinitions.ConfigEnvironmentSD;
import UserInterface.MenuUI;
import UserInterface.PopupUI;
import UserInterface.TestOptionllUI;
import UserInterface.TestOptionsUI;
import Util.ScreenShot;
import Util.TimeLoad;
import io.cucumber.plugin.event.TestSourceParsed;
import org.checkerframework.checker.units.qual.C;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Objects;

import static Util.config.driver;
import static Util.newlog.log;

public class MenuTask {
    public void menu_general() throws InterruptedException {
        MenuUI testing = new MenuUI();
        testing.menu_general.click();
        Thread.sleep(2_000);
        System.out.println("---- * Seleccionaste Menu General * ----");
        log("---- * Seleccionaste Menu General * ----");
    }
    public void submenugprincipal(String menuprincipal) throws InterruptedException {
        switch (menuprincipal) {
            case "-" -> {
                System.out.println("You send value: "+menuprincipal+" Please check you file.>>>");
                log("You send value: "+menuprincipal+" Please check you file.>>>");
                //System.exit(0);
                //driver.quit();
                //ConfigEnvironmentTask test = new ConfigEnvironmentTask();
                //test.tear();
            }
            case "Internal Use" -> {
                MenuUI submenu = new MenuUI();
                submenu.submenugprincipal1.click();
                System.out.println("Seleccionaste Menu principal: " + menuprincipal);
                log("Seleccionaste Menu principal: " + menuprincipal);
                Thread.sleep(3_000);
            }
            case "M&V Billing" -> {
                MenuUI submenu = new MenuUI();
                submenu.submenugprincipal2.click();
                System.out.println("Seleccionaste Menu principal: " + menuprincipal);
                log("Seleccionaste Menu principal: " + menuprincipal);
                Thread.sleep(3_000);
            }
            case "M&V Interchange" -> {
                MenuUI submenu = new MenuUI();
                submenu.submenugprincipal3.click();
                System.out.println("Seleccionaste Menu principal: " + menuprincipal);
                log("Seleccionaste Menu principal: " + menuprincipal);
                Thread.sleep(3_000);
            }
            case "Business Intelligence" -> {
                MenuUI submenu = new MenuUI();
                submenu.submenugprincipal4.click();
                System.out.println("Seleccionaste Menu principal: " + menuprincipal);
                log("Seleccionaste Menu principal: " + menuprincipal);
                Thread.sleep(3_000);
            }
            case "Portfolio Management" -> {
                MenuUI submenu = new MenuUI();
                submenu.submenugprincipal5.click();
                System.out.println("Seleccionaste Menu principal: " + menuprincipal);
                log("Seleccionaste Menu principal: " + menuprincipal);
                Thread.sleep(3_000);
            }
            case "File Exchange" -> {
                MenuUI submenu = new MenuUI();
                submenu.submenugprincipal6.click();
                System.out.println("Seleccionaste Menu principal: " + menuprincipal);
                log("Seleccionaste Menu principal: " + menuprincipal);
                Thread.sleep(3_000);
            }
            case "Settings" -> {
                MenuUI submenu = new MenuUI();
                submenu.submenugprincipal7.click();
                System.out.println("Seleccionaste Menu principal: " + menuprincipal);
                log("Seleccionaste Menu principal: " + menuprincipal);
                Thread.sleep(3_000);
            }
            //case null, default -> System.out.println("Error with the value / field Menu principal : " + menuprincipal);
            case null, default -> log("Error with the value / field Menu principal : " + menuprincipal);
        }
    }
    public void option_from_submenu(String submenu) throws InterruptedException {
        switch (submenu) {
            case "-" -> {
                System.out.println("You send value: "+submenu+". Please check you file.>>>");
                log("You send value: "+submenu+". Please check you file.>>>");
                //System.exit(0);
            }
            case "Fee Summary" -> {
                TestOptionsUI option = new TestOptionsUI();
                option.option_from_submenu1.click();
                System.out.println("Seleccionaste Sub-Menu: " + submenu); // se enviara como variable // esto es un listado
                log("Seleccionaste Sub-Menu: " + submenu);
                Thread.sleep(2_000);
            }
            case "Fee Library" -> {
                TestOptionsUI option = new TestOptionsUI();
                option.option_from_submenu2.click();
                System.out.println("Seleccionaste Sub-Menu: " + submenu); // se enviara como variable // esto es un listado
                log("Seleccionaste Sub-Menu: " + submenu);
                Thread.sleep(2_000);
            }
            case "Brand Files" -> {
                TestOptionsUI option = new TestOptionsUI();
                option.option_from_submenu3.click();
                System.out.println("Seleccionaste Sub-Menu: " + submenu); // se enviara como variable // esto es un listado
                log("Seleccionaste Sub-Menu: " + submenu);

                Thread.sleep(2_000);
            }
            case "Fee Dashboard" -> {
                TestOptionsUI option = new TestOptionsUI();
                option.option_from_submenu4.click();
                System.out.println("Seleccionaste Sub-Menu: " + submenu); // se enviara como variable // esto es un listado
                log("Seleccionaste Sub-Menu: " + submenu);
                Thread.sleep(2_000);
            }
            case "Fee Reports" -> {
                TestOptionsUI option = new TestOptionsUI();
                option.option_from_submenu5.click();
                System.out.println("Seleccionaste Sub-Menu: " + submenu); // se enviara como variable // esto es un listado
                log("Seleccionaste Sub-Menu: " + submenu);
                Thread.sleep(2_000);
            }
            case "Penalties" -> {
                TestOptionsUI option = new TestOptionsUI();
                option.option_from_submenu6.click();
                System.out.println("Seleccionaste Sub-Menu: " + submenu); // se enviara como variable // esto es un listado
                log("Seleccionaste Sub-Menu: " + submenu);
                Thread.sleep(2_000);
            }
            //  M&V INTERCHANGE
           // case null, default -> System.out.println("Error with the value / field Sub Menu : " + submenu);
            case null, default -> log("Error with the value / field Sub Menu : " + submenu);
        }
    }
    public void options_options(String option) throws InterruptedException, IOException {
        switch (option) {
            /* FEE SUMMARY  */
            case "-" ->
                    //System.out.println("You send value: "+option+". Please check you file.>>>");
                    log("You send value: "+option+". Please check you file.>>>");
            case "Original Invoice" -> {
                TestOptionllUI options_options = new TestOptionllUI();
                options_options.option_from_option1.getText();
                ScreenShot shoot = new ScreenShot();
                shoot.TakeScreenShot();
                options_options.option_from_option1.click();
                System.out.println("Select Option: Original Invoice");
                log("Select Option: Original Invoice");
                //Thread.sleep(10_000);                                            // AQUI AGREGAR LOADING AUTOMATICO
                TimeLoad time = new TimeLoad(); // tiempo de espera
                time.waitload_test();
            }
            case "Intelica Allocated" -> {
                TestOptionllUI options_options = new TestOptionllUI();
                options_options.option_from_option2.click();
                System.out.println("Select Option: Intelica Allocated");
                log("Select Option: Intelica Allocated");
                //Thread.sleep(5_000);// era 25
            }
            /* FEE REPORTS  */
            //PENDIENTE
            /* PENALTIES  */
            //PENDIENTE
            /* INCENTIVES */
            //PENDIENTE
            //case null, default -> System.out.println("Error with the value / field Option : " + option);
            case null, default -> log("Error with the value / field Option : " + option);
        }
    }
    public void closepopup() throws InterruptedException{
        PopupUI select = new PopupUI();
        select.close_popup.click();
        System.out.println("You select (x) on this pop up");
        log("You select (x) on this pop up");
        Thread.sleep(2_000);
    }
}
