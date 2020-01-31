package com.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MyStepDefinitions {

    public MyStepDefinitions(){

    }

    @Given("^testing MCVE for cli Main for 5.1.2$")
    public void testing_mcve_for_iocucumbercoreclimain() {
        System.out.println("Reached step 1 in 512");
    }

    @Then("^just say hello world to cli Main for 5.1.2$")
    public void just_say_something()  {
        System.out.println("Hello, Welcome to cucumber world 5.1.2!");
    }
}
