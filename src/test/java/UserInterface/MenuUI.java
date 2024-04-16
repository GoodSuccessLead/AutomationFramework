package UserInterface;

import StepDefinitions.DemoAuto_Steps;
import Task.ConfigEnvironmentTask;
import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuUI extends config {
    //public static WebDriver driver;
    // OK- public WebElement menu_general = driver.findElement(By.xpath("//*[@id=\"btn-menu\"]/button/i"));
    public WebElement menu_general = driver.findElement(By.xpath("//*[@id=\"btn-menu\"]/button/i"));
    //ORIGINAL public WebElement menu_general = driver.findElement(By.xpath("//*[@id=\"btn-menu\"]/button"));
    //*[@id="btn-menu"]/button
    //public WebElement menugeneral = driver.findElement(By.className("class=\"btn-menu ms-0 ng-tns-c144-1\""));
    public WebElement submenugprincipal = driver.findElement(By.xpath("//*[@id=\"default-sidebar\"]/div/nav/ul/li[3]"));

}
