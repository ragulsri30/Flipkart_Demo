package com.reusable;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.library.Library;

import dev.failsafe.internal.util.Assert;

public class Reusable extends Library {
	
	
	
	// Click the Element
	public void to_Click(WebElement element) {

		
		element.click();
		
	}
	
	
	//Enter Value in text box
	
	public void enter_Value(WebElement element,String value) {

		element.sendKeys(value);
		
		
	}
	
	// Window handle
	public  void window_Handle() {

		
		
		
		Set<String> ids = driver.getWindowHandles();
		
		
		
		for (String string_Ids : ids) {
			
			
			driver.switchTo().window(string_Ids);
			
		}
		
		
		
	}
	
	
	// Get the value from Element
	
	public String get_value(WebElement element) {
		
		String text = element.getText();
		
	     System.out.println(text);
	     
	     return text;

	}
	
	// Wait for Element visible
	public void wait_for_Element_Visibility(String xpath) {

		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		
	}
	
	// Refresh the web Page
	public void refresh() {

		
		
		driver.navigate().refresh();
	}

	
	
	
	
	
}
