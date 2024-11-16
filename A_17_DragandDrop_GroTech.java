package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A_17_DragandDrop_GroTech 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://grotechminds.com/drag-and-drop/");
		WebElement e1 = driver.findElement(By.xpath("//div[@id='container-10']"));
		WebElement e2 = driver.findElement(By.xpath("//div[@id='div2']"));

		Actions ac = new Actions(driver);
		ac.dragAndDrop(e1, e2).perform();
		
		

	}

}






























// Assignment 17
// WAP on Drag and Drop using "https://grotechminds.com/drag-and-drop/" website