package UserInterface;

import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestOptionsUI extends config {
    public WebElement option_from_submenu = driver.findElement(By.xpath("//*[@id=\"default-sidebar\"]/div/nav/ul/li[3]/ul/li[1]/a/div"));
}
