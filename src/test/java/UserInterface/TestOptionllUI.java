package UserInterface;

import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestOptionllUI extends config {
    public WebElement option_from_option = driver.findElement(By.xpath("//*[@id=\"default-sidebar\"]/div/nav/ul/li[3]/ul/li[1]/ul/li[1]/a/div/p"));
}
