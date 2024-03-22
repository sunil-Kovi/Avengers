package com.avengers.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.avengers.selenium.BaseClass;

public class LoginPageTestCases extends BaseClass
{

	
	}
	
	@Test(dependsOnMethods="TC4")
	public static void TC2() throws InterruptedException
	{
		un.click();
		Thread.sleep(2000);
		un.sendKeys("visual_user");
		Thread.sleep(2000);
		pwd.click();
		Thread.sleep(2000);
		pwd.sendKeys("saag1234");
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
		
	}
	@Test
	public static void TC3() throws InterruptedException
	{
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
			System.out.println("TC3 PASS");
		}
		else
		{
			System.out.println("TC3 FAIL");
		}	
		
	}
	
	@Test
	public static void TC4() throws InterruptedException
	{
		
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
		try
		{
		driver.findElement(By.xpath("//span[text()='Product']"));
		System.out.println("TC4 FAILS");
		}
		catch(IndexOutOfBoundsException e)
		{
			//e.printStackTrace();
			System.out.println("TC4 PASS");
		}
		
	}

}
