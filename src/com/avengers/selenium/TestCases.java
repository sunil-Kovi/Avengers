package com.avengers.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestCases extends BaseClass
{
	
	public static void main(String[] args) throws InterruptedException 
	{	
		TC1();
		TC2();
		
	}
	/*
	 Test Case Name :	SWAG LABS - lOGIN -TC2
	 Module			:	Login
	 Created By		:	Saag Technologies
	 Created Date	:	02/24/2024
	 Browser 		:   Chrome driver
	 Testing Team	:  	Team-Avengers
	 Test Case Type : 	Functional - Negative
	 Description	:	This test case validates whether user Not able to login with Correct User name and Wrong password
	 */
	
	public static void TC1() throws InterruptedException
	{
		openbrowser();	
		un.click();
		Thread.sleep(2000);
		un.sendKeys("visual_user");
		Thread.sleep(2000);
		pwd.click();
		Thread.sleep(2000);
		pwd.sendKeys("secret_sauce");
		Thread.sleep(2000);
		login.click();
		Thread.sleep(2000);
		boolean res = driver.findElement(By.xpath("//span[text()='Products']")).isDisplayed();
		if(res)
		{
			System.out.println("TC1 PASS");
		}
		else
		{
			System.out.println("TC1 FAIL");
		}	
		closebrowser();
		
	}
	
	
	/*
	 Test Case Name :	SWAG LABS - lOGIN -TC2
	 Module			:	Login
	 Created By		:	Saag Technologies
	 Created Date	:	02/24/2024
	 Browser 		:   Chrome driver
	 Testing Team	:  	Team-Avengers
	 Test Case Type : 	Functional - Negative
	 Description	:	This test case validates whether user Not able to login with Correct User name and Wrong password
	 */
	public static void TC2() throws InterruptedException
	{
		openbrowser();
		un.click();
		Thread.sleep(2000);
		un.sendKeys("visual_user");
		Thread.sleep(2000);
		pwd.click();
		Thread.sleep(2000);
		pwd.sendKeys("saag123");
		Thread.sleep(2000);
		login.click();
		Thread.sleep(2000);
		try
		{
		driver.findElement(By.xpath("//span[text()='Products']"));
		System.out.println("TC2 FAILS");
		}
		catch(NoSuchElementException e)
		{
			//e.printStackTrace();
			System.out.println("TC2 PASS");
		}
		
		closebrowser();
	}
	
}
