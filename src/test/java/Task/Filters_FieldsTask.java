package Task;

import UserInterface.Field_periodUI;
import UserInterface.Filters_FieldsUI;
import Util.Filtersconfig;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

public class Filters_FieldsTask {
    public WebDriver driver;
    public void clear_button(){
        Filters_FieldsUI button = new Filters_FieldsUI();
        button.clear_button.click();
        System.out.println("You select clear button.");
    }
    public void field_group(String group) throws InterruptedException{
        Filters_FieldsUI filters = new Filters_FieldsUI();//You can use xpath, ID or name whatever you like
        filters.field_group.click();
        Thread.sleep(5_000);
        System.out.println("Seleccionaste flecha del desplegable Group");
    // se maneja por teclado
        Filtersconfig x = new Filtersconfig();
        x.field_group_config(group);

    }
    public void field_region(String region) throws InterruptedException{
        Filters_FieldsUI filters = new Filters_FieldsUI();
        filters.field_region.click();
        Thread.sleep(4_000);
        System.out.println("Seleccionaste flecha del desplegable -Region");
        // se maneja por teclado
        Filtersconfig x = new Filtersconfig();
        x.field_region_config(region);
    }
    public void field_country(String country) throws InterruptedException{
        Filters_FieldsUI filters = new Filters_FieldsUI();
        filters.field_country.click();
        Thread.sleep(4_000);
        System.out.println("Seleccionaste flecha del desplegable -Country");
        // se maneja por teclado
        Filtersconfig x = new Filtersconfig();
        x.field_country_config(country);

    }
    public void field_bank(String bank) throws InterruptedException{
        Filters_FieldsUI filters = new Filters_FieldsUI();
        filters.field_bank.click();
        Thread.sleep(4_000);
        System.out.println("Seleccionaste flecha del desplegable -Bank");
        // se maneja por teclado
        Filtersconfig x = new Filtersconfig();
        x.field_bank_config(bank);
    }
    public void field_bank_status(String bankstatus) throws InterruptedException{
        Filters_FieldsUI filters = new Filters_FieldsUI();
        filters.field_bank_status.click();
        Thread.sleep(4_000);
        System.out.println("Seleccionaste flecha del desplegable -BankStatus");
        // se maneja por teclado
        Filtersconfig x = new Filtersconfig();
        x.field_bank_status_config(bankstatus);
    }
    public void field_category(String category) throws InterruptedException{
        Filters_FieldsUI filters = new Filters_FieldsUI();
        filters.field_category.click();
        Thread.sleep(4_000);
        System.out.println("Seleccionaste flecha del desplegable -Category");
        // se maneja por teclado
        Filtersconfig x = new Filtersconfig();
        x.field_category_config(category);
    }
    public void field_subcategory(String subcategory) throws InterruptedException{
        Filters_FieldsUI filters = new Filters_FieldsUI();
        filters.field_subcategory.click();
        Thread.sleep(4_000);
        System.out.println("Seleccionaste flecha del desplegable -SubCategory");
        // se maneja por teclado
        Filtersconfig x = new Filtersconfig();
        x.field_subcategory_config(subcategory);
    }
    /*
    public void field_period(String period) throws InterruptedException{
        Filters_FieldsUI filters = new Filters_FieldsUI();
        filters.field_period.click();
        Thread.sleep(4_000);
        System.out.println("Seleccionaste flecha del desplegable -Period");
        // se maneja por teclado
        Filtersconfig x = new Filtersconfig();
        x.field_period_config(period);
    }*/
    public void field_feecode(String feecode) throws InterruptedException{
        Filters_FieldsUI filters = new Filters_FieldsUI();
        filters.field_feecode.click();
        filters.field_feecode.sendKeys(feecode);
        System.out.println("You Send Fee code "+feecode);
        Thread.sleep(3_000);
    }
    public void field_feename(String feename) throws InterruptedException{
        Filters_FieldsUI filters = new Filters_FieldsUI();
        filters.field_feename.click();
        Thread.sleep(1_000);
        filters.field_feename.sendKeys(feename);
        Thread.sleep(2_000);
        System.out.println("You Send Fee name "+feename);
        Thread.sleep(5_000);
    }
    public void field_invoicenumber(String invoicenum,String period)throws InterruptedException{
        Filters_FieldsUI filters = new Filters_FieldsUI();
        filters.field_invoicenumber.click();
        Thread.sleep(1_000);

        if(Objects.equals(invoicenum, "-")){
            //PerfilUI tst = new PerfilUI();
            //tst.Textfield.click();
            //driver.findElement(By.xpath("//*[@id=\"ej2_dropdownlist_1\"]/span")).click();
            Field_periodUI x = new Field_periodUI();
            x.field_period.click();
            Thread.sleep(4_000);
            System.out.println("Seleccionaste flecha del desplegable -Period"+period);
            // se maneja por teclado
            Filtersconfig test = new Filtersconfig();
            test.field_period_config(period);
            Thread.sleep(2_000);
        }
        else{
            filters.field_invoicenumber.sendKeys(invoicenum);
            Thread.sleep(4_000);
        }
        System.out.println("You Send the field invoicenum: "+invoicenum);
    }
    public void applybuton()throws InterruptedException{
        Filters_FieldsUI button = new Filters_FieldsUI();
        button.apply_button.click();
        System.out.println("You select buttom Apply");
        Thread.sleep(2_000);
    }
}
