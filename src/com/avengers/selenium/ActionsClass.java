package com.avengers.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass extends BaseClass
{

	public static void main(String[] args) throws InterruptedException 
	{
		openbrowser();
		
		driver.get("https://chercher.tech/practice/drag-and-drop-example.html");
		//dragAndDrop method in actions class
		WebElement a = driver.findElement(By.xpath("//div[@id='div1']"));
		WebElement b = driver.findElement(By.xpath("//div[@id='div2']"));
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.dragAndDrop(a,b).build().perform();
		Thread.sleep(3000);
		closebrowser();

	}

}
