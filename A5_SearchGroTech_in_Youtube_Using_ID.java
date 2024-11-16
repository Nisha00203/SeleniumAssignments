package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A5_SearchGroTech_in_Youtube_Using_ID {

	public static void main(String[] args) throws InterruptedException
	
	{
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.youtube.com/");
		//driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement en = driver.findElement(By.name("search_query"));
		Thread.sleep(1000);
		en.sendKeys("Grotechminds");
		en.sendKeys(Keys.ENTER);
		driver.quit();
		

		
		
	}

}




















/*
Assignment5
WAP :on Youtube Search Grotechminds with help of ID locator 

*/