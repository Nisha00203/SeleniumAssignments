package TopushtoGit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;

public class A45_TestNG_MethodsTest 
{

	
		
		@Test
		public void Method1()
		{
			
			System.out.println("inside Test");	
			
		}
		@AfterMethod
		public void Method2()
		{
			
			System.out.println("inside AfterMethod");	
			
		}
		
		@AfterClass
		public void Method3()
		{
			
			System.out.println("inside AfterMethod");	
			
		}
		

	}

















/* Assignment 45
WAP for below annotation and check execution

@Test
@AfterMethod
@AfterClass */