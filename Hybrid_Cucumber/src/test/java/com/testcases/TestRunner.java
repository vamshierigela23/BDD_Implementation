package com.testcases;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.Reporter;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		        
		        features = "src/test/resources/features",
				plugin = {
						"pretty",
						"html:Reports/cucumber-html-report", 
						"json:Reports/cucumber-html-report/jsonreport.json",
						"rerun:target/cucumber-reports/rerun.txt",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter: ",
						"testng:target/testng-cucumber-reports/cuketestng.xml",
						},
		        glue="com.stepdefinitions"
		        //strict= true,  
		       // monochrome = true 
					
		)

public class TestRunner  {
	
	  @AfterClass
	  public static void Extentsreport()
	  {
		  Reporter.loadXMLConfig("/src/test/resources/Extent-config.xml");
		  Reporter.setSystemInfo("user", System.getProperty("user.name"));
		  Reporter.setSystemInfo("os", "Windows");
		  Reporter.setTestRunnerOutput("Sample test runner output message");
	  }
	 
}
