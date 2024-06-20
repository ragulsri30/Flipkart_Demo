package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reusable.Reusable;

public class Flipkart_Remove_Cart_Page extends Reusable{

	
	public Flipkart_Remove_Cart_Page() {
		
		
		
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(linkText = "Cart")
	WebElement Cart;
	
	@FindBy(xpath = "//span[text()='Price details']")
	WebElement Price_details;
	
	
	@FindBy(xpath = "//div[@class='_5jL4tC gRTtwM f-DWwy']//child::div[text()='Remove']")
	WebElement Remove;
	
	
	
	@FindBy(xpath = "//div[@class='gRTtwM f-DWwy']//div[@class='sBxzFz fF30ZI A0MXnh']")
	WebElement Remove_Popup;
	
	
	@FindBy(xpath = "//div[text()='Missing Cart items?']")
	WebElement emty_cart;


	public WebElement getCart() {
		return Cart;
	}


	public WebElement getPrice_details() {
		return Price_details;
	}


	public WebElement getRemove() {
		return Remove;
	}


	public WebElement getRemove_Popup() {
		return Remove_Popup;
	}


	public WebElement getEmty_cart() {
		return emty_cart;
	}
	
	
	public String  Emty_Cart() {
		
		String element="//div[text()='Missing Cart items?']";
		
		
		return element;
		
	}
	
	
}
