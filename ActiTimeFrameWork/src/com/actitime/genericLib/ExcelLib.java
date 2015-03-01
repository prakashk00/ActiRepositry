package com.actitime.genericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib {
	
	String excelPath = "E:\\prakash_Selenium\\Test_Data.xlsx";
	public String getExcelData(String sheetName , int rowNum , int columnNum) throws InvalidFormatException, IOException{
		// get the test data from excel 
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row =sh.getRow(rowNum);
		String  data = row.getCell(columnNum).getStringCellValue();
		return data;
	}
	
	public int getRowCount(String sheetName) throws InvalidFormatException, IOException{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		int rowCount =sh.getLastRowNum();	
		return rowCount;
	}
	
	public void setExcelData(String sheetName , int rowNum , int columnNum , String data) throws InvalidFormatException, IOException{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row =sh.getRow(rowNum);
		Cell cel = row.createCell(columnNum);
		cel.setCellType(cel.CELL_TYPE_STRING);
		cel.setCellValue(data);
		
		FileOutputStream fos = new FileOutputStream(excelPath);
		wb.write(fos);
	}
	
	

}


