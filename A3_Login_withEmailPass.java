package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A3_Login_withEmailPass 


{

	public static void main(String[] args)
	
	{
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("xyz@@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("pass");
        driver.findElement(By.name("login")).click();
        
        
	
		
		

	}

}












/*
Assignment3
Login to Amazon ,Facebook,flipkart provide email and pwd then click on login
*/