package com.screeenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	
	
	
	public static void screenshoot(WebDriver dr,String picturename) throws IOException {

		File file=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		
		String s = System.getProperty("os.name");
		
		if(s.contains("Windows"))
		{
			FileUtils.copyFile(file, new File("C:\\Users\\azizu\\eclipse-workspace\\Maven_project2\\target\\image"+picturename+System.currentTimeMillis()));
		}
		else 
		{
			FileUtils.copyFile(file, new File("/Maven_project2/target/images"+picturename+System.currentTimeMillis()));
		}

		
	}
	
	

}
