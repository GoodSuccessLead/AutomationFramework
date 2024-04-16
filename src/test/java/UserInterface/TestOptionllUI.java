package UserInterface;

import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestOptionllUI extends config {
    public WebElement option_from_option1 = driver.findElement(By.xpath("//*[@id=\"default-sidebar\"]/div/nav/ul/li[3]/ul/li[1]/ul/li[1]/a/div/p"));
    public WebElement option_from_option2 = driver.findElement(By.xpath("//*[@id=\"default-sidebar\"]/div/nav/ul/li[3]/ul/li[1]/ul/li[2]/a/div/p"));
}
