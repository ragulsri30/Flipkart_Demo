package com.hooks;

import java.time.Duration;


import com.reusable.Reusable;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks  extends Reusable{
	

	
	@Before
	
	public void browser_Wait() {

		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	
	
	@After
	public void tear_Down() {

	
	}
	

}
