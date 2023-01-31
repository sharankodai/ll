package com.Property;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	Properties p;
	
	public Configuration_Reader() throws IOException {
		File f=new File("C:\\Users\\shara\\eclipse-workspace\\SDP_Amazon\\src\\main\\java\\com\\Property\\Propertyfile");
		FileInputStream fi = new FileInputStream(f);
		 p = new Properties();
		p.load(fi);
	}
	
	public  String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
		
	}
	
	public String getUrl() {
		String Url = p.getProperty("url");
		return Url;
	}
	
	public String getSelectvalue() {
		String selectvalue = p.getProperty("selectvalue");
		return selectvalue;
	}
	
	public String getSearchproduct() {
		String searchproduct = p.getProperty("searchproduct");
		return searchproduct;
	}
	
	public String getSheetname() {
		String sn = p.getProperty("sheetname");
		return sn;
	}
	
	public String getPath() {
		String pa = p.getProperty("path");
		return pa;
	}

}
