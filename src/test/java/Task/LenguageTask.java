package Task;

import UserInterface.LenguageUI;
import Util.Lenguageconfig;
import Util.ScreenShot;

import java.io.IOException;
import java.util.Objects;

import static Util.newlog.log;

public class LenguageTask {
    public void lenguagebutton (String lenguage) throws InterruptedException, IOException {
        if(Objects.equals(lenguage, "ESP")){
            LenguageUI button = new LenguageUI();
            button.lenguage_button.click();
            ScreenShot shoot = new ScreenShot();
            shoot.TakeScreenShot();
            //Action
            Lenguageconfig test = new Lenguageconfig();
            test.lenguage_config(lenguage);
        }else {
            System.out.println("Default lenguage: "+lenguage);
            log("Default lenguage: "+lenguage);
            //pruebas mapeo campos
        }
    }
}
