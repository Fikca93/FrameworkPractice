package com.google.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com\\google\\step_definitions",
        features = "src\\test\\resources\\features",
        dryRun = false,
        publish = true,
        plugin = "json:target/cucumber.json",
        tags = ""

)
public class CucumberRunner {
}
