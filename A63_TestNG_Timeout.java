package SeleniumAssignment;
import org.testng.annotations.Test;

public class A63_TestNG_Timeout 


   {

	
	@Test
	public void ContactVerify()
	{
	   System.out.println("Registration is successful");
	}
	@Test(timeOut = 1000)
	public void LandingPage()
	{
	   System.out.println("Landing page verification is successful");
	}
	@Test
	public void LoanContact()
	{
	   System.out.println("Login contact details verification is successful");
	}

	

}















/*
 
 "Assignment 63
Write a script on  timeOut parameter in TestNG"

*/
