package Task;

import UserInterface.TesttimecontrolUI;
import Util.TimeLoad;
import Util.config;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.function.Function;

import static Util.newlog.log;
import static com.google.common.util.concurrent.Futures.withTimeout;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.testng.Assert.assertEquals;

public class ConfigEnvironmentTask extends config {
    //public static WebDriver driver;
    public void config_drivers(){
        System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/src/main/java/drivers/msedgedriver.exe");
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new EdgeDriver(edgeOptions);//edgeOptions
        driver.manage().window().maximize();
        //TimeLoad timebrowser = new TimeLoad();
        //timebrowser.waitload_browser();
    }

    public void tear(){
        driver.quit();
    }
    public void intelica_environment(String environment) {
        log("<<<<<<< Log Started >>>>>>>");
        log("The Browser is up");
        if(Objects.equals(environment, "UAT")){
            driver.get(UAT);
            //driver.get("https://uat.intelica.com/site/en");
            System.out.println("Ambiente: "+environment);
            log("Testing Environment: "+environment);

        }if(Objects.equals(environment, "QA"))
        {
            driver.get(QA);
            //driver.get("http://qa.intelica.com:8080/site/en#home");
            System.out.println("Ambiente: "+environment);
            log("Environment: "+environment);
        }
        System.out.println("<<<<<<< Log Started >>>>>>>");
        System.out.println("Se levanto navegador");

    }
}
