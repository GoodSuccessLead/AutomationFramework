package UserInterface;

import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LenguageUI extends config {
    public WebElement lenguage_button = driver.findElement(By.xpath("//*[@id=\"ej2_dropdownlist_0\"]/span/span"));
}
