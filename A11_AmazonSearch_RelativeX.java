package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A11_AmazonSearch_RelativeX {

	public static void main(String[] args) 
	
	{
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement sear = driver.findElement(By.xpath("(//input)[5]"));
		sear.sendKeys("shoes" +Keys.ENTER);
		
		

	}

}






















/*
Assignment 11
WAP launch Amazon.in
try to search something 
using search field 
using relative Xpath

*/