package com.avengers.selenium;

import org.openqa.selenium.WebDriver;

public class NavigationSelenium extends BaseClass
{

	public static void main(String[] args) throws InterruptedException 
	{
		openbrowser();
		Thread.sleep(3000);
		driver.get("https://amazon.com");
		Thread.sleep(2000);
		
		WebDriver.Navigation wn = driver.navigate();
		wn.back();
		Thread.sleep(3000);
		wn.forward();
		Thread.sleep(3000);
		wn.back();
		Thread.sleep(3000);
		wn.refresh();
		//wn.back();
		Thread.sleep(3000);
		
		//driver.navigate().to(" Link ");
		wn.to("https://myntra.com");
		Thread.sleep(3000);
		closebrowser();
	}

}
