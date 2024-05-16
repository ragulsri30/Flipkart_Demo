package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.pages.Flipkart_Product_Search_Page;
import com.reusable.Reusable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Flipkart_Product_Search_Steps extends Reusable {

	public Flipkart_Product_Search_Page fp;

//Launch the Filpkart Application
	@Given("Launch the Filpkart Application")
	public void launch_the_filpkart_application() throws Exception {

		browser_Launch();

	}

	
// Click the Search Bar
	@When("Click the Search Bar")
	public void click_the_search_bar() {

		fp = new Flipkart_Product_Search_Page(driver);

		to_Click(fp.getSearch_Box());

	}
	
// Enter the Search Product Name
	@When("Enter the Search Product Name")
	public void enter_the_search_product_name() {

		enter_Value(fp.getEnter_Product(), "shirt");

	}

//Click the Search Icon button
	@When("Click the Search Icon button")
	public void click_the_search_icon_button() {

		to_Click(fp.getClick_Search_Icon());
	}

//Validate the Search Product page
	@Then("Validate the Search Product page")
	public void validate_the_search_product_page() throws IOException {



		Assert.assertEquals(get_value(fp.getGet_name()), "shirt");
		take_Screenshot("C:\\Users\\C2TA\\eclipse-workspace\\Flipkart_Demo\\src\\test\\resources\\Screenshot\\Flipkart.png4");
	}
}
