package com.certificacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/userLogin.feature",
        tags = "@stories",
        glue = "com.certificacion.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class DemoRunner {

}
