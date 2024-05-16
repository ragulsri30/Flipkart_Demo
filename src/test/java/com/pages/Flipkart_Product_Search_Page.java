package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reusable.Reusable;

public class Flipkart_Product_Search_Page extends Reusable{
	
	public Flipkart_Product_Search_Page(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "q")
	WebElement Search_Box;
	@FindBy(xpath = "//input[@type='text']")
	WebElement Enter_Product;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement Click_Search_Icon;
	@FindBy(xpath = "//span[text()='shirt']")
	WebElement get_name;
	public WebElement getGet_name() {
		return get_name;
	}
	public void setGet_name(WebElement get_name) {
		this.get_name = get_name;
	}
	public WebElement getSearch_Box() {
		return Search_Box;
	}
	public WebElement getEnter_Product() {
		return Enter_Product;
	}
	public WebElement getClick_Search_Icon() {
		return Click_Search_Icon;
	}
	

}
