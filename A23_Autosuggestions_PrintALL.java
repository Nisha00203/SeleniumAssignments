package SeleniumAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A23_Autosuggestions_PrintALL {

	public static void main(String[] args) throws InterruptedException 
	
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement googlesearchfield = driver.findElement(By.id("APjFqb"));
		googlesearchfield.sendKeys("Bangalore");
		Thread.sleep(1000);

		               
		List<WebElement> li =driver.findElements(By.xpath("(//div[@class='OBMEnb'])/ul/li"));
		
		int a = li.size();
		System.out.println(a);
		/*
		WebElement a1 = li.get(1); 
		System.out.print(a1.getText());
		
		System.out.println("------------------------");
		*/
		

		for(int i=0;i<li.size();i++)
			
		  {
				    WebElement auto1=li.get(i);    // gives the list of autosuggestion
					String s1=auto1.getText();  // gives the text of autosuggestion
					System.out.println(s1);
				    String s2 =	auto1.getAttribute("href"); // Prints all the links
					System.out.println(s2);
		  
		  
		  }
	
		
		
	}

	
}







/*
"Assignment 23
Launch google, Type ""Bangalore"" and from auto-suggestions print all options"
*/