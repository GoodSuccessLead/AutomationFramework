package UserInterface;

import StepDefinitions.DemoAuto_Steps;
import Task.ConfigEnvironmentTask;
import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CredentialsUI extends config {

    //public static WebDriver driver;
    public WebElement username = driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div/div/div/div/div/div[1]/input"));
    public WebElement password = driver.findElement(By.id("pwd"));
    public WebElement generate_token = driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div/div/div/div/div/div[3]/button"));
}
