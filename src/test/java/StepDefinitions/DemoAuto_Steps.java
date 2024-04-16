package StepDefinitions;
import Task.*;
import UserInterface.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.util.Objects;
import java.util.logging.Filter;

public class DemoAuto_Steps {
    //public WebDriver driver;

    @Before
    public void setup() {
        ConfigEnvironmentTask tst = new ConfigEnvironmentTask();
        tst.config_drivers();
    }
    @After
    public void tearDown() {
        ConfigEnvironmentTask tst = new ConfigEnvironmentTask();
        tst.tear();
    }

    @Given("I access to the platform {}")
    public void i_access_to_the_platform(String environment) {
        ConfigEnvironmentTask tst = new ConfigEnvironmentTask();
        tst.intelica_environment(environment);
    }

    @When("Select login button")
    public void select_login_button() throws InterruptedException {

        LoginTask tst = new LoginTask();
        tst.Login();

        //driver.findElement(By.xpath("//*[@id=\"headertop\"]/div[2]/nav/button")).click();
        //LoginUI select = new LoginUI();
        //select.buttonLogin.click();
        //Thread.sleep(5_000);
        //System.out.println("Click on Login Button");
    }

    @And("I enter a username {}")
    public void i_enter_a_username(String username) throws InterruptedException{
        CredentialsTask tst = new CredentialsTask();
        tst.username(username);

        /*
        CredentialsUI user = new CredentialsUI();
        user.username.click();
        user.username.sendKeys(username);
        Thread.sleep(2_000);
        System.out.println("You send User");
        */

    }

    @And("Enter the passsword {}")
    public void enter_the_password(String password) throws InterruptedException {
        CredentialsTask tst = new CredentialsTask();
        tst.password(password);

        /*
        CredentialsUI pwd = new CredentialsUI();
        pwd.password.click();
        pwd.password.sendKeys(password);
        System.out.println("You send Password");
         */
    }

    @And("Select generate token button")
    public void select_generate_token_button() throws InterruptedException {
        CredentialsTask tst = new CredentialsTask();
        tst.token();
        /*
        CredentialsUI button = new CredentialsUI();
        button.generate_token.click();
        Thread.sleep(18_000); //se coloco tiempo solo para visualiar la plataforma
        System.out.println("Click on Generate Token");
        //se controlara la carga
        */
    }

    @Then("I select perfil {}")
    public void i_select_perfil(String perfil) throws InterruptedException {
        PerfilTask tst = new PerfilTask();
        tst.perfil(perfil);
    }

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
    @And("Select suboption from principal menu suboption")
    public void Select_suboption_from_principal_suboption() throws InterruptedException {
        MenuTask tst = new MenuTask();
        tst.option_from_submenu();
        /*
        MenuUI option = new MenuUI();
        option.option_from_submenu.click();
        System.out.println("Seleccionaste Sub-Menu_FeeSummary"); // se enviara como variable // esto es un listado
        Thread.sleep(10_000);
        */
    }

    @And("Select newoption from submenusubmenu")
    public void Select_newoption_from_submenusubmenu() throws InterruptedException {
        MenuTask tst = new MenuTask();
        tst.options_options();
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

    //menu hamburguesa
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

    @And("Select clear button")
    public void select_clear_button() throws InterruptedException{
        Filters_FieldsTask tst = new Filters_FieldsTask();
        tst.clear_button();
        //boton clear
        /*FilterUi x = new FilterUi();
        x.clearbutton.click();
        System.out.println("Select clear button");*/
/*
        driver.findElement(By.xpath("//*[@id=\"HamburgerMenu\"]/div/div[2]/div[2]/app-filter/div[2]/button[2]")).click();
        Thread.sleep(3_000);
        System.out.println("Select clear button");*/

       /*  //ACTUALIZADO - UTILIAR ESTE
        Filters_FieldsUI button = new Filters_FieldsUI();
        button.clear_button.click();
        System.out.println("You select clear button.");

        */

    }

    @And("Select Group {}")
    public void select_group(String group) throws InterruptedException {
        Filters_FieldsTask fil = new Filters_FieldsTask();
        fil.field_group(group);
        /*
        Filters_FieldsUI filters = new Filters_FieldsUI();//You can use xpath, ID or name whatever you like
        filters.field_group.click();
        Thread.sleep(4_000);
        System.out.println("Seleccionaste flecha del desplegable"+group);

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        Thread.sleep(1_000);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        Thread.sleep(1_000);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        Thread.sleep(1_000);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        Thread.sleep(1_000);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        Thread.sleep(1_000);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        Thread.sleep(1_000);
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        Thread.sleep(6_000);
        //System.out.println("You Send: "+group+".");
        //System.out.println("You press Enter");
        System.out.println("Field Group: "+group);
        */
    }

   @And("Select the Region {}")
    public void select_the_region(String region) throws InterruptedException{
    Filters_FieldsTask fil = new Filters_FieldsTask();
    fil.field_region(region);
        /*
       Filters_FieldsUI filters = new Filters_FieldsUI();
       filters.field_region.click();
       Thread.sleep(4_000);
       System.out.println("Seleccionaste flecha del desplegable -Region");

       Actions actions = new Actions(driver);
       actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
       Thread.sleep(1_000);
       actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
       Thread.sleep(1_000);
       actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
       Thread.sleep(1_000);
       actions.sendKeys(Keys.ENTER).build().perform();//press enter
       Thread.sleep(5_000);
       System.out.println("Field Region: "+region);
    */
    }

    @And("Select Country {}")
    public void select_country(String country) throws InterruptedException{
        Filters_FieldsTask fil = new Filters_FieldsTask();
        fil.field_country(country);
        /*
        Filters_FieldsUI filters = new Filters_FieldsUI();
        filters.field_country.click();
        Thread.sleep(4_000);
        System.out.println("Seleccionaste flecha del desplegable -Country");

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        Thread.sleep(1_000);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        Thread.sleep(1_000);
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        Thread.sleep(4_000);
        System.out.println("Field Region: "+country);
        */
    }

    @And("Select Bank {}")
    public void select_bank(String bank) throws InterruptedException{
        Filters_FieldsTask fil = new Filters_FieldsTask();
        fil.field_bank(bank);
        /*
        Filters_FieldsUI filters = new Filters_FieldsUI();
        filters.field_bank.click();
        Thread.sleep(4_000);
        System.out.println("Seleccionaste flecha del desplegable -Bank");

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        Thread.sleep(1_000);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        Thread.sleep(1_000);
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        Thread.sleep(4_000);
        System.out.println("Field Bank: "+bank);
        */
    }

    @And("Select BankStatus {}")
    public void select_bankstatus(String bankstatus) throws InterruptedException{
        Filters_FieldsTask fil = new Filters_FieldsTask();
        fil.field_bank_status(bankstatus);
       /*
        Filters_FieldsUI filters = new Filters_FieldsUI();
        filters.field_bank_status.click();
        Thread.sleep(4_000);
        System.out.println("Seleccionaste flecha del desplegable -BankStatus");

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        Thread.sleep(1_000);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        Thread.sleep(1_000);
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        Thread.sleep(4_000);
        System.out.println("Field Region"+bankstatus);

        */
    }
    @And("Select the Category {}")
    public void select_the_category(String category) throws InterruptedException{
        Filters_FieldsTask fil = new Filters_FieldsTask();
        fil.field_category(category);
        /*
        Filters_FieldsUI filters = new Filters_FieldsUI();
        filters.field_category.click();
        Thread.sleep(4_000);
        System.out.println("Seleccionaste flecha del desplegable -Category");

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        Thread.sleep(1_000);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        Thread.sleep(1_000);
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        Thread.sleep(4_000);
        System.out.println("Field Region"+category);

         */
    }
    @And("Select the SubCategory {}")
    public void select_subcategory(String subcategory) throws InterruptedException{
        Filters_FieldsTask fil = new Filters_FieldsTask();
        fil.field_subcategory(subcategory);
        /*
        Filters_FieldsUI filters = new Filters_FieldsUI();
        filters.field_subcategory.click();
        Thread.sleep(4_000);
        System.out.println("Seleccionaste flecha del desplegable -SubCategory");

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        Thread.sleep(1_000);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        Thread.sleep(1_000);
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        Thread.sleep(4_000);
        System.out.println("Field Region"+subcategory);
        */

    }
    //stepdefinition FUELD PERIODO
   // @And("Select Period {}")
    //public void select_period(String period) throws InterruptedException{
       // Filters_FieldsTask fil = new Filters_FieldsTask();
        //fil.field_period(period);
        /*
        Filters_FieldsUI filters = new Filters_FieldsUI();
        filters.field_period.click();

        //WebElement selectElement = driver.findElement(By.xpath("//*[@id=\"HamburgerMenu\"]/div/div[2]/div[2]/app-filter/div[1]/div/div[2]/div[6]/div/div[2]"));
        //selectElement.click();
        Thread.sleep(4_000);
        System.out.println("Seleccionaste flecha del desplegable -Period");

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        Thread.sleep(1_000);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        Thread.sleep(1_000);
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        Thread.sleep(4_000);
        System.out.println("Field Region"+period);
 */
 //   }


    @And("Field Fee code {}") //Field
    public void Fee_code(String feecode) throws InterruptedException {
        Filters_FieldsTask fil = new Filters_FieldsTask();
        fil.field_feecode(feecode);
        /*
        //Subcategory
        //driver.findElement(By.xpath("//*[@id=\"HamburgerMenu\"]/div/div[2]/div[2]/app-filter/div[1]/div/div[1]/div[3]/div/div[2]/input")).click();
        //driver.findElement(By.xpath("//*[@id=\"HamburgerMenu\"]/div/div[2]/div[2]/app-filter/div[1]/div/div[1]/div[3]/div/div[2]/input")).sendKeys("TEAT7995"); // se enviara por variables
        //System.out.println("You Send Fee code ");
        Filters_FieldsUI filters = new Filters_FieldsUI();
        filters.field_feecode.click();
        filters.field_feecode.sendKeys(feecode);

        //driver.findElement(By.xpath("//*[@id=\"HamburgerMenu\"]/div/div[2]/div[2]/app-filter/div[1]/div/div[2]/div[2]/div/div[2]/input")).click();
        //driver.findElement(By.xpath("//*[@id=\"HamburgerMenu\"]/div/div[2]/div[2]/app-filter/div[1]/div/div[2]/div[2]/div/div[2]/input")).sendKeys(feecode); // se enviara por variables

        System.out.println("You Send Fee code "+feecode);
        Thread.sleep(3_000);
        */
    }

    @And("Field Fee name {}") //Field
    public void Fee_name(String feename) throws InterruptedException {
        Filters_FieldsTask fil = new Filters_FieldsTask();
        fil.field_feename(feename);
        /*
        Filters_FieldsUI filters = new Filters_FieldsUI();
        filters.field_feename.click();
        Thread.sleep(1_000);
        filters.field_feename.sendKeys(feename);
        Thread.sleep(2_000);
        System.out.println("You Send Fee name "+feename);
        Thread.sleep(5_000);

         */
    }

    @And("Field Invoice number {},{}") //Field
    public void Invoice_number(String invoicenum, String period) throws InterruptedException {
        Filters_FieldsTask fil = new Filters_FieldsTask();
        fil.field_invoicenumber(invoicenum,period);

        //Subcategory
        //driver.findElement(By.xpath("//*[@id=\"HamburgerMenu\"]/div/div[2]/div[2]/app-filter/div[1]/div/div[2]/div[4]/div/div[2]/input")).click();
        //driver.findElement(By.xpath("//*[@id=\"HamburgerMenu\"]/div/div[2]/div[2]/app-filter/div[1]/div/div[2]/div[1]/div/div[2]/input")).sendKeys("1111");
        //-driver.findElement(By.xpath("//*[@id=\"HamburgerMenu\"]/div/div[2]/div[2]/app-filter/div/div/div[2]/div[4]/div/div[2]")).click();

        //-driver.findElement(By.xpath("//*[@id=\"HamburgerMenu\"]/div/div[2]/div[2]/app-filter/div/div/div[2]/div[4]/div/div[2]")).sendKeys("1111");
        //*[@id="HamburgerMenu"]/div/div[2]/div[2]/app-filter/div/div/div[2]/div[4]/div/div[2]
        //driver.findElement(By.className("txtBoxStyle ng-pristine ng-valid ng-star-inserted ng-touched")).click();
        //driver.findElement(By.className("txtBoxStyle ng-pristine ng-valid ng-star-inserted ng-touched")).sendKeys("1111");

        /* UTILIZAR ESTE ULTIMO ES ACTUALIZADO****
        Filters_FieldsUI filters = new Filters_FieldsUI();
        filters.field_invoicenumber.click();
        Thread.sleep(1_000);
        filters.field_invoicenumber.sendKeys(invoicenum);
        System.out.println("You Send Fee invoice_number ");
        Thread.sleep(4_000);

         */
    }


    /*
    @And("Field Entity type") //Field
    public void Entity_type() throws InterruptedException {
        //Subcategory
        driver.findElement(By.xpath(""));
        System.out.println("");
        Thread.sleep(5_000);
    }*/
    /*
    @And("Field Period") //Field
    public void Period() throws InterruptedException {
        //Subcategory
        driver.findElement(By.xpath(""));
        System.out.println("");
        Thread.sleep(5_000);
    }*/

    @And("Select apply after complete any fields") //doy click en apply
    public void Select_apply_after_complete_any_fields() throws InterruptedException {
        Filters_FieldsTask fil = new Filters_FieldsTask();
        fil.applybuton();
        /*
        Filters_FieldsUI button = new Filters_FieldsUI();
        button.apply_button.click();
        System.out.println("You select buttom Apply");
        Thread.sleep(1_000);

         */
    }
}