package Task;

import StepDefinitions.DemoAuto_Steps;
import UserInterface.CredentialsUI;

public class CredentialsTask {
    public void username(String username) throws InterruptedException {
        CredentialsUI user = new CredentialsUI();
        user.username.click();
        user.username.sendKeys(username);
        //Thread.sleep(2_000);
        System.out.println("You send User");
    }

    public void password(String password){
        CredentialsUI pwd = new CredentialsUI();
        pwd.password.click();
        pwd.password.sendKeys(password);
        System.out.println("You send Password");
    }

    public void token() throws InterruptedException{
        CredentialsUI button = new CredentialsUI();
        button.generate_token.click();
        Thread.sleep(35_000); //se coloco tiempo solo para visualiar la plataforma
        System.out.println("Click on Generate Token");
        //se controlara la carga
    }
}
