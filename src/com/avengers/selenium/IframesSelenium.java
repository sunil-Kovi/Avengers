package com.avengers.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class IframesSelenium extends BaseClass
{

	public static void main(String[] args) throws InterruptedException 
	{
		openbrowser();
		Thread.sleep(2000);		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");		
		Thread.sleep(2000);		
		//driver.switchTo().frame("frm1");	
		//driver.switchTo().frame(1);	
		
		WebElement y = driver.findElement(By.xpath("//iframe[@id='frm1']"));
		driver.switchTo().frame(y);
		Thread.sleep(2000);		
		WebElement x = driver.findElement(By.xpath("//select[@id='course']"));		
		Select sel = new Select(x);		
		sel.selectByVisibleText("Python");		
		Thread.sleep(2000);				
		closebrowser();
	}

}
