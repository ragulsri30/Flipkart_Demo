package com.stepdefinition;

import java.io.IOException;

import org.testng.Assert;

import com.pages.Flipkart_Remove_Cart_Page;
import com.reusable.Reusable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Flipkart_Remove_Cart_Steps extends Reusable {

	public Flipkart_Remove_Cart_Page remove;

//Click Cart link
	@When("Click Cart link")
	public void click_cart_link() throws InterruptedException {

		for (int i = 1; i <= 2; i++) {

			Thread.sleep(3000);
			
			driver.navigate().back();

		}

		remove = new Flipkart_Remove_Cart_Page();

		Thread.sleep(3000);

		to_Click(remove.getCart());

	}

//Validate the Cart page
	@Then("Validate the Cart page")
	public void validate_the_cart_page() throws InterruptedException {

		Thread.sleep(3000);

		boolean displayed = remove.getPrice_details().isDisplayed();

		Assert.assertTrue(displayed);

	}

//Click the Remove option
	@When("Click the Remove option")
	public void click_the_remove_option() {

		to_Click(remove.getRemove());

	}

//Click the Remove option the popup
	@When("Click the Remove option the popup")
	public void click_the_remove_option_the_popup() {

		to_Click(remove.getRemove_Popup());

	}
// Validate the product remove from cart

	@Then("Validate the product remove from cart")
	public void validate_the_product_remove_from_cart() throws InterruptedException, IOException {

		wait_for_Element_Visibility(remove.Emty_Cart());

		Assert.assertEquals(get_value(remove.getEmty_cart()), "Missing Cart items?");
		take_Screenshot("C:\\Users\\C2TA\\eclipse-workspace\\Flipkart_Demo\\src\\test\\resources\\Screenshot\\Flipkart.png5");

	}
}
