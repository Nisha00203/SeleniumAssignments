package SeleniumAssignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A33_SerchShoe_frstshoe_AddToCrt 
{

public static void main(String[] args) throws InterruptedException 
	
 {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoes" +Keys.ENTER);
		WebElement e2 = driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		e2.click();		// parent window
		
		
		Set<String> s1 = driver.getWindowHandles(); // here return type is set(because it has to store unique id of browsers) of strings because its alphanumeric
		System.out.println(s1);      // output we will get 2 id's first id is always parent id and second id is child id
		 
		Iterator<String> it = s1.iterator();                  // iterating to  separate parent and child window in order to break indexing.
				while(it.hasNext())
				{
					
					String parentid = it.next();
					String childid =  it.next();
					System.out.println(parentid);
					System.out.println(childid);
					
				
		            driver.switchTo().window(childid);	
		
				}
	
				Thread.sleep(3000);
		
		WebElement Addtocartbtn = driver.findElement(By.id("add-to-cart-button"));
		Addtocartbtn.click();    // child window
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
	}

}
