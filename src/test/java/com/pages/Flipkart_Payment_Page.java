package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reusable.Reusable;

public class Flipkart_Payment_Page extends Reusable {
	public Flipkart_Payment_Page() {
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath = "//span[text()='Login']")
WebElement login_phno;


	@FindBy(xpath = "//div[@class='_2vQwZw']")
	WebElement Add_address;

	@FindBy(name = "name")
	WebElement Enter_name;

	@FindBy(name = "phone")
	WebElement Enter_phno;

	@FindBy(name = "pincode")
	WebElement pin_code;
	@FindBy(name = "addressLine2")
	WebElement locality;
	
	@FindBy(name = "addressLine1")
	WebElement Enter_address;

	@FindBy(name = "landmark")
	WebElement Enter_landmark;
	@FindBy(name = "alternatePhone")
	WebElement Enter_alterphno;
	@FindBy(xpath = "//span[text()='Home (All day delivery)']")
	WebElement Select_Addresstype;
	@FindBy(xpath = "//button[text()='Save and Deliver Here']")
	WebElement Save_address;
	public WebElement getAdd_address() {
		return Add_address;
	}
	public WebElement getLogin_phno() {
	return login_phno;
}
	public WebElement getEnter_name() {
		return Enter_name;
	}
	public WebElement getEnter_phno() {
		return Enter_phno;
	}
	public WebElement getPin_code() {
		return pin_code;
	}
	public WebElement getLocality() {
		return locality;
	}
	public WebElement getEnter_address() {
		return Enter_address;
	}
	public WebElement getEnter_landmark() {
		return Enter_landmark;
	}
	public WebElement getEnter_alterphno() {
		return Enter_alterphno;
	}
	public WebElement getSelect_Addresstype() {
		return Select_Addresstype;
	}
	public WebElement getSave_address() {
		return Save_address;
	}


}
