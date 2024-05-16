package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reusable.Reusable;

public class Flipkart_Palce_Order_Login_Page extends Reusable {

	public Flipkart_Palce_Order_Login_Page() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[text()='Place Order']")
	WebElement Place_Order;

	@FindBy(xpath = "//span[text()='Login or Signup']")
	WebElement Login_Page;

	@FindBy(xpath = "//span[text()='CONTINUE']")
	WebElement Continue_btn;

	@FindBy(xpath = "//input[@type='text']")
	WebElement Phone_no;

	@FindBy(xpath = "//span[text()='Resend?']")
	WebElement Enter_otp;

	public WebElement getPlace_Order() {
		return Place_Order;
	}

	public WebElement getLogin_Page() {
		return Login_Page;
	}

	public WebElement getContinue_btn() {
		return Continue_btn;
	}

	public WebElement getPhone_no() {
		return Phone_no;
	}

	public WebElement getEnter_otp() {
		return Enter_otp;
	}

}
