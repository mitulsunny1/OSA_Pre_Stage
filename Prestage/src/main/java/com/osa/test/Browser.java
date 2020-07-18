package com.osa.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Browser {
	
	public static ChromeDriver dr;
	@BeforeClass
	public static void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\OSA1005201904A\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		dr.manage().window().maximize();
		
	}
	@AfterClass
	public static void close() {
	dr.close();
	}

}
