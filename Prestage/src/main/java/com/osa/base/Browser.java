package com.osa.base;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;


public class Browser {

 

		 static WebDriver dr;
		 static Properties P;
	
public static void main(String[] args) throws IOException {
	P = new Properties();
	P.load(new FileInputStream("C:\\Users\\shihab\\Desktop\\GitTest\\OSA_Pre_Stage\\Prestage\\src\\confic.properties"));
	String b=P.getProperty("browser");
	openBrowser(b).get("https://osaconsultingtech.com/");
	
	
}	

public static WebDriver openBrowser(String b) throws IOException{
		
		
	
	if(b.equals("Chrome")) {
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\shihab\\Desktop\\Osa 1221201905a\\Driver\\chromedriver.exe";
		System.setProperty(key, value);
		dr = new ChromeDriver();
				
		}
	else if (b.equals("firefox")) {
		String key="webdriver.gecko.driver";
		String value ="C:\\Users\\shihab\\Desktop\\Osa 1221201905a\\Driver\\geckodriver.exe";
		System.setProperty(key, value);
		dr = new FirefoxDriver(); 
		
	}
	
	dr.manage().window().maximize();
	dr.manage().deleteAllCookies();
	dr.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	dr.get("https://www.facebook.com/");

	return dr;
	
	
}


}
