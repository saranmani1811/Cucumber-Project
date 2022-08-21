package com.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

/**
 * @Description Used to jnmReporting
 * @author Lenovo
 * @Date 15/08/2022
 */
public class Reporting {

	/**
	 * 
	 * @param jsonReportFile
	 */
	public static void getJvmReporting(String jsonReportFile) {

		File file = new File(System.getProperty("jvmpath"));

		Configuration configuration = new Configuration(file, "Adactin Automation");
		configuration.addClassifications("OS", "Windows10");
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("Version", "104.00");
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonReportFile);
		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		builder.generateReports();

	}

}
