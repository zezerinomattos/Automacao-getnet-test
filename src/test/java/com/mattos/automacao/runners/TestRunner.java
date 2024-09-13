package com.mattos.automacao.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
	    glue = "com.mattos.automacao.steps",
	    plugin = {"pretty", "html:target/cucumber-reports.html"},
	    snippets = SnippetType.CAMELCASE,
	    monochrome = true
)

public class TestRunner {

}
