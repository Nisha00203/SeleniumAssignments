package TopushtoGit;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class A60_TestNG_TestPriority 

    {

	
	  @Test(priority=1)
	  public void Method1()
	  {
		  	  
	    System.out.println("inside Method1");	
				  	  
	  }
	  @Test(priority=-1)
	  public void Method2()
	  {
		  	  
	    System.out.println("inside Method2");	
				  	  
	  }
	  @Test(priority=0)
	  public void Method3()
	  {
		  	  
	    System.out.println("inside Method3");	
				  	  
	  }
	  @Test(priority=3)
	  public void Method4()
	  {
		  	  
	    System.out.println("inside Method4");	
				  	  
	  }
	  
	  @Test(priority=2)
	  public void Method5()
	  {
		  	  
	    System.out.println("inside Method5");	
				  	  
	  }
	  
	  
	  
	

	}






























/*
"Assignment 60
Write a script to run 3 @Test, with priority parameter. Observe the order of execution."

*/