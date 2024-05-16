package com.stepdefinition;

import java.io.IOException;

import org.junit.Assert;

import com.pages.Flipkart_Palce_Order_Login_Page;
import com.reusable.Reusable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Flipkart_Place_Order_Login_Steps extends Reusable {

	public Flipkart_Palce_Order_Login_Page login;

//Click the Place order button
	@When("Click the Place order button")
	public void click_the_place_order_button() {
		login = new Flipkart_Palce_Order_Login_Page();

		to_Click(login.getPlace_Order());

	}

//Validate the login page
	@Then("Validate the login page")
	public void validate_the_login_page() {

		Assert.assertEquals(get_value(login.getLogin_Page()), "LOGIN OR SIGNUP");

	}

//Enter the login phone number in text box
	@When("Enter the login phone number in text box")
	public void enter_the_login_phone_number_in_text_box() throws InterruptedException {
		
		Thread.sleep(2000);
		enter_Value(login.getPhone_no(), "8270725441");

	}

//Click the continue button
	@When("Click the continue button")
	public void click_the_continue_button() {
		
		to_Click(login.getContinue_btn());
	}

//Validate the OTP text box should display
	@Then("Validate the OTP text box should display")
	public void validate_the_otp_text_box_should_display() throws InterruptedException, IOException {
		
		Thread.sleep(3000);

		Assert.assertEquals(get_value(login.getEnter_otp()), "Resend?");
		take_Screenshot("C:\\Users\\C2TA\\eclipse-workspace\\Flipkart_Demo\\src\\test\\resources\\Screenshot\\Flipkart.png3");

	}
}
