package org.CompanyName.testRunnerClass;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "classpath:features/FBLogin.feature" },
				glue = {"classpath:com.cucumber.framework.stepdefinition","classpath:com.psprs.stepDefinition.FBLoginStepDefinition"},
				plugin = {"html:target/cucumber-html-report"})
public class FBLoginRunner {
	
	

}
