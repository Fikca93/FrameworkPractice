package com.google.step_definitions;

import com.google.utils.Driver;
import com.google.utils.Driver2;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

        @Before
        public void setup(){
            System.out.println("Empty hook before");
        }



    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) Driver2.getDriver() ).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png",scenario.getName()); // ... and embed it in the report.

            Driver2.closeDriver();
            System.out.println("::: End of test execution :::");
        }
    }



}































