package SeleniumAssignment;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A_18_RevertThe_DragDrp {

	public static void main(String[] args) throws InterruptedException
	
	{
		

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.id("container-11"));
		e1.click();     // drag
		Thread.sleep(1000);
		
		WebElement e2 = driver.findElement(By.id("div2"));
		e2.click(); //drop
		Thread.sleep(1000);
		
		Actions e3 = new Actions(driver);
		e3.dragAndDrop(e1, e2).perform();
		Thread.sleep(1000);
		e3.dragAndDrop(e2, e1).perform();
		
		driver.close();
		

	}

}
