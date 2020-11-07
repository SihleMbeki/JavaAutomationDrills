package TestNGFramework.Framework;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

import Utilities.ExcelReader;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Base {
	protected String excelFileName;
	protected ExcelReader excel;
	String directory;

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method ");
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
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite ");
	}

}
