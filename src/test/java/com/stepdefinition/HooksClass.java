package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.baseclass.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

/**
 * 
 * @author Lenovo
 * @Description Used to launch browser and TakesScreenshot
 * @Date 15/08/2022
 */
public class HooksClass extends BaseClass {

	/**
	 * 
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	@Before
	public void beforeSuite() throws FileNotFoundException, IOException {

		getDriverType(getPropertyValue("browser"));
		loadUrl(getPropertyValue("url"));
		maximize();
	}

	/**
	 * 
	 * @param scenario
	 */
	@After
	public void AfterSuite(Scenario scenario) {
		scenario.embed(screenshotAsByte(), "images/png", "Every Scenario");
		quit();
	}

}
