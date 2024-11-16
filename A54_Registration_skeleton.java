package SeleniumAssignment;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A54_Registration_skeleton

{
	
	@Test(dataProvider="login")                                    // Giving the name of Data provider here
	public void login_to_website(String username,String password,int DOB,String Gender, String email)
	{
		
		System.out.println(username);
		System.out.println(password);
		System.out.println(DOB);
		System.out.println(Gender);
		System.out.println(email);
		
		
	}	
	
		
   @DataProvider(name="login")   // login is fixed name
	public Object[][] method1()   // Return type of Data provider is "object class of 2D" and give a method name
	{
		
		//creating array of 2 D
		//creating object of 2D
		
		Object data[][] = new Object[10][5];  // rows and columns
	    data[0][0] = "Nisha";
        data[0][1] = "MR!";
        data[0][2] = 1000;
        data[0][3] = "Female";
        data[0][4] = "xyz@gmail.com!";
        
        
        data[1][0] = "Nisha1111";
        data[1][1] = "MR!";
        data[1][2] = 1000;
        data[1][3] = "Male";
        data[1][4] = "xyz@gmail.com!";
        
        
        data[2][0] = "Nisha2222";
        data[2][1] = "MR!";
        data[2][2] = 1000;
        data[2][3] = "Male";
        data[2][4] = "xyz@gmail.com!";
        
        
        data[3][0] = "Nish3333a";
        data[3][1] = "MR!";
        data[3][2] = 1000;
        data[3][3] = "Female";
        data[3][4] = "xyz@gmail.com!";
        
        
        data[4][0] = "Nisha4444";
        data[4][1] = "MR!";
        data[4][2] = 1000;
        data[4][3] = "Female";
        data[4][4] = "xyz@gmail.com!";
        
        data[5][0] = "Nisha5555";
        data[5][1] = "MR!";
        data[5][2] = 1000;
        data[5][3] = "Female";
        data[5][4] = "xyz@gmail.com!";
        
        data[6][0] = "Nisha6666";
        data[6][1] = "MR!";
        data[6][2] = 1000;
        data[6][3] = "Female";
        data[6][4] = "xyz@gmail.com!";
        
        
        data[7][0] = "Nisha7777";
        data[7][1] = "MR!";
        data[7][2] = 1000;
        data[7][3] = "Male";
        data[7][4] = "xyz@gmail.com!";
        
        data[8][0] = "Nisha8888";
        data[8][1] = "MR!";
        data[8][2] = 1000;
        data[8][3] = "Male";
        data[8][4] = "xyz@gmail.com!";
        
        data[9][0] = "Nisha9999";
        data[9][1] = "MR!";
        data[9][2] = 1000;
        data[9][3] = "Male";
        data[9][4] = "xyz@gmail.com!";


  	
		return data;
		
	
	
	

 }



}























/*


Assignment 54
WAP (Skeleton program) to do registration using below fields
FirstName, LastName, DOB, Gender, EmailID

*/
