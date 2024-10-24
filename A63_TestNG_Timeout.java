package TopushtoGit;
import org.testng.annotations.Test;

public class A63_TestNG_Timeout 


   {

	
	@Test
	public void ContactVerify()
	{
	   System.out.println("Registration is successful");
	}
	@Test(timeOut = 10000)     // 10,000 mili second means 10 secs -- within this time frame testing to be completed
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









// Needed for Api automation





/*
 
 "Assignment 63
Write a script on  timeOut parameter in TestNG"

*/
