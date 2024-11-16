package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A65_

{
	
	@Test
	public void Login() throws InterruptedException
	{
		
		ChromeDriver driver=new ChromeDriver();
		String actual = driver.getTitle();
		String expected ="Amazon Sign In";
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.id("ap_email"));
		login.sendKeys("Anish0687@gmail.com");
		WebElement email =  driver.findElement(By.id("continue"));
		email.click();
		
		WebElement pass = driver.findElement(By.id("ap_password"));
		pass.sendKeys("Nokia_9310");
		
		WebElement signin = driver.findElement(By.id("signInSubmit"));
		signin.click();
		
		  
       WebElement e1=driver.findElement(By.id("nav-link-accountList"));
	   Thread.sleep(6000);
					
	   Actions a1 = new Actions(driver);
	   a1.moveToElement(e1).perform();
	   e1.click();
	   Thread.sleep(1000);
	   
	   driver.manage().window().maximize();
	   WebElement e3=  driver.findElement(By.xpath("(//a[.='Sign Out'])[1]"));
	   e3.click();
					
	   Thread.sleep(1000);
	   Assert.assertEquals(actual, true, "Testcase failed");
	   
					 
				 
		
	}
	
	 
	


}
