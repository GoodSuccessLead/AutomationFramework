package Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import static Util.newlog.log;
import static java.sql.DriverManager.getDriver;

public class TimeLoad extends config{
        public void waitload_test() {
            // Define FluentWait with a timeout of 30 seconds and polling interval of 1 second
            Wait<WebDriver> wait = new FluentWait<>(driver)
                    .withTimeout(Duration.ofSeconds(10))
                    .pollingEvery(Duration.ofSeconds(5))
                    .ignoring(Exception.class);

            // Wait until the page title contains "Example Domain"
            WebElement element = wait.until(new Function<WebDriver, WebElement>() {
                public WebElement apply(WebDriver driver){
                    return driver.findElement(By.xpath("//*[@id=\"modalGrossFees\"]/div[1]/button"));
                }
            });
            System.out.println("wait - Loading...");
            log("wait - Loading...");
        }
    public void waitload_fin() {

        // Define FluentWait with a timeout of 30 seconds and polling interval of 1 second
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(Exception.class);

        // Wait until the page title contains "Example Domain"
        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver){
                return driver.findElement(By.xpath("//*[@id=\"HamburgerMenu\"]/button"));
            }
        });
        System.out.println("wait - Loading...");
        log("wait - Loading...");
    }
    public void waitload_filters_country() {

        // Define FluentWait with a timeout of 30 seconds and polling interval of 1 second
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(Exception.class);

        // Wait until the page title contains "Example Domain"
        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver){
                return driver.findElement(By.xpath("//*[@id=\"HamburgerMenu\"]/div/div[2]/div[2]/app-filter/div[1]/div/div[1]/div[4]/div/div[2]"));
            }
        });
        System.out.println("wait - Loading...");
        log("wait - Loading...");
    }
    public void waitload_filters_bank() {

        // Define FluentWait with a timeout of 30 seconds and polling interval of 1 second
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(Exception.class);

        // Wait until the page title contains "Example Domain"
        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver){
                return driver.findElement(By.xpath("//*[@id=\"HamburgerMenu\"]/div/div[2]/div[2]/app-filter/div[1]/div/div[1]/div[5]/div/div[2]"));
            }
        });
        System.out.println("wait - Loading...");
        log("wait - Loading...");
    }
}