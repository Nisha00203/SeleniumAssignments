package SeleniumAssignment;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LaunchMultiple_EmptyBrowsers {

	public static void main(String[] args) 
	
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		FirefoxDriver driver1 = new FirefoxDriver();
		driver1.manage().window().maximize();
		
		SafariDriver driver3 = new SafariDriver();
		driver1.manage().window().maximize();
		
		InternetExplorerDriver driver4 = new InternetExplorerDriver();
		driver1.manage().window().maximize();
		
		

	}

}























/*WAP for launch multiple empty browser like 
Chrome,Firefox,Edge,safari */