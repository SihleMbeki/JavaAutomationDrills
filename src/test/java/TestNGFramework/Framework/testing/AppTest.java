package TestNGFramework.Framework.testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestNGFramework.Framework.Base;

public class AppTest extends Base{

	 @Test(dataProvider = "dp")
	public void test(Integer n, String s) {
		  System.out.println("Integer "+n);
		  System.out.println("String "+s);
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, };
	}

}
