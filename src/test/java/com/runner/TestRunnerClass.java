package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reports.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false, monochrome = true, stepNotifications = true, plugin = { "pretty",
		"json:target\\out.json" }, features = { "src/test/resources" }, glue = "com.stepdefinition")

public class TestRunnerClass {

	@AfterClass
	public static void afterClass() {
		Reporting.getJvmReporting(System.getProperty("jsonpath"));
	}

}
