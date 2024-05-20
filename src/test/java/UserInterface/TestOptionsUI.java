package UserInterface;

import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestOptionsUI extends config {
    public WebElement option_from_submenu1 = driver.findElement(By.xpath("//*[@id=\"default-sidebar\"]/div/nav/ul/li[3]/ul/li[1]/a/div"));
    public WebElement option_from_submenu2 = driver.findElement(By.xpath("//*[@id=\"default-sidebar\"]/div/nav/ul/li[3]/ul/li[2]/a/div"));
    public WebElement option_from_submenu3 = driver.findElement(By.xpath("//*[@id=\"default-sidebar\"]/div/nav/ul/li[3]/ul/li[3]/a/div"));
    public WebElement option_from_submenu4 = driver.findElement(By.xpath("//*[@id=\"default-sidebar\"]/div/nav/ul/li[3]/ul/li[4]/a/div"));
    public WebElement option_from_submenu5 = driver.findElement(By.xpath("//*[@id=\"default-sidebar\"]/div/nav/ul/li[3]/ul/li[5]/a/div"));
    public WebElement option_from_submenu6 = driver.findElement(By.xpath("//*[@id=\"default-sidebar\"]/div/nav/ul/li[3]/ul/li[6]/a/div"));

    //m&v Interchange
    //public WebElement option_from_submenu7 = driver.findElement(By.xpath("//*[@id=\"default-sidebar\"]/div/nav/ul/li[4]/ul/li[1]/a/div"));

}
