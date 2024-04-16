package UserInterface;

import StepDefinitions.DemoAuto_Steps;
import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Filters_FieldsUI extends config {
    //public static WebDriver driver;
    public WebElement filters = driver.findElement(By.xpath("//*[@id=\"HamburgerMenu\"]/div/div[1]/div[2]/button[1]/span[2]"));
    public WebElement clear_button = driver.findElement(By.xpath("//*[@id=\"HamburgerMenu\"]/div/div[2]/div[2]/app-filter/div[2]/button[2]"));
    public WebElement field_group = driver.findElement(By.xpath("//*[@id=\"filter\"]/span/span"));
    public WebElement field_region = driver.findElement(By.xpath("//*[@id=\"HamburgerMenu\"]/div/div[2]/div[2]/app-filter/div[1]/div/div[1]/div[2]/div/div[2]"));
    public WebElement field_country = driver.findElement(By.xpath("//*[@id=\"HamburgerMenu\"]/div/div[2]/div[2]/app-filter/div[1]/div/div[1]/div[3]/div/div[2]"));
    public WebElement field_bank = driver.findElement(By.xpath("//*[@id=\"HamburgerMenu\"]/div/div[2]/div[2]/app-filter/div[1]/div/div[1]/div[4]/div/div[2]"));
    public WebElement field_bank_status = driver.findElement(By.xpath("//*[@id=\"HamburgerMenu\"]/div/div[2]/div[2]/app-filter/div[1]/div/div[1]/div[5]/div/div[2]"));
    public WebElement field_category = driver.findElement(By.xpath("//*[@id=\"HamburgerMenu\"]/div/div[2]/div[2]/app-filter/div[1]/div/div[1]/div[6]/div/div[2]"));
    public WebElement field_subcategory = driver.findElement(By.xpath("//*[@id=\"HamburgerMenu\"]/div/div[2]/div[2]/app-filter/div[1]/div/div[2]/div[1]/div/div[2]"));
   // public WebElement field_period = driver.findElement(By.xpath("//*[@id=\"HamburgerMenu\"]/div/div[2]/div[2]/app-filter/div[1]/div/div[2]/div[6]/div/div[2]"));
    public WebElement field_feecode = driver.findElement(By.xpath("//*[@id=\"HamburgerMenu\"]/div/div[2]/div[2]/app-filter/div[1]/div/div[2]/div[2]/div/div[2]/input"));
    public WebElement field_feename = driver.findElement(By.xpath("//*[@id=\"HamburgerMenu\"]/div/div[2]/div[2]/app-filter/div[1]/div/div[2]/div[3]/div/div[2]/input"));
    public WebElement field_invoicenumber = driver.findElement(By.xpath("//*[@id=\"HamburgerMenu\"]/div/div[2]/div[2]/app-filter/div[1]/div/div[2]/div[4]/div/div[2]/input"));
    public WebElement apply_button = driver.findElement(By.xpath("//*[@id=\"HamburgerMenu\"]/div/div[2]/div[2]/app-filter/div[2]/button[1]"));

}
