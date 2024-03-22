package com.avengers.selenium;

import org.openqa.selenium.JavascriptExecutor;

public class ScrollingWebPage extends BaseClass
{

	public static void main(String[] args) throws InterruptedException 
	{
		openbrowser();
		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0,3200)");
	    Thread.sleep(5000);	
	    js.executeScript("window.scrollTo(0,500)");
	    Thread.sleep(3000);		
		closebrowser();
	}

}
