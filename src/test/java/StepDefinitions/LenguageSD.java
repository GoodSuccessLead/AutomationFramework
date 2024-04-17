package StepDefinitions;

import Task.LenguageTask;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LenguageSD {
    @And("Select lenguage {}")
    public void lenguageplatform(String lenguage) throws InterruptedException{
        LenguageTask select = new LenguageTask();
        select.lenguagebutton(lenguage);
    }
}
