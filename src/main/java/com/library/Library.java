package com.library;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Library {

	public static WebDriver driver;

public  void browser_Launch() throws Exception {
	
	File f = new File("src/test/resources/Conflig_Properties/Conflig.Properties");
		
		FileInputStream file = new FileInputStream(f);
		
		Properties prep = new Properties();
		
		prep.load(file);
		
		prep.getProperty("Browser").equalsIgnoreCase("chrome");
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		
		
		driver.manage().window().maximize();
		
		driver.get(prep.getProperty("URL"));
		

	}

	public void browser_Close() {

		driver.quit();
	}

}
