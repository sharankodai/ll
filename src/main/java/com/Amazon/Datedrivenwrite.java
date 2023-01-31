package com.Amazon;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Writer;

import org.apache.commons.io.output.WriterOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.Property.Configuration_Helper;

public class Datedrivenwrite {
	public static void dd() throws IOException {
	File f = new File("C:\\Users\\shara\\Desktop/data driven.xlsx");
	FileInputStream fi = new FileInputStream(f);
	
	Workbook w = new XSSFWorkbook(fi);
	Sheet createSheet = w.getSheet("datadriven");
	Row createRow = createSheet.createRow(5);
	Cell createCell = createRow.createCell(6);
	createCell.setCellValue("sharan");
	
	createSheet.createRow(3).createCell(4).setCellValue("Kumar");
	
	FileOutputStream fo= new FileOutputStream(f);
	w.write(fo);
	w.close();
	
	
	
	
//	Sheet sheet = w.getSheet(name);
}
	public static void main(String[] args) throws IOException {
		dd();
	}
}
