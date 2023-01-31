package com.Amazon;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.Property.Configuration_Helper;

public class datadrivenread {
//	public static void main(String[] args) throws IOException {
	
	static String value;

	
	public static String  getdata(String name,int r,int c ) throws IOException {
		File f = new File(Configuration_Helper.getInstanceCR().getPath());
		FileInputStream fi = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fi);
		
		Sheet sheet = w.getSheet(name);
		Row row = sheet.getRow(r);
		Cell cell = row.getCell(c);
		CellType cellType = cell.getCellType();
		if(cellType.equals(cellType.STRING)) {
			value = cell.getStringCellValue();
			
		}else if(cellType.equals(cellType.NUMERIC)) {
//			System.out.println(cell.getNumericCellValue());
			double numericCellValue = cell.getNumericCellValue();
			int a= (int) numericCellValue;
			value=String.valueOf(a);
		}
		 
		 
		return  value;
		
		 
		
	}
	
	

}
