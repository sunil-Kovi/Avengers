package com.avengers.selenium;

import java.util.Set;

import org.openqa.selenium.WindowType;

public class Windowhandling extends BaseClass
{

	public static void main(String[] args) throws InterruptedException 
	{
		openbrowser();
		String firstID = driver.getWindowHandle();	
		System.out.println(firstID);
		Thread.sleep(2000);		
		driver.switchTo().newWindow(WindowType.TAB);		
		Thread.sleep(2000);		
		driver.get("https://www.flipkart.com/");
		String secondid = driver.getWindowHandle();	
		System.out.println(secondid);
		Thread.sleep(2000);		
		driver.switchTo().newWindow(WindowType.TAB);		
		Thread.sleep(2000);		
		driver.get("https://snapdeal.com/");
		String thirdid = driver.getWindowHandle();
		System.out.println(thirdid);
		Thread.sleep(2000);		
		driver.switchTo().window(secondid);
		Thread.sleep(2000);	
	
		Set<String> x = driver.getWindowHandles();
		for(String y:x)
		{
			System.out.println(y);
		}
		Thread.sleep(2000);	
		closebrowser();
	}

}
