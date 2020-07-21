package com.osa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.exec.OS;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Utility {
	public static WebDriver dr;
	public static WebElement element;


	public static Logger getLog(Class clazz) {
		Logger log=Logger.getLogger(clazz);
		
		String osName=System.getProperty("os.name");
		
		if(osName.contains("Mac")) {
	    PropertyConfigurator.configure("/Prestage/com.osa.resource/log4j.properties");

		}else {
			
		PropertyConfigurator.configure("\\Prestage\\com.osa.resource\\log4j.properties");

		}
		
		return log; 
		
	}
	
	public static void verifyPageTitle(String actualTitle,String expectedTitle) {
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("The test is passed");
		}
		else {
			System.out.println("The test is failed");
		}
		
	}
	public static void takingScreenshot(WebDriver dr,String pictureName) {
	
		try {
		TakesScreenshot screenshot=(TakesScreenshot)dr;
	   File src= screenshot.getScreenshotAs(OutputType.FILE);
	   File destination=new File("/Users/sahildip/Desktop/GitHub /OSA_Pre_Stage/Prestage/target/images "+pictureName+System.currentTimeMillis()+".jpg");
	   
		FileUtils.copyFile(src, destination);
	
		} catch (Exception e) {
		 System.out.println(e.getMessage());
		}
	}
	
	
	public static void setKeyAndDriverPathForChrome(String chromeDriverPath) {
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
	}
	
	
	public static void setKeyAndDriverPathForFirefox(String geckoDriverPath) {
		System.setProperty("webdriver.gecko.driver", geckoDriverPath);
	}
	
	
	
		
		
	}
	
	

	
	

	

	

