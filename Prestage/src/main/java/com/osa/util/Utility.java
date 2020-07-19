package com.osa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
  public static Logger getLog(Class clazz) {
	Logger log=Logger.getLogger(clazz);
	PropertyConfigurator.configure("C:\\Users\\jamir\\Desktop\\git new\\OSA_Pre_Stage\\Prestage\\log4j.properties");
		return log;
		}

public static void takingScreenshot(WebDriver dr) {
	try {	
  TakesScreenshot screenshot = (TakesScreenshot)dr;
  File src =screenshot.getScreenshotAs(OutputType.FILE);
  File destination = new File("C:\\Users\\jamir\\Desktop\\git new\\OSA_Pre_Stage\\Prestage\\target\\images"+System.currentTimeMillis());

	FileUtils.copyFile(src, destination);
} catch (IOException e) {
	System.out.println(e.getMessage());
}
}


public static void veryfyTitle (String actualTitle, String expectedTitle) {
  if(actualTitle.equals(expectedTitle)) {
	System.out.println("The test is passed");	
		
	}
	else {
		System.out.println("The test is failed");
	}
}


public static Properties readFile() throws IOException {
  Properties pro = new Properties();
try {
	FileInputStream file =new FileInputStream("C:\\Users\\jamir\\Desktop\\OSA1221201905A\\TestNG_02\\src\\main\\resources\\info.properties");
	pro.load(file);
} catch (Exception e) {

System.out.println(e.getMessage());	
	}
	return pro;
	}



	
}
