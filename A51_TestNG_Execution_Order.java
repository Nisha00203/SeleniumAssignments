package TopushtoGit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A51_TestNG_Execution_Order 


{

	@BeforeMethod
	public void Method1()
	{
		System.out.println("inside BeforeMethod ");	
	}
	
	@Test
	public void Method2()
	{
		System.out.println("inside Test1 ");	
	}
	@Test
	public void Method3()
	{
		System.out.println("inside Test2 ");	
	}
	
	 
	
}  




























/*
Assignment 51
WAP for below annotation and check execution
                 
@BeforeMethod
@Test----1
@Test----2

*/
