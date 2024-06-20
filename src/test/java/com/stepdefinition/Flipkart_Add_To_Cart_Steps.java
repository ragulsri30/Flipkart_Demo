package com.stepdefinition;

import java.io.IOException;



import com.pages.Flipkart_Add_To_Cart_Page;
import com.reusable.Reusable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Flipkart_Add_To_Cart_Steps extends Reusable {

	public Flipkart_Add_To_Cart_Page cart;

	
	
	//Click the Product
	
	@When("Click the Anyone shirt")
	public void click_the_anyone_shirt() {

		cart = new Flipkart_Add_To_Cart_Page(driver);

		to_Click(cart.getSelect_Shirt());
	}

	
	//Click the Add to Cart button And Window handle
	
	@When("Click the Add to Cart button")
	public void click_the_add_to_cart_button() {

		window_Handle();

		to_Click(cart.getAdd_To_Cart());

	}
	
	
	// Validate Place Order

	@Then("Validate Place Order should displayed")
	public void validate_place_order_should_displayed() throws InterruptedException, IOException {
		Thread.sleep(2000);

		org.junit.Assert.assertEquals(get_value(cart.getPlace_Order()), "PLACE ORDER");
		
	
		take_Screenshot("C:\\Users\\C2TA\\eclipse-workspace\\Flipkart_Demo\\src\\test\\resources\\Screenshot\\Flipkart.png1");
		
	}

}
