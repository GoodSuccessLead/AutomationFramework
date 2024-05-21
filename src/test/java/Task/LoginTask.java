package Task;

import StepDefinitions.DemoAuto_Steps;
import UserInterface.LoginUI;
import Util.fileLog;
import org.openqa.selenium.WebDriver;

import java.io.FileNotFoundException;

import static Util.newlog.log;


public class LoginTask {
//public class LoginTask extends LoginUI
    public void Login() throws InterruptedException, FileNotFoundException {
        LoginUI select = new LoginUI();
        select.buttonLogin.click();
        Thread.sleep(5_000);
        System.out.println("Click on Login Button");
        log("Click on Login Button");
        fileLog test = new fileLog();
        test.filetxt();
    }
}
