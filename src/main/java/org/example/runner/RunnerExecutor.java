package org.example.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
(
        features = {"src\\main\\resources\\user_Story"},
        glue = {"org.example.stepDef"},
        plugin = {"pretty","html:target/Report.html",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        stepNotifications = true

)
public class RunnerExecutor {
}
