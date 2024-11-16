package TopushtoGit;

import java.io.File;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A52_TestNG_ScenarioProblem 

{
	
	public WebDriver driver;
	
	@BeforeMethod
	public void Method1()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void findshoes() throws InterruptedException, IOException
	{
		

		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoes" +Keys.ENTER);
		WebElement e2 = driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		e2.click();		// parent window
		
		
		Set<String> s1 = driver.getWindowHandles(); // here return type is set(because it has to store unique id of browsers) of strings because its alphanumeric
		System.out.println(s1);      // output we will get 2 id's first id is always parent id and second id is child id
		 
		Iterator<String> it = s1.iterator();                  // iterating to  separate parent and child window in order to break indexing.
				while(it.hasNext())
				{
					
					String parentid = it.next();
					String childid =  it.next();
					System.out.println(parentid);
					System.out.println(childid);
					
				
		            driver.switchTo().window(childid);	
		
				}
	
				Thread.sleep(3000);		
		
			
	}
	
	@Test
	public void Addtowishlist () throws InterruptedException, IOException
	{
		
		    findshoes();
	 	    Thread.sleep(1000);
			WebElement Addtowish = driver.findElement(By.xpath("//span[@id='wishListMainButton']"));
			Addtowish.click();    // child window
	}
	
	
	@AfterMethod
	public void Method4() throws InterruptedException
	{
	  Thread.sleep(4000);
      driver.quit();
	

    }
	
}


/*
Assignment 52
WAP which is having. @beforeMethod, @afterMethod and 2 test cases and should perform below steps
1. launch browser 
2. Testcase1 - Login to amezon search for any product, 
3. Testcase2 - Login to Amezon and Add product to wishlist
4. Close browser
*/