package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A12_UsingTagName_HTML{

	public static void main(String[] args) 
	
	{
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("file:///Users/nishamohanan/Downloads/Form_Learning.html");
		WebElement taga = driver.findElement(By.tagName("a"));
		taga.click();
		driver.close();
		

	}

}
