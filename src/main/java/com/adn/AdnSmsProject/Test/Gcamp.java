package com.adn.AdnSmsProject.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.adn.AdnSmsProject.Utils.DriverManager;
import com.adn.AdnSmsProject.Utils.XpathUtils;

public class Gcamp {
	
	private WebDriver driver = null;
	@Test
	public void gcamp()
	{
		driver = DriverManager.driver;
		driver.findElement(By.xpath(XpathUtils.GcampModule.gcampBtn)).click();
		driver.findElement(By.xpath(XpathUtils.GcampModule.createcamp)).click();
		driver.findElement(By.xpath(XpathUtils.GcampModule.camptitile)).sendKeys("Test General Campaign");
		driver.findElement(By.xpath(XpathUtils.GcampModule.ispromononopath)).click();
		System.out.println("NO option selected");
		//MaskType
		driver.findElement(By.xpath(XpathUtils.GcampModule.masktype)).click();
		Select MaskType = new Select(driver.findElement(By.xpath(XpathUtils.GcampModule.masktype)));
		MaskType.selectByVisibleText("Nonmask");
		
		driver.findElement(By.xpath(XpathUtils.GcampModule.receipientlisttextbox)).click();
		System.out.println("Text box option selected");
		driver.findElement(By.xpath(XpathUtils.GcampModule.contactlist)).sendKeys("01710301290,0177777042");
		driver.findElement(By.xpath(XpathUtils.GcampModule.msgbody)).sendKeys("Test General Campaign for gp telco from adn");
		
		
	

}
}
