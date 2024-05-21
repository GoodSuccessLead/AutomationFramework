package UserInterface;

import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class RegionfieldUI extends config {
    public WebElement field_region = driver.findElement(By.xpath("//*[@id=\"HamburgerMenu\"]/div/div[2]/div[2]/app-filter/div[1]/div/div[1]/div[2]/div/div[2]"));

}
