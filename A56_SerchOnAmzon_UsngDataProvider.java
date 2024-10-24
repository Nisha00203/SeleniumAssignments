package TopushtoGit;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A56_SerchOnAmzon_UsngDataProvider 

{

	

	
	@DataProvider(name="searchprodcuts") 	// login is fixed name
	public Object[][] method1()      // Return type of Data provider is "object class of 2D" and give a method name
	
	{
		
		return new Object[][] {{"clothing"},{"shoes"},{"hat"},{"shawl"},{"kit"}};
		
		
	

    }
	
	@Test(dataProvider="searchprodcuts")  // Giving the name of Data provider here
	public void searchinamazon(String products) throws InterruptedException
	{
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys(products +Keys.ENTER);
		driver.quit();
	
	}
	

	
}










/*
"Assignment 56
Search something on Amazon with 10 inputs using Dataprovider"
*/
