package com.avengers.selenium;

import org.openqa.selenium.By;

public class PopUpPractise extends BaseClass
{

	public static void main(String[] args) throws InterruptedException 
	{
		openbrowser();
		Thread.sleep(2000);
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='alert']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);		
		closebrowser();
	}

}
