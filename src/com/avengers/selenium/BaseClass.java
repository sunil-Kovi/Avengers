package com.avengers.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{
	public static WebDriver driver;
	public static WebElement un;
	public static WebElement pwd;
	public static WebElement login;
	@BeforeMethod
	public static void openbrowser() throws InterruptedException
	{
		
		System.setProperty("Webdriver.chrome.driver", ".//Utilities//chromedriver.exe");
		driver = new ChromeDriver();
		/*
		System.setProperty("Webdriver.gecko.driver", ".//Utilities//geckodriver.exe");
		driver=new FirefoxDriver();
		*/
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		
		 un = driver.findElement(By.xpath("//input[@id='user-name']"));
		 pwd = driver.findElement(By.xpath("//input[@id='password']"));
		 login = driver.findElement(By.xpath("//input[@id='login-button']"));
		
	}
	
	@AfterMethod
	public static void closebrowser()
	{
		driver.quit();
	}

}
