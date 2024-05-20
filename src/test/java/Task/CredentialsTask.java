package Task;

import StepDefinitions.DemoAuto_Steps;
import UserInterface.CredentialsUI;
import Util.Readfiledevxlsx;
import Util.Readfilexlsx;
import Util.ScreenShot;

import java.io.IOException;

import static Util.newlog.log;

public class CredentialsTask {

    public void username(String username) throws InterruptedException, IOException {
        //Readfilexlsx testing = new Readfilexlsx();
        //testing.readfiles(username);
        CredentialsUI user = new CredentialsUI();
        user.username.click();
        user.username.sendKeys(username);
        //ConfigEnvironmentTask time = new ConfigEnvironmentTask();
        //time.waittime();
        Thread.sleep(2_000);
        //System.out.println("You send User: "+username);
        log("You send User: "+username);
    }

    public void password(String password) throws IOException {
        CredentialsUI pwd = new CredentialsUI();
        pwd.password.click();
        pwd.password.sendKeys(password);
        //System.out.println("You send Password: "+password);
        log("You send Password: "+password);
    }

    public void token() throws InterruptedException{
        CredentialsUI button = new CredentialsUI();
        button.generate_token.click();
        Thread.sleep(10_000); //se coloco tiempo solo para visualiar la plataforma
        System.out.println("Click on Generate Token");
        log("Click on Generate Token");
        //se controlara la carga
    }
}
