package com.avengers.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsPractise 
{
	@AfterMethod
	public static void TC1()
	{
	System.out.println("TC1-AfterMethod");	
	}
	@AfterSuite
	public static void TC2()
	{
		System.out.println("tc2-AfterSuite");
	}
	@BeforeSuite
	public static void TC3()
	{
		System.out.println("TC3-BeforeSuite");
	}
	@Test(priority = 3)
	public static void TC4()
	{
		System.out.println("TC4-Test");
	}
	public static void TC5()
	{
		System.out.println("TC5");
	}
	@Test(priority = 5)
	public static void TC6()
	{
		System.out.println("TC6-Test");
	}
	@AfterClass
	public static void TC7()
	{
		System.out.println("TC7-AfterClass");
	}
	@Test(priority = 1)
	public static void TC8()
	{
		System.out.println("TC8-Test");
	}
	@BeforeTest
	public static void TC9()
	{
		System.out.println("TC9-BeforeTest");
	}
	@Test(priority = 4)
	public static void TC10()
	{
		System.out.println("TC10-Test");
	}
	@BeforeMethod
	public static void TC11()
	{
		System.out.println("TC11-BeforeMethod");
	}
	@Test(priority = 2)
	public static void TC12()
	{
		System.out.println("TC12-Test");
	}
	@AfterTest
	public static void TC13()
	{
		System.out.println("TC13-AfterTest");
	}
	@BeforeClass
	public static void TC14()
	{
		System.out.println("TC14-BeforeClass");
	}
	

}
