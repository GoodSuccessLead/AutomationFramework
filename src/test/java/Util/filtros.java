package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static Util.config.driver;

public class filtros {
    public void filtroautomatico() {
        /*
        WebElement select = driver.findElement(By.id("filter_hidden"));
        List<WebElement> options = select.findElements(By.tagName("option"));

        for (WebElement option : options) {

            if("Germany".equals(option.getText().trim()))

                option.click();
        }

         */
        Select region = new Select(driver.findElement(By.id("filter_hidden")));
        for(int j=1;j<7;j++)
            System.out.println(region.getOptions().get(j).getText());
        region.selectByVisibleText("Europe SEPA");

    }
}
