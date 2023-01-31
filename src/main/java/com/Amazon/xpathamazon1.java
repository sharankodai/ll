package com.Amazon;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Property.Configuration_Helper;

public class xpathamazon1 {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
	
		String browser = Configuration_Helper.getInstanceCR().getBrowser();
		driver=Baseclass.browserlaunch(browser);
		Baseclass.getUrl("https://www.amazon.in/ref=nav_logo");
		
		WebElement findElement = driver.findElement(By.xpath("//span[contains(text(),'Electronic')]/ancestor::div[3]/following-sibling::div//span[1]"));
		findElement.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']/ancestor::div[3]/following-sibling::div[3]//div[text()='More']")).click();
	}

}
