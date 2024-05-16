package com.hooks;

import java.io.IOException;
import java.time.Duration;


import com.reusable.Reusable;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks  extends Reusable{
	

	
	@Before
	
	public void browser_Wait() {

		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	
	
	

}
