package SeleniumAssignment;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A50_TestNG_Execution_Order 


    {

	
	  
		@BeforeMethod
		public void Method1()
		{
			System.out.println("inside BeforeMethod ");	
		}
		@Test
		public void Method2()
		{
			System.out.println("Inside Test1 ");	
		}
		@Test
		public void Method3()
		{
			System.out.println("inside Test2 ");	
		}
		@AfterMethod
		public void Method4()
		{
			System.out.println("inside @AfterMethod ");	
		}
		@Test
		public void Method5()
		{
			System.out.println("insideTest3 ");	
		}

	}






























/*
Assignment 50
WAP for below annotation and check execution
         
@BeforeMethod
@Test----1
@Test----2
@AfterMethod
@Test----3

*/
