package TopushtoGit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A49_Execution_Order

{

	
		  
		@BeforeMethod
		public void Method1()
		{
			System.out.println("inside BeforeMethod ");	
		}
		@Test
		public void Method2()
		{
			System.out.println("Inside Test ");	
		}
		@Test
		public void Method3()
		{
			System.out.println("inside Test ");	
		}
		@AfterMethod
		public void Method4()
		{
			System.out.println("inside @AfterMethod ");	
		}
		
		

	}































/*
Assignment 49
WAP for below annotation and check execution
         
@BeforeMethod
@Test----1
@Test----2
@AfterMethod
*/