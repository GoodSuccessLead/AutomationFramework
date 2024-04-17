package Task;

import UserInterface.LenguageUI;
import Util.Lenguageconfig;

import java.util.Objects;

public class LenguageTask {
    public void lenguagebutton (String lenguage) throws InterruptedException{
        if(Objects.equals(lenguage, "ESP")){
            LenguageUI button = new LenguageUI();
            button.lenguage_button.click();
            //Action
            Lenguageconfig test = new Lenguageconfig();
            test.lenguage_config(lenguage);
        }else {
            System.out.println("Default lenguage: "+lenguage);
        }
    }
}
