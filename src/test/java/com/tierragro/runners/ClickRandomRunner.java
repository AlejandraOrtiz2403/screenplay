package com.tierragro.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/com.tierragro.feature/ClickRandom.feature",
        glue = "com.tierragro.stepDefinitions",
        snippets = SnippetType.CAMELCASE
)
public class ClickRandomRunner {
}
