package TopushtoGit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A21_AutoSuggestionDemo 

{

	public static void main(String[] args) throws InterruptedException 
	
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoes");
		
		Thread.sleep(3000);
		// Grandparentag Div/parent-tag Div /child Div 
		List<WebElement> li = driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div/div")); 
		int count = li.size();
		System.out.println(count);
		li.get(1).click();
		

	}

}






















/*
"Assignment 21
Launch Amazon.in , Type ""Shoe"" and from auto-suggestions select 2nd Auto-suggestion option"
*/