package org.example.stepDef;

import io.cucumber.java.en.Given;

public class stepdefinition {

    @Given("user is able to login to the application")
    public void user_is_able_to_login_to_the_application() {
        System.out.println("User is able to login to the application");
    }
}
