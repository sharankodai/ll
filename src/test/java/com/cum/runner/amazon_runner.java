package com.cum.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Amazon.Baseclass;
import com.Property.Configuration_Helper;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\shara\\eclipse-workspace\\SDP_Amazon\\src\\test\\java\\com\\feature\\Amazon.feature",glue = "com.cum.stepdefinition",tags = "@smoke")
public class amazon_runner {
	public static WebDriver driver;
	
	@BeforeClass
	public static void browseLaunch() throws IOException {
		String browser = Configuration_Helper.getInstanceCR().getBrowser();
		driver=Baseclass.browserlaunch(browser);
	}
	@AfterClass
	public static void browserClose() {
		driver.close();
	}

}
