package UserInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Util.config.driver;

public class Field_periodUI {
    public WebElement field_period = driver.findElement(By.xpath("//*[@id=\"HamburgerMenu\"]/div/div[2]/div[2]/app-filter/div[1]/div/div[2]/div[6]/div/div[2]"));
}
