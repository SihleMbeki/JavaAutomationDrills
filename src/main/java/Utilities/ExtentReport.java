package Utilities;

import java.io.File;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
	private static String filename;
	private static String reportDirectory;
	private static ExtentHtmlReporter htmlReporter;
	private static ExtentReports reports;
	public static ExtentTest test;

	public static void createReport(String directory) {
		directory = directory + "\\Report\\";
		Date date = new Date();
		filename = date.toString().replace(":", "_").replace(" ", "_");
		reportDirectory = directory + filename + "\\";
		File testDirectory = new File(reportDirectory);
		if (!testDirectory.exists()) {
			testDirectory.mkdir();
		}
		filename = reportDirectory + "Report_" + filename + ".html";
		htmlReporter = new ExtentHtmlReporter(filename);
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("QA Automation");
		htmlReporter.config().setReportName("Way2Automation");
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);
	}

	public static ExtentTest createTest(String testName) {
		test = reports.createTest(testName);
		return test;
	}

	public static void closeReport() {
		if (reports != null) {
			reports.flush();
		}
	}

	public static String getDirectory() {

		return reportDirectory;
	}

}
