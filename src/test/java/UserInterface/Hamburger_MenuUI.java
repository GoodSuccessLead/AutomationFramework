package UserInterface;

import StepDefinitions.DemoAuto_Steps;
import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Hamburger_MenuUI extends config {
    //public static WebDriver driver;
    public WebElement hamburger_menu = driver.findElement(By.xpath("//*[@id=\"HamburgerMenu\"]/button"));

}