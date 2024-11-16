package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A14_ClickFashion_usg_Textmsg 
{

public static void main(String[] args)

{
		
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	WebElement textclick = driver.findElement(By.xpath("(//span[.='Fashion'])[2]"));
    textclick.click();
    driver.close();
}

}



























/*
Assignment14
WAP in flipkart clickon fashion menu using Xpath
using text message
*/