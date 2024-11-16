package SeleniumAssignment;

import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A34_Add2wishlist_windowHandlesPracti 

{

	public static void main(String[] args) throws InterruptedException 
	
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("shoes"  + Keys.ENTER);
        WebElement firstshoes = driver.findElement(By.xpath("(//div[@class='s-image-padding'])[1]")); 
		firstshoes.click();
		
		   Set<String> s1  =  driver.getWindowHandles();
		      
		 Iterator<String> it   =  s1.iterator();
		 while(it.hasNext())
		 {
			 
			 String parentid = it.next();
			 String childid =  it.next();
			 System.out.println(parentid);
			 System.out.println(childid);
			 driver.switchTo().window(childid);	
			
			 
		 }
			
		    Thread.sleep(3000);
			
			WebElement Addtowish = driver.findElement(By.id("wishListMainButton"));
			Addtowish.click();    // child window
			
	}

}














/*
"Assignment 34
Launch Amazon.in , search ""Shoe"" click on 1st shoe and add to wishList"
*/