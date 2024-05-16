package com.stepdefinition;

import java.io.IOException;

import com.pages.Flipkart_Payment_Page;
import com.reusable.Reusable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Flipkart_Payment_Steps extends Reusable {

	public Flipkart_Payment_Page pay;

// Click the Login button

	@When("Click the Login button")
	public void click_the_login_button() throws InterruptedException {

		Thread.sleep(9000);
		pay = new Flipkart_Payment_Page();

		to_Click(pay.getLogin_phno());

	}

// Validate the Delivery Adderss

	@Then("Validate the Delivery Adderss page")
	public void validate_the_delivery_adderss_page() {

	}

// Click Add new Address 
	@When("Click Add new Address")
	public void click_add_new_address() {

		to_Click(pay.getAdd_address());

	}

// Enter the name
	@When("Enter the name")
	public void enter_the_name() {

		enter_Value(pay.getEnter_name(), "Ragulgandhi");

	}

// Enter the moblie number
	@When("Enter the moblie number")
	public void enter_the_moblie_number() {

		enter_Value(pay.getEnter_phno(), "8270725441");
	}

// Enter the pincode
	@When("Enter the pincode")
	public void enter_the_pincode() {
		enter_Value(pay.getPin_code(), "600048");
	}

//Enter the locality
	@When("Enter the locality")
	public void enter_the_locality() {

		enter_Value(pay.getLocality(), "vadapalani");
	}

//Enter the Address
	@When("Enter the Address")
	public void enter_the_address() {
		enter_Value(pay.getEnter_address(), "2/11,Rani Anna Nagar,Vadapalani");
	}

//Enter the Landmark
	@When("Enter the Landmark")
	public void enter_the_landmark() {
		enter_Value(pay.getEnter_landmark(), "park");
	}

//Enter the Alternate number
	@When("Enter the Alternate number")
	public void enter_the_alternate_number() {
		enter_Value(pay.getEnter_alterphno(), "8489507366");
	}

//Select the Home delivery button
	@When("Select the Home delivery button")
	public void select_the_home_delivery_button() {
		to_Click(pay.getSelect_Addresstype());
	}

//Click the save and delivery
	@When("Click the save and delivery")
	public void click_the_save_and_delivery() throws IOException {
		to_Click(pay.getSave_address());
		take_Screenshot("C:\\Users\\C2TA\\eclipse-workspace\\Flipkart_Demo\\src\\test\\resources\\Screenshot\\Flipkart.png2");
	}

}
