package StepDefinitions;

import Task.CredentialsTask;
import io.cucumber.java.en.And;

public class CredentialsSD {
    @And("I enter a username {}")
    public void i_enter_a_username(String username) throws InterruptedException{
        CredentialsTask tst = new CredentialsTask();
        tst.username(username);
        /*
        CredentialsUI user = new CredentialsUI();
        user.username.click();
        user.username.sendKeys(username);
        Thread.sleep(2_000);
        System.out.println("You send User");
        */
    }
    @And("Enter the passsword {}")
    public void enter_the_password(String password) throws InterruptedException {
        CredentialsTask tst = new CredentialsTask();
        tst.password(password);
        /*
        CredentialsUI pwd = new CredentialsUI();
        pwd.password.click();
        pwd.password.sendKeys(password);
        System.out.println("You send Password");
         */
    }
    @And("Select generate token button")
    public void select_generate_token_button() throws InterruptedException {
        CredentialsTask tst = new CredentialsTask();
        tst.token();
        /*
        CredentialsUI button = new CredentialsUI();
        button.generate_token.click();
        Thread.sleep(18_000); //se coloco tiempo solo para visualiar la plataforma
        System.out.println("Click on Generate Token");
        //se controlara la carga
        */
    }
}
