package UserInterface;

import StepDefinitions.DemoAuto_Steps;
import Task.ConfigEnvironmentTask;
import Task.LoginTask;
import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginUI extends config {
    //public static WebDriver driver;
    public WebElement buttonLogin = driver.findElement(By.xpath("//*[@id=\"headertop\"]/div[2]/nav/button"));
}
