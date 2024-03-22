package com.avengers.selenium;

import java.time.Duration;

import org.openqa.selenium.By;

public class SynchronizationPractise extends BaseClass
{

	public static void main(String[] args) throws InterruptedException 
	{
		openbrowser();
		
		/*
		 * Implicit Wait code
		 * 
		driver.get("https://chercher.tech/practice/implicit-wait-example");	
		//Thread.sleep(20000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(3000);
		
		*/
		
		
		
		
		
		
		
		closebrowser();
	}

}
