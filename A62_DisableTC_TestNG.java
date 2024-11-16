package TopushtoGit;

import org.testng.annotations.Test;

public class A62_DisableTC_TestNG
{


	@Test(enabled=false)
	public void method1()
	{
		
		 System.out.println("inside Method1");
		
		
		
	}
	@Test
	public void method2()
	{
		
		
		 System.out.println("inside Method2");
		
		
	}
	@Test
	public void method3()
	{
		
		
		
		 System.out.println("inside Method3");
		
	}
	@Test(enabled=false)
	public void method4()
	{
		
		
		 System.out.println("inside Method4");
		
		
	}
	
	
}
















/*
"Assignment 62
Write a script to disable any Testcase in TestNG"
*/