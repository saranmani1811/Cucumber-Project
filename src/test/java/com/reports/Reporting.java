package com.reports;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.baseclass.BaseClass;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

/**
 * @Description Used to jnmReporting
 * @author Lenovo
 * @Date 15/08/2022
 */
public class Reporting extends BaseClass {

	/**
	 * 
	 * @param jsonReportFile
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static  void getJvmReporting(String jsonReportFile) throws FileNotFoundException, IOException {

		File file = new File(getPropertyValue("jvmpath"));

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
