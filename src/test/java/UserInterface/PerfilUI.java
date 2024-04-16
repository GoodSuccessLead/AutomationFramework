package UserInterface;

import StepDefinitions.DemoAuto_Steps;
import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PerfilUI extends config {
    //public static WebDriver driver;
    public WebElement Textfield = driver.findElement(By.xpath("//*[@id=\"ej2_dropdownlist_1\"]/span"));
    public WebElement perfilui = driver.findElement(By.xpath("//*[@id=\"ej2_dropdownlist_1\"]/span/input"));
}
