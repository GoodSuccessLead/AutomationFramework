package Task;

import UserInterface.PerfilUI;
import Util.ScreenShot;
import org.openqa.selenium.Keys;

import java.io.IOException;
import java.util.Objects;

import static Util.newlog.log;

public class PerfilTask {
    public void perfil(String perfil) throws InterruptedException, IOException {
        if(Objects.equals(perfil, "-")){
            //PerfilUI tst = new PerfilUI();
            //tst.Textfield.click();
            //driver.findElement(By.xpath("//*[@id=\"ej2_dropdownlist_1\"]/span")).click();
            Thread.sleep(2_000);
            System.out.println("Perfil selected: "+perfil);
            log("Perfil selected: "+perfil);
        }
        else{
            //driver.findElement(By.xpath("//*[@id=\"ej2_dropdownlist_1\"]/span")).click();
            //Thread.sleep(5_000);
            //driver.findElement(By.xpath("//*[@id=\"ej2_dropdownlist_1\"]/span/input")).sendKeys(perfil);
            //Thread.sleep(5_000);
            /**************************************/
            PerfilUI webElement = new PerfilUI();
            webElement.perfilui.click();
            Thread.sleep(2_000); //se enviava 4
            webElement.perfilui.sendKeys(perfil);
            Thread.sleep(2_000);//se enviava 4
            webElement.perfilui.sendKeys(Keys.ENTER);
            Thread.sleep(10_000);//se enviava 4
            System.out.println("Perfil selected: "+perfil);
            log("Perfil selected: "+perfil);
            //driver.findElement(By.xpath("//*[@id=\"ej2_dropdownlist_1\"]/span")).submit();
            //Thread.sleep(5_000);
            ScreenShot test = new ScreenShot();
            test.TakeScreenShot();
        }
        System.out.println("Process about Perfil done.");
        log("Process about Perfil done.");
    }
}
