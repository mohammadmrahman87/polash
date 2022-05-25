package com.amazon.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
	    features = "Features",
		glue = "com.amazon.steps"
			
)

public class AmazonTestRunner extends AbstractTestNGCucumberTests {
	

}
