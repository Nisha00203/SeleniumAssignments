package TopushtoGit;
import org.testng.annotations.Test;

public class A55_invocationcountDemo

{

	
  @Test(invocationCount=10)
  public void Method1()
  {
	  
	  System.out.println("inside Method1");
	  
	  
  }
 
 }


