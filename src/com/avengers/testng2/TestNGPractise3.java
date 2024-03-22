package com.avengers.testng2;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.avengers.selenium.BaseClass;

public class TestNGPractise3 extends BaseClass implements ITestListener
{
	public  void onStart(ITestContext context)
	{
		System.out.println("Testing Started");
	}

	public  void onTestSuccess(ITestResult result)
	{
		System.out.println("TC PASS");
	}
	public  void onTestFailure(ITestResult result)
	{
		System.out.println("xyxxcccccdddsm cdsm, c");
	}
	
	//@Test(dataProvider="logindpdata")
	public static void TC5(String x, String y) throws InterruptedException
	{
		System.out.println(x);
		System.out.println(y);
		//openbrowser();
		un.click();
		Thread.sleep(2000);
		un.sendKeys(x);
		Thread.sleep(2000);
		pwd.click();
		Thread.sleep(2000);
		pwd.sendKeys(y);
		Thread.sleep(2000);
		login.click();
		Thread.sleep(2000);
		try
		{
		driver.findElement(By.xpath("//span[text()='Products']"));
		}
		catch(NoSuchElementException e)
		{
			//e.printStackTrace();
		}
		//closebrowser();
		
	}
	@Test(dataProvider="logindpdata")
	public static void TC6(String x, String y) throws InterruptedException
	{
		boolean res = false;
		un.click();
		Thread.sleep(2000);
		un.sendKeys(x);
		Thread.sleep(2000);
		pwd.click();
		Thread.sleep(2000);
		pwd.sendKeys(y);
		Thread.sleep(2000);
		login.click();
		Thread.sleep(2000);
		
		try
		{
		 res = driver.findElement(By.xpath("//span[text()='Products']")).isDisplayed();
		}
		catch(Exception e)
		{
			System.out.println("Exception occured");
		}
		
		Assert.assertTrue(res);

		
		
	}
	
	//@Test(groups= {"TC7"})
	public static void TC7() throws InterruptedException
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
		closebrowser();
		
	}
	
	@DataProvider(name = "logindpdata")
	public static String[][] logindp()
	{
		String[][] a = new String[1][];
		a[0]=new String[2];
		//a[1]=new String[2];
		//a[2]=new String[2];
		
		a[0][0] = "standard_user";	a[0][1] = "secret_sauce";
		
		
		return a;		
	}
	
	@DataProvider(name = "homedpdata")
	public static String[][] homedp()
	{
		String[][] a = new String[2][];
		a[0]=new String[2];
		a[1]=new String[2];
		
		a[0][0] = "Saag";	a[0][1] = "Marathalli";
		a[1][0] = "Technology";	a[1][1] = "Testing";
		
		return a;		
	}
	
	
	}
