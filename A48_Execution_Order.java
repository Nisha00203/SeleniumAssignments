package SeleniumAssignment;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class A48_Execution_Order 

{
	
	@BeforeMethod
	public void Method1()
	{
		System.out.println("inside BeforeMethod ");	
	}
	@Test
	public void Method2()
	{
		System.out.println("inside Test ");	
	}
	@AfterMethod
	public void Method3()
	{
		System.out.println("inside AfterMethod ");	
	}
	

}















/*
Assignment 48
WAP for below annotation and check execution

@BeforeMethod
@Test
@AfterMethod
*/