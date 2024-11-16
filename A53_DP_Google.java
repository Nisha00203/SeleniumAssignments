package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A53_DP_Google 

{


		
		@DataProvider(name="set1")
		public Object[][] method1()
		{
			
			return new Object[][] {{"India"},{"Srilanka"},{"Bangaladesh"}};
					
		}
		@DataProvider(name="set2")
		public Object[][] method2()
		{
			
			return new Object[][] {{"modi"},{"srk"},{"salaman"}};
					
		}
		@DataProvider(name="set3")
		public Object[][] method3()
		{
			
			return new Object[][] {{100},{200},{300},{400},{500}};
					
		}
		
		
		@Test(dataProvider ="set3")
		public void method(int input)
		{
			
			int sum = 100+input;               // adding 100 to every input
			System.out.println(sum);
			Reporter.log("addition is ==> "+sum);       // to see the report in emailable report
			
			
		}
		
		
		/*@Test(dataProvider ="set2")
		public void search (String input) throws InterruptedException
		{
			
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			WebElement e1=	driver.findElement(By.name("q"));
			Thread.sleep(1000);
			e1.sendKeys(input +Keys.ENTER);
			driver.quit();

		 */
		
		
	}


