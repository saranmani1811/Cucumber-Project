package com.runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.baseclass.BaseClass;
import com.reports.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false, monochrome = true, stepNotifications = true, plugin = { "pretty",
		"json:target\\out.json" }, features = { "src/test/resources" }, glue = "com.stepdefinition")

public class TestRunner extends BaseClass {

	@AfterClass
	public static void afterClass() throws FileNotFoundException, IOException {
		Reporting.getJvmReporting(getPropertyValue("jsonpath"));
	}

}
