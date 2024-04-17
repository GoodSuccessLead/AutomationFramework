package Util;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static Util.config.driver;

public class Filtersconfig {
    public void field_group_config1(String group) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        //Thread.sleep(1_000);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        //Thread.sleep(1_000);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        //Thread.sleep(1_000);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        //Thread.sleep(1_000);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        //Thread.sleep(1_000);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        //Thread.sleep(1_000);
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        Thread.sleep(2_000);
        //System.out.println("You Send: "+group+".");
        //System.out.println("You press Enter");
        System.out.println("Field Group: "+group);
    }
    public void field_group_config2(String group) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        Thread.sleep(2_000);
        //System.out.println("You Send: "+group+".");
        //System.out.println("You press Enter");
        System.out.println("Field Group: "+group);
    }
    public void field_group_config3(String group) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        Thread.sleep(2_000);
        //System.out.println("You Send: "+group+".");
        //System.out.println("You press Enter");
        System.out.println("Field Group: "+group);
    }
    public void field_group_config4(String group) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        Thread.sleep(2_000);
        //System.out.println("You Send: "+group+".");
        //System.out.println("You press Enter");
        System.out.println("Field Group: "+group);
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
        //System.out.println("You Send: "+group+".");
        //System.out.println("You press Enter");
        System.out.println("Field Group: "+group);
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
        //System.out.println("You Send: "+group+".");
        //System.out.println("You press Enter");
        System.out.println("Field Group: "+group);
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
        //System.out.println("You Send: "+group+".");
        //System.out.println("You press Enter");
        System.out.println("Field Group: "+group);
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
        //System.out.println("You Send: "+group+".");
        //System.out.println("You press Enter");
        System.out.println("Field Group: "+group);
    }

    public void field_region_config(String region) throws  InterruptedException {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        //Thread.sleep(1_000);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        //Thread.sleep(1_000);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        //Thread.sleep(1_000);
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        Thread.sleep(1_000);//era 5
        System.out.println("Field Region: "+region);
    }
    public void field_country_config(String country) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        //Thread.sleep(1_000);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        //Thread.sleep(1_000);
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        Thread.sleep(1_000);//4
        System.out.println("Field Region: "+country);
    }
    public void field_bank_config(String bank) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        //Thread.sleep(1_000);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        //Thread.sleep(1_000);
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        Thread.sleep(1_000);//4
        System.out.println("Field Bank: "+bank);
    }
    public void field_bank_status_config(String bankstatus) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        //Thread.sleep(1_000);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        //Thread.sleep(1_000);
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        //Thread.sleep(4_000);
        System.out.println("Field Region"+bankstatus);
    }
    public void field_category_config(String category) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        //Thread.sleep(1_000);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        //Thread.sleep(1_000);
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        Thread.sleep(1_000);//4
        System.out.println("Field Region"+category);
    }
    public void field_subcategory_config(String subcategory) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        //Thread.sleep(1_000);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        //Thread.sleep(1_000);
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        Thread.sleep(1_000);//4
        System.out.println("Field Region"+subcategory);
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
