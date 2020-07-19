package com.screeenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	
	
	
	public static void screenshoot(WebDriver dr,String Sname) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)dr;
		File  src=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\azizu\\Desktop\\Gittest\\OSA_Pre_Stage\\Prestage\\target\\Image"+Sname+System.currentTimeMillis()+".jpg"));
		
		
	}
	
	

}
