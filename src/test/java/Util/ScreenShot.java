package Util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static Util.config.driver;
import static Util.newlog.log;

public class ScreenShot {
    public void TakeScreenShot() throws IOException {
        //File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
// Now you can do whatever you need to do with it, for example copy somewhere
        //FileUtils.copyFile(scrFile, new File("C:\\Anderson Cabana\\Proyectos\\Versiones_Proyecto\\v1.3\\Demo_Automatizacion\\ScreenShots\\screenshot.png"));

        /*JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border = '3px solid red'",Element);
         */

        Date d = new Date();
        System.out.println(d.toString());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");         // Your each screenshot will be taken as this format "Year-Month-Date-Hours-Minutes-Seconds"
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile,  new File("C:\\Anderson Cabana\\Proyectos\\Versiones_Proyecto\\v1.3\\Demo_Automatizacion\\ScreenShots\\"+sdf.format(d)+".png"));

        System.out.println("Page Screen is taken successfully.");
        log("Page Screen is taken successfully.");
    }
}
