package TopushtoGit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class A64_ 

{
	
	@Test
	public void searchshoe()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoes" +Keys.ENTER);
		List<WebElement> li = driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
		boolean count = li.size()>50;
		System.out.println(count);
		
		System.out.println(li.size());
					
	    Assert.assertEquals(count, true, "Test case failed");    // am exoecting it to be true since am expecting elements here
	
				
		
	}
	

}
