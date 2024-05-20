package StepDefinitions;

import Task.LoginTask;
import io.cucumber.java.en.When;

import java.io.FileNotFoundException;

public class LoginSD {
    @When("Select login button")
    public void select_login_button() throws InterruptedException, FileNotFoundException {

        LoginTask tst = new LoginTask();
        tst.Login();

        //driver.findElement(By.xpath("//*[@id=\"headertop\"]/div[2]/nav/button")).click();
        //LoginUI select = new LoginUI();
        //select.buttonLogin.click();
        //Thread.sleep(5_000);
        //System.out.println("Click on Login Button");
    }
}
