package UserInterface;

import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PopupUI extends config {
    public WebElement close_popup = driver.findElement(By.xpath("//*[@id=\"modalGrossFees\"]/div[1]/button"));
}