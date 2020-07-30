package com.osa.base;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Browser {
<<<<<<< HEAD
	
 public static void main(String[] args) {
	System.out.println("Hellow World");
	
 }
=======

		 static WebDriver dr;
		 static Properties P;
	
public static void main(String[] args) throws IOException {
	P = new Properties();
	P.load(new FileInputStream("/Users/mdalamin/Desktop/chromedriver"));
	String b=P.getProperty("browser");
	openBrowser(b).get("https://osaconsultingtech.com/");
	
	
}	

public static WebDriver openBrowser(String b) throws IOException{
		
		
	
	if(b.equals("Chrome")) {
		String key="webdriver.chrome.driver";
		String value="/Users/mdalamin/Desktop/chromedriver";
		System.setProperty(key, value);
		dr = new ChromeDriver();
				
		}
	else if (b.equals("firefox")) {
		String key="webdriver.gecko.driver";
		String value ="/Users/mdalamin/Desktop/geckodriver";
		System.setProperty(key, value);
		dr = new FirefoxDriver(); 
		
	}
	
	dr.manage().window().maximize();
	dr.manage().deleteAllCookies();
	dr.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	dr.get("https://www.facebook.com/");

	return dr;
	
	
}

>>>>>>> a0017b6a1a17f9ec8659192db660b7b75440a325
}
