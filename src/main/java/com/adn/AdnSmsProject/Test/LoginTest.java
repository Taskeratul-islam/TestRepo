package com.adn.AdnSmsProject.Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.adn.AdnSmsProject.Utils.DriverManager;
import com.adn.AdnSmsProject.Utils.UrlTextUtils;
import com.adn.AdnSmsProject.Utils.XpathUtils;

public class LoginTest {
	
	private WebDriver driver = null;
	@Test
	public void homepagetitleverify()
	{
		driver = DriverManager.driver;
		driver.get(UrlTextUtils.Url.baseUrl);
		Assert.assertEquals(driver.getTitle(),UrlTextUtils.Text.homepageTitle);
		System.out.println("Home page title verified");	
	}
	
	@Test(dependsOnMethods = "homepagetitleverify")
	public void logintest()
	{
		driver.findElement(By.xpath(XpathUtils.LoginModule.email)).sendKeys("ashikrahmanadn@gmail.com");
		driver.findElement(By.xpath(XpathUtils.LoginModule.password)).sendKeys("123456");
		driver.findElement(By.xpath(XpathUtils.LoginModule.signinBtn)).click();
		System.out.println("Logged in Successfully!");
		
	}
	
	

}
