package com.cum.stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Amazon.Baseclass;
import com.Amazon.Homepage;
import com.Amazon.SDP;
import com.Amazon.datadrivenread;
import com.Property.Configuration_Helper;
import com.cum.runner.amazon_runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class amazonstepdefinition extends Baseclass {
	public static WebDriver driver =amazon_runner.driver;
	public static SDP ss;
	String name;
	String selectvalue;
	String searchProduct;
	
	
	@Given("user Launch The Application Url")
	public void user_launch_the_application_url() throws IOException {
		getUrl(Configuration_Helper.getInstanceCR().getUrl());
		implicit_wait();
	}

@When("user Selectes The {string} From Dropdown")
public void user_selectes_the_from_dropdown(String dropdown) throws InterruptedException, IOException {
 

		sleep();
		ss= new SDP(driver);
//		name=Configuration_Helper.getInstanceCR().getSheetname();
//		selectvalue=datadrivenread.getdata(name, 1, 0);

		
		Select alloptions = new Select(ss.getHomepage().getdropdownlist());

		List<WebElement> options2 = getOptions(ss.getHomepage().getdropdownlist());

		for (int i = 0; i < options2.size(); i++) {
			WebElement eachoption = options2.get(i);
			String eachtext = eachoption.getText();
			if (eachtext.equalsIgnoreCase(dropdown)) {
				alloptions.selectByVisibleText(eachtext);

			}
		}
	}

@When("user Search The {string} In SearchBox")
public void user_search_the_in_search_box(String search) throws InterruptedException, IOException {
    
		searchProduct=search;
		
		sendKey(ss.getHomepage().getSearch(), searchProduct);
		sleep();

	
	 
	}
	@Then("user Click The Searched Product From The Suggestion and It navigates To productPage")
	public void user_click_the_searched_product_from_the_suggestion_and_it_navigates_to_product_page() {
	  
		List<WebElement> relevant = ss.getHomepage().getRelevant();
		for (int i = 1; i <= relevant.size(); i++) {
			WebElement findElement = driver
					.findElement(By.xpath("//div[@id='nav-flyout-searchAjax']/child::div/div[" + i + "]"));
			String textsearchProduct = getText(findElement);

			System.out.println(textsearchProduct);
			if (textsearchProduct.equalsIgnoreCase(searchProduct)) {

				click(findElement);
				break;

			}
		}
	}
	
	@When("get First Lodaded Title and OfferPrice and Click The First Product")
	public void get_first_lodaded_title_and_offer_price_and_click_the_first_product() {
	    
		click(ss.getProduct_Page().getFOP());
		
		String parentwindow = windowHandle();

		Set<String> windowHandles = multipleWindows();
		for (String string : windowHandles) {
			if (!string.equalsIgnoreCase(parentwindow)) {
				driver.switchTo().window(string);
				break;
			}
	}


	}
	
	@When("get The Loaded Title and OfferPrice and Check Whether Loaded Product Is Correct")
	public void get_the_loaded_title_and_offer_price_and_check_whether_loaded_product_is_correct() {
	  
	}
	@When("add The Product To The Cart")
	public void add_the_product_to_the_cart() {
		click(ss.getAdd_To_Cart().getAddtocartbutton());
	}
	@Then("proceed To CheckOut and Take A Screen Shot")
	public void proceed_to_check_out_and_take_a_screen_shot() throws IOException {
		click(ss.Check_Out().getProceedtocheckout());
		capture("Amazon");
	}
}
