package TestNGFramework.Framework;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentTest;

import Utilities.ExcelReader;
import Utilities.ExtentReport;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Base {
	protected String excelFileName;
	protected ExcelReader excel;
	protected static ExtentTest test;
	String directory;

	@BeforeMethod
	public void beforeMethod(Method method) {
		test=ExtentReport.createTest(method.getName());
	
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method ");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class ");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After class ");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test ");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After test ");
	}

	@BeforeSuite
	public void beforeSuite() {
		directory=System.getProperty("user.dir");
		excelFileName=directory+"\\src\\test\\resources\\testdata.xlsx";
		excel=new ExcelReader(excelFileName);
		ExtentReport.createReport(directory);
	}

	@AfterSuite
	public void afterSuite() {
		ExtentReport.closeReport();
	}

}
