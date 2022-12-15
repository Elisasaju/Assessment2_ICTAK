package com.nest.Utilies;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility
{
	static XSSFWorkbook xlbook;
	static XSSFSheet xlsheet;
	
	public static String  ReadData(int row,int column) throws IOException
	{
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelData.xlsx");
		xlbook=new XSSFWorkbook(file);
		
		xlsheet=xlbook.getSheetAt(0);
		return xlsheet.getRow(row).getCell(column).getStringCellValue();
	}

}
