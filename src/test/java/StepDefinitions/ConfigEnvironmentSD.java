package StepDefinitions;

import Task.ConfigEnvironmentTask;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

public class ConfigEnvironmentSD {
    @Before
    public void setup() {
        ConfigEnvironmentTask tst = new ConfigEnvironmentTask();
        tst.config_drivers();
    }
    @After
    public void tearDown() {
        ConfigEnvironmentTask tst = new ConfigEnvironmentTask();
        tst.tear();
    }
    @Given("I access to the platform {}")
    public void i_access_to_the_platform(String environment) {
        ConfigEnvironmentTask tst = new ConfigEnvironmentTask();
        tst.intelica_environment(environment);
    }
}
