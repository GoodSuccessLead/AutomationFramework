package Task;

import UserInterface.Field_periodUI;
import UserInterface.Filters_FieldsUI;
import UserInterface.RegionfieldUI;
import Util.FiltersActions;
import Util.FiltersValidations;
import Util.TimeLoad;
import Util.filtros;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.sql.Time;
import java.util.List;
import java.util.Objects;
import java.util.logging.Filter;

import static Util.newlog.log;

public class Filters_FieldsTask {
    public WebDriver driver;
    public void clear_button(){
        Filters_FieldsUI button = new Filters_FieldsUI();
        button.clear_button.click();
        System.out.println("You select clear button.");
        log("You select clear button.");
    }
    public void field_group(String group) throws InterruptedException {
        Filters_FieldsUI filters = new Filters_FieldsUI();//You can use xpath, ID or name whatever you like
        filters.field_group.click();
        Thread.sleep(2_000);//5
        System.out.println("Seleccionaste flecha del desplegable Group: "+group);
        log("Seleccionaste flecha del desplegable Group: "+group);

        FiltersValidations validation = new FiltersValidations();
        validation.validation_group(group);
        System.out.println("Field Group selected: "+group);
        log("Field Group selected: "+group);
    }
    public void field_region(String region, String group) throws InterruptedException{
        RegionfieldUI filters = new RegionfieldUI();
        filters.field_region.click();
        Thread.sleep(1_000);//4
        FiltersValidations validation = new FiltersValidations();
        validation.validation_region(region,group);
        System.out.println("Field Region selected: "+region);
        log("Field Region selected: "+region);
        }

    public void field_country(String country, String region) throws InterruptedException{
        Filters_FieldsUI filters = new Filters_FieldsUI();
        filters.field_country.click();
        Thread.sleep(1_000);//4
        System.out.println("Seleccionaste flecha del desplegable -Country");
        log("Seleccionaste flecha del desplegable -Country");

        FiltersValidations validation = new FiltersValidations();
        validation.validation_country(country,region);

        System.out.println("Field Country selected: "+country);
        log("Field Country selected: "+country);
    }
    public void field_bank(String bank, String country) throws InterruptedException{
        Filters_FieldsUI filters = new Filters_FieldsUI();
        filters.field_bank.click();
        Thread.sleep(1_000);//4

        System.out.println("Seleccionaste flecha del desplegable -Bank");
        log("Seleccionaste flecha del desplegable -Bank");

        FiltersValidations validation = new FiltersValidations();
        validation.validation_bank(bank,country);


        System.out.println("Field Bank selected: "+bank);
        log("Field Bank selected: "+bank);
    }
    public void field_bank_status(String bankstatus,String bank) throws InterruptedException{
        Filters_FieldsUI filters = new Filters_FieldsUI();
        filters.field_bank_status.click();
        Thread.sleep(2_000);//4
        System.out.println("Seleccionaste flecha del desplegable -BankStatus");
        log("Seleccionaste flecha del desplegable -BankStatus");
        // se maneja por teclado

        FiltersValidations validation = new FiltersValidations();
        validation.validation_banktatus(bankstatus,bank);
        System.out.println("Field bankstatus selected: "+bankstatus);
        log("Field bankstatus selected: "+bankstatus);
    }
    public void field_category(String category,String bankstatus) throws InterruptedException{
        Filters_FieldsUI filters = new Filters_FieldsUI();
        filters.field_category.click();
        Thread.sleep(2_000);//4
        System.out.println("Seleccionaste flecha del desplegable -Category");
        log("Seleccionaste flecha del desplegable -Category");
        // se maneja por teclado

        FiltersValidations validation = new FiltersValidations();
        validation.validation_category(category,bankstatus);
        System.out.println("Field Category selected: "+category);
        log("Field Category selected: "+category);
    }
    public void field_subcategory(String subcategory, String category) throws InterruptedException{
        Filters_FieldsUI filters = new Filters_FieldsUI();
        filters.field_subcategory.click();
        Thread.sleep(2_000);//4
        System.out.println("Seleccionaste flecha del desplegable -SubCategory");
        log("Seleccionaste flecha del desplegable -SubCategory");
        // se maneja por teclado
        FiltersValidations validation = new FiltersValidations();
        validation.validation_sub_category(subcategory,category);
        System.out.println("Field Subcategory selected: "+subcategory);
        log("Field Subcategory selected: "+subcategory);
    }

    public void field_feecode(String feecode) throws InterruptedException{
        Filters_FieldsUI filters = new Filters_FieldsUI();
        filters.field_feecode.click();
        filters.field_feecode.sendKeys(feecode);
        System.out.println("You Send Fee code "+feecode);
        log("You Send Fee code "+feecode);
        Thread.sleep(3_000);
    }
    public void field_feename(String feename) throws InterruptedException{
        Filters_FieldsUI filters = new Filters_FieldsUI();
        filters.field_feename.click();
        //Thread.sleep(1_000);
        filters.field_feename.sendKeys(feename);
        //Thread.sleep(2_000);
        System.out.println("You Send Fee name "+feename);
        log("You Send Fee name "+feename);
        Thread.sleep(3_000);
    }
    public void field_invoicenumber(String invoicenum,String period)throws InterruptedException{
        Filters_FieldsUI filters = new Filters_FieldsUI();
        filters.field_invoicenumber.click();
        Thread.sleep(1_000);

        if(Objects.equals(invoicenum, "-")){
            Field_periodUI x = new Field_periodUI();
            x.field_period.click();
            Thread.sleep(2_000);
            System.out.println("Seleccionaste flecha del desplegable -Period"+period);
            log("Seleccionaste flecha del desplegable -Period"+period);
            // se maneja por teclado
            FiltersActions test = new FiltersActions();
            test.field_period_config(period);
            Thread.sleep(2_000);
        }
        else{
            filters.field_invoicenumber.sendKeys(invoicenum);
            Thread.sleep(2_000);//4
        }
        System.out.println("You Send the field invoicenum: "+invoicenum);
        log("You Send the field invoicenum: "+invoicenum);
    }
    public void applybuton()throws InterruptedException{
        Filters_FieldsUI button = new Filters_FieldsUI();
        button.apply_button.click();
        System.out.println("You select buttom Apply");
        log("You select buttom Apply");
        //Thread.sleep(10_000);
        TimeLoad time = new TimeLoad();
        time.waitload_fin();
    }
}
