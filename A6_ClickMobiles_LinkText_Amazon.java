package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A6_ClickMobiles_LinkText_Amazon {

	public static void main(String[] args) 
	
	
	{
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.linkText("Mobiles"));
		e1.click();
		
		

	}

}






































/*
Assignment6
WAP launch Amazon.in try to click mobile with help of Linktest Locator 
*/
