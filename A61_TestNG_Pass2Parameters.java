package TopushtoGit;

import org.testng.annotations.Test;

public class A61_TestNG_Pass2Parameters 

{

	@Test(enabled=true,invocationCount=10)
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
"Assignment 61
Write a script to pass two parameters in @Test"
*/