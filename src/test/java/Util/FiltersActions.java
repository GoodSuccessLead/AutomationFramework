package Util;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static Util.config.driver;

public class FiltersActions {
    public void field_group_config1(String group) throws InterruptedException{
        //Group - Barclays
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        //Thread.sleep(1_000);
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        Thread.sleep(2_000);
    }
    public void field_group_config2(String group) throws InterruptedException{
        //Group - Erste
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        Thread.sleep(2_000);
    }
    public void field_group_config3(String group) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        Thread.sleep(2_000);
    }
    public void field_group_config4(String group) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        Thread.sleep(2_000);
    }
    public void field_group_config5(String group) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        Thread.sleep(2_000);
    }
    public void field_group_config6(String group) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        Thread.sleep(2_000);
    }
    public void field_group_config7(String group) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        Thread.sleep(2_000);
    }
    public void field_group_config8(String group) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        Thread.sleep(2_000);
    }

    public void field_region_config1(String region) throws  InterruptedException {

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.UP).build().perform();
        Thread.sleep(1_000);
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(1_000);//era 5
    }
    public void field_region_config2(String region) throws  InterruptedException {

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        Thread.sleep(1_000);//era 5
    }
    public void field_region_config3(String region) throws  InterruptedException {

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        Thread.sleep(1_000);
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        Thread.sleep(1_000);//era 5
    }

    public void field_country_config1(String country) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        //Thread.sleep(1_000);//4
        TimeLoad time = new TimeLoad();
        time.waitload_filters_country();
    }
    public void field_country_config2(String country) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        //Thread.sleep(1_000);
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        //Thread.sleep(1_000);//4
        TimeLoad time = new TimeLoad();
        time.waitload_filters_country();
    }
    public void field_country_config3(String country) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        //Thread.sleep(1_000);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        //Thread.sleep(1_000);
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        //Thread.sleep(1_000);//4
        TimeLoad time = new TimeLoad();
        time.waitload_filters_country();
    }
    public void field_bank_config1(String bank) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        TimeLoad time = new TimeLoad();
        time.waitload_filters_country();
        //Thread.sleep(3_000);//4
        TimeLoad times = new TimeLoad();
        times.waitload_filters_bank();
    }
    public void field_bank_config2(String bank) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        TimeLoad times = new TimeLoad();
        times.waitload_filters_bank();
    }
    public void field_bank_config3(String bank) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        TimeLoad times = new TimeLoad();
        times.waitload_filters_bank();
    }
    public void field_bank_config4(String bank) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        TimeLoad times = new TimeLoad();
        times.waitload_filters_bank();
    }
    public void field_bank_config5(String bank) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        //Thread.sleep(3_000);//4
        TimeLoad times = new TimeLoad();
        times.waitload_filters_bank();
    }
    public void field_bank_config6(String bank) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        TimeLoad times = new TimeLoad();
        times.waitload_filters_bank();
    }
    public void field_bank_config7(String bank) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        TimeLoad times = new TimeLoad();
        times.waitload_filters_bank();
    }
    public void field_bank_config8(String bank) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        TimeLoad times = new TimeLoad();
        times.waitload_filters_bank();
    }
    public void field_bank_config9(String bank) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        TimeLoad times = new TimeLoad();
        times.waitload_filters_bank();
    }
    public void field_bank_config10(String bank) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        TimeLoad times = new TimeLoad();
        times.waitload_filters_bank();
    }
    public void field_bank_config11(String bank) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        //Thread.sleep(3_000);//4
        TimeLoad times = new TimeLoad();
        times.waitload_filters_bank();
    }
    public void field_bank_status_config1(String bankstatus) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.UP).build().perform();//press down arrow key
        //Thread.sleep(1_000);
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        Thread.sleep(2_000);
    }
    public void field_bank_status_config2(String bankstatus) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        Thread.sleep(2_000);
    }
    public void field_bank_status_config3(String bankstatus) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        Thread.sleep(2_000);
    }
    public void field_category_config1(String category) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        //Thread.sleep(1_000);
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        Thread.sleep(1_000);//4
    }
    public void field_category_config2(String category) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        //Thread.sleep(1_000);
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        Thread.sleep(1_000);//4
    }
    public void field_category_config3(String category) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        //Thread.sleep(1_000);
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        Thread.sleep(1_000);//4
    }
    public void field_subcategory_config1(String subcategory) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        Thread.sleep(1_000);//4
    }
    public void field_subcategory_config2(String subcategory) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        Thread.sleep(1_000);//4
    }
    public void field_subcategory_config3(String subcategory) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        Thread.sleep(1_000);//4
    }
    public void field_subcategory_config4(String subcategory) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        Thread.sleep(1_000);//4
    }
    public void field_subcategory_config5(String subcategory) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        Thread.sleep(1_000);//4
    }
    public void field_period_config(String period) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        //Thread.sleep(1_000);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        //Thread.sleep(1_000);
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        Thread.sleep(1_000);//4
        System.out.println("Field Region"+period);
    }
}
