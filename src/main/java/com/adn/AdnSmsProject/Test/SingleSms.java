package com.adn.AdnSmsProject.Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.adn.AdnSmsProject.Utils.DriverManager;
import com.adn.AdnSmsProject.Utils.XpathUtils;

public class SingleSms {
	
	private WebDriver driver = null;
	@Test
	public void singlesms()
	{
		driver = DriverManager.driver;
		driver.findElement(By.xpath(XpathUtils.SinglesmsModule.singlesmsBtn)).click();
		System.out.println("Singlesms button clicked");
		
		//SelectMasktype
		driver.findElement(By.id(XpathUtils.SinglesmsModule.selectMask)).click();
		Select MaskType = new Select(driver.findElement(By.id(XpathUtils.SinglesmsModule.selectMask)));
		MaskType.selectByVisibleText("Nonmask");
		System.out.println("mask selected successfully");
		
		//EnterMobilenumber
		driver.findElement(By.xpath(XpathUtils.SinglesmsModule.mobileno)).sendKeys("01710301290");;
		
		//MessageType
		driver.findElement(By.xpath(XpathUtils.SinglesmsModule.messageType)).click();
		Select MessageType = new Select(driver.findElement(By.xpath(XpathUtils.SinglesmsModule.messageType)));
		MessageType.selectByVisibleText("Text");
		System.out.println("message type selected successfully");
		
		//EnterMessage
		
		driver.findElement(By.xpath(XpathUtils.SinglesmsModule.message)).sendKeys("Hello from ADN DigiNet Ltd");
		
		//SendClick
		driver.findElement(By.xpath(XpathUtils.SinglesmsModule.sendBtn)).click();
		
}
}