package SeleniumAssignment;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A20_Srch_Bang_click6th_AutoSugg {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement googlesearchfield = driver.findElement(By.id("APjFqb"));
		googlesearchfield.sendKeys("Bangalore");
		Thread.sleep(1000);
		
	    List<WebElement> li = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count = li.size(); // coming from list interface
		System.out.println(count);
		//li.get(5).click();
		li.get(count-10).click();
		
		
		
	}

}






//get and size is the method present in list













//Assignment 20
//Launch google, Type "Bangalore" and from auto-suggestions select 6th Auto-suggestion option