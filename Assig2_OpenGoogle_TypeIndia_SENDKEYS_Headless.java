
package SeleniumAssignment;

import org.openqa.selenium.By;


import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assig2_OpenGoogle_TypeIndia_SENDKEYS_Headless 
{

	public static void main(String[] args) 
	
	{
		
				
		ChromeOptions c1 = new ChromeOptions(); //headless mode
		c1.addArguments("--headless"); //with the help of ref var using method .addArguments	
		
		ChromeDriver driver = new ChromeDriver(c1); //passing c1 in ChromeDriver
		
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("India");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		

	}

}