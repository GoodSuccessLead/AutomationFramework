package UserInterface;

import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class TesttimecontrolUI extends config {
    public WebElement time_control = driver.findElement(By.xpath("//*[@id=\"modalGrossFees\"]/div[1]/button"));
}
