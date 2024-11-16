package TopushtoGit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A44_TestNG_ALL_Annotations 

{

	
	@BeforeSuite
	public void Method1()
	{
		
		System.out.println("inside BeforeSuite");	
		
	}
	@BeforeTest
	public void Method2()
	{
		System.out.println("inside BeforeTest");
		
	}
	
	@BeforeClass
	public void Method3()
	{
		
		System.out.println("inside BeforeClass");
	}
	@BeforeMethod
	public void Method4()
	{
		
		System.out.println("inside BeforeMethod");
	}
	
	@Test
	public void Method5()
	{
		
		System.out.println("inside Test");
	}
	
	@AfterMethod
	public void Method6()
	{
		System.out.println("inside AfterMethod");
		
	}
	@AfterClass
	public void Method7()
	{
		System.out.println("inside AfterClass");
		
	}
	@AfterTest
	public void Method8()
	{
		
		System.out.println("inside AfterTest");
		
	}
	@AfterSuite
	public void Method9()
	{
		System.out.println("inside AfterSuite");
		
	}

}
