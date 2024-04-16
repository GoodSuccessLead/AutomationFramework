package Task;

import Util.config;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.util.Objects;

import static Util.config.QA;
import static Util.config.UAT;

public class ConfigEnvironmentTask extends config {
    //public static WebDriver driver;
    public void config_drivers(){
        System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/src/main/java/drivers/msedgedriver.exe");
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new EdgeDriver(edgeOptions);//edgeOptions
        driver.manage().window().maximize();
    }
    public void tear(){
        driver.quit();
    }

    public void intelica_environment(String environment){
        if(Objects.equals(environment, "UAT")){
            driver.get(UAT);
            //driver.get("https://uat.intelica.com/site/en");
            System.out.println("Ambiente: "+environment);

        }if(Objects.equals(environment, "QA"))
        {
            driver.get(QA);
            //driver.get("http://qa.intelica.com:8080/site/en#home");
            System.out.println("Ambiente: "+environment);
        }
        System.out.println("<<<<<<< Log Iniciado >>>>>>>");
        System.out.println("Se levanto navegador");
    }
}
