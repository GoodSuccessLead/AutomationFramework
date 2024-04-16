package StepDefinitions;

import Task.PerfilTask;
import io.cucumber.java.en.Then;

public class PerfilSD {
    @Then("I select perfil {}")
    public void i_select_perfil(String perfil) throws InterruptedException {
        PerfilTask tst = new PerfilTask();
        tst.perfil(perfil);
    }
}
