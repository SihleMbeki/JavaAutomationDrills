package TestNGFramework.Framework.testing;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestNGFramework.Framework.Base;

public class AppTest extends Base{

	 @Test(dataProvider="dp")
	public void test(Hashtable<String,String> testdata) {
		  System.out.println(testdata.get("Home").toString());
	}

	@DataProvider
	public Object[][] dp() {
//		String sheetName = "Fixtures";
//		int rows = excel.getRowCount(sheetName);
//		int cols = excel.getColumnCount(sheetName);
//
//		Object[][] data = new Object[rows - 1][1];
//		
//		Hashtable<String,String> table = null;
//
//		for (int rowNum = 2; rowNum <= rows; rowNum++) { // 2
//
//			table = new Hashtable<String,String>();
//			
//			for (int colNum = 0; colNum < cols; colNum++) {
//
//				// data[0][0]
//				table.put(excel.getCellData(sheetName, colNum, 1), excel.getCellData(sheetName, colNum, rowNum));
//				data[rowNum - 2][0] = table;
//			}
//
//		}
//
//		return data;
		Object[][] data = new Object[1][1];
		Hashtable<String,String> table= new Hashtable<String,String>();
		table.put("Home", "Liverpool");
		data[0][0]=table;
		return data;
		
		//return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, };
	}

}
