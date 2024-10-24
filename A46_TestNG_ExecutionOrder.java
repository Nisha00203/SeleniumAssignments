package TopushtoGit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A46_TestNG_ExecutionOrder 

 
{

	@BeforeTest
	public void Method1()
	{
		
		System.out.println("inside BeforeTest ");	
		
	}
	
	@BeforeClass
	public void Method2()
	{
		
		System.out.println("inside BeforeClass");	
		
	}
	
	@BeforeMethod
	public void Method3()
	{
		
		System.out.println("inside BeforeMethod");	
		
	}
	@AfterMethod
	public void Method4()
	{
		
		System.out.println("inside AfterMethod");	
		
	}
	@Test
	public void Method5()
	{
			
			System.out.println("inside Test");	
			
	}
		
}
	
		

	


















/*
Assignment 46
WAP for below annotation and check execution

@BeforeTest
@BeforeClass
@BeforeMethod
@AfterMethod
@Test
*/