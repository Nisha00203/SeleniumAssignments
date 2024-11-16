package SeleniumAssignment;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A24_AutoSugestin_PrntAlloptins_Amzon {

	public static void main(String[] args) throws InterruptedException 
	
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);	
		
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));	
		searchbox.sendKeys("shoes");
	 
		List<WebElement> li = driver.findElements(By.xpath("(//div[@class='two-pane-results-container'])/div/div/div"));
		int a = li.size();
		System.out.println(a);
		
		
		for(int i=0;i<li.size();i++)
		{
			
			WebElement a1 = li.get(i);
			String s1 = a1.getText();
			System.out.println("Options ="+s1);
			
		}
	
		
		
		
		//List<WebElement> li = driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div/div")); 
		
		

	}

}

















/*
"Assignment 24
Launch Amazon.in , Type ""Shoe"" and from auto-suggestions print all the options"
*/


