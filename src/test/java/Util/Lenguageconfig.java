package Util;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static Util.config.driver;

public class Lenguageconfig {
    public void lenguage_config(String lenguage) throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        Thread.sleep(1_000);
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        Thread.sleep(1_000);
        System.out.println("You change the lenguage: "+lenguage);
    }
}
