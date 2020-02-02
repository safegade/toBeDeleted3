package com.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MyStepDefinitions_New {

    public MyStepDefinitions_New(){

    }

    @Given("^testing MCVE for cli Main$")
    public void testing_mcve_for_iocucumbercoreclimain() {
        System.out.println("Reached step 1 in 471 to 512");
    }

    @Then("^just say \"([^\"]*)\"$")
    public void just_say_something(String strArg1)  {
        System.out.println("Hello, Welcome to cucumber world!");
    }
}
