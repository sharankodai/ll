package com.Amazon;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Property.Configuration_Helper;

public class xpathamazon2 {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
	
		String browser = Configuration_Helper.getInstanceCR().getBrowser();
		driver=Baseclass.browserlaunch(browser);
		Baseclass.getUrl("https://www.amazon.in/ref=nav_logo");
		
		driver.findElement(By.xpath("//a[text()='Amazon miniTV']/parent::div/child::a[text()=' Electronics ']")).click();
}
}
