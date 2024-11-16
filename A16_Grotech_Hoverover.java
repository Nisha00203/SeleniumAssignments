package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A16_Grotech_Hoverover {

	public static void main(String[] args) throws InterruptedException
	
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/hoverover/");
		Thread.sleep(1000);
		WebElement e1 = driver.findElement(By.xpath(" (//div[@class='toolrip4'])[1]  "));
		
		Actions a1 = new Actions(driver);
		a1.moveToElement(e1);
		e1.click();
		
		Thread.sleep(1000);
		
		WebElement e2 = driver.findElement(By.xpath("(//div[@class='popup4'])[1]"));
		e2.click();
		
		
		

	}

}
















//Assignment 16 WAP on Hoverover using "https://grotechminds.com/hoverover/" website