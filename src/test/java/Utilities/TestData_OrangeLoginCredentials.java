package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class TestData_OrangeLoginCredentials {
	@DataProvider(name="dpf")
	public String [][] TestData() throws IOException
	{
		
		FileInputStream fi=new FileInputStream("C:\\Workspace1-CoreJava\\Automation_Testing_Practice\\TestData\\OrangeLoginCredentials.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("Sheet1");
		//XSSFRow row=sh.getRow(0);
		int rowcount=sh.getLastRowNum();
		int cellcount=sh.getRow(1).getLastCellNum();
		String a[][]=new String[rowcount+1][cellcount];
		System.out.println(rowcount);
		System.out.println(cellcount);
		
		for(int i=0;i<=rowcount;i++)
		{
			
			for(int j=0;j<cellcount;j++)
			{
		    XSSFCell c=sh.getRow(i).getCell(j);
				
			a[i][j]=c.getStringCellValue();
				
				//System.out.println(a[i][j]);
			}
		}
		
		return a;
	}
	
}
