package Task;

import StepDefinitions.DemoAuto_Steps;
import UserInterface.LoginUI;
import org.openqa.selenium.WebDriver;


public class LoginTask {
//public class LoginTask extends LoginUI
    public void Login() throws InterruptedException {
        LoginUI select = new LoginUI();
        select.buttonLogin.click();
        Thread.sleep(5_000);
        System.out.println("Click on Login Button");
    }
}
