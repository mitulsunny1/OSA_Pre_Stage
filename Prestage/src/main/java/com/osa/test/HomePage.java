package com.osa.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class HomePage extends Browser {
	
	
	@Test
	public void navigateToOsaPage() {
		dr.get("https://www.osaconsultingtech.com");
	}
	@Test
	public void verifyHomePageTitle() {
		String homePageTitle=dr.getTitle();
		
	}
	@Test
	public void clickForumLoginButton() {
		dr.findElement(By.xpath("//button[@id='login_button']")).click();
		
	}
}
