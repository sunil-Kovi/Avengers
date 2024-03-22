package com.avengers.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling extends BaseClass
{

	public static void main(String[] args) throws InterruptedException 
	{
		openbrowser();		
		Thread.sleep(2000);		
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");		
		Thread.sleep(2000);
		
		WebElement a = driver.findElement(By.xpath("//select[@id='first']"));
		Select s = new Select(a);
		s.selectByIndex(3);		
		System.out.println(s.isMultiple());		
		Thread.sleep(2000);		
		WebElement b = driver.findElement(By.xpath("//select[@id='animals']"));
		Select t = new Select(b);
		t.selectByVisibleText("Avatar");		
		Thread.sleep(2000);		
		WebElement c = driver.findElement(By.xpath("//select[@id='second']"));
		Select foodItems = new Select(c);		
		foodItems.selectByValue("bonda");		
		Thread.sleep(2000);		
		foodItems.selectByValue("donut");
		Thread.sleep(2000);		
		foodItems.deselectAll();
		Thread.sleep(2000);		
		System.out.println(foodItems.isMultiple());		
		Thread.sleep(2000);	
		closebrowser();
	}

}
