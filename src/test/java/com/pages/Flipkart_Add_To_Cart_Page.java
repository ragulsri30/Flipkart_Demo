package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reusable.Reusable;

public class Flipkart_Add_To_Cart_Page extends Reusable {
	
	
	
	
	public Flipkart_Add_To_Cart_Page(WebDriver driver) {

		
		this.driver=driver;
		
	PageFactory.initElements(driver,this);
	
	}
	
	


	@FindBy(xpath = "(//div[@id='container']//a[@class='rPDeLR'])[1]")
	WebElement Select_Shirt;
	
	
	@FindBy(xpath = "//button[text()='Add to cart']")
	WebElement Add_To_Cart;
	
	
	@FindBy(xpath = "//div[@class='c+N-fo BqiVJF']//button//span")
	WebElement Place_Order;
	

	public WebElement getSelect_Shirt() {
		return Select_Shirt;
	}


	public WebElement getAdd_To_Cart() {
		return Add_To_Cart;
	}


	public WebElement getPlace_Order() {
		return Place_Order;
	}
	
	
	

}
