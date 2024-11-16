package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4_SearchUsing_ID_Amazon {

	public static void main(String[] args) 
	
	{
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.Amazon.in");
		driver.manage().window().maximize();
		
		WebElement en = driver.findElement(By.id("twotabsearchtextbox"));
		en.sendKeys("kurti for women cotton" +Keys.ENTER);

	}

}































/*
Assignment4
With help of ID Locator  search something on Amazon 
*/