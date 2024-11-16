package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A28_LaunchGoogle_RightClickGmail {

	public static void main(String[] args) 
	
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");	
		WebElement Rightclickgmail = driver.findElement(By.linkText("Gmail"));
		
		Actions a1 = new Actions(driver);
		a1.contextClick(Rightclickgmail).perform();
	}

}




























// Assignment 28 Launch Google and Right click on 'Gmail'