package SeleniumAssignment;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class A47_TestNg_ExecutionOrder 

{

	@Test
	public void Method1()
	{
		System.out.println("inside Test ");	
	}
	@AfterMethod
	public void Method2()
	{
		System.out.println("inside AfterMethod ");	
	}
	@BeforeSuite
	public void Method3()
	{
		System.out.println("inside BeforeSuit ");	
	}
	@AfterClass
	public void Method4()
	{
		System.out.println("inside AfterClass ");	
	}
	
	
	
}




























/*
Assignment 47
WAP for below annotation and check execution

@Test
@AfterMethod
@BeforeSuite
@AfterClass
*/