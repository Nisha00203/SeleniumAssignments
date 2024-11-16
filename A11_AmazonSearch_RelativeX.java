package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A11_AmazonSearch_RelativeX {

	public static void main(String[] args) throws InterruptedException 
	
	{
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searshoe = driver.findElement(By.xpath("(//input)[5]"));
		searshoe.sendKeys("shoes");
		Thread.sleep(1000);
		
		
		
		

	}

}






















/*
Assignment 11
WAP launch Amazon.in
try to search something 
using search field 
using relative Xpath

*/