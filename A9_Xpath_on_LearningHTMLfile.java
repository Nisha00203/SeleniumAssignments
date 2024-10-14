package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A9_Xpath_on_LearningHTMLfile {

	public static void main(String[] args) 
	
	{
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("file:///Users/nishamohanan/Downloads/Form_Learning.html");
		WebElement e1 = driver.findElement(By.xpath("(/html/body/input)[1]"));
		e1.sendKeys("Nisha@gmail.com");

		WebElement e2 = driver.findElement(By.xpath("(/html/body/input)[2]"));
		e2.sendKeys("Hint");
		
		WebElement e3 = driver.findElement(By.xpath("(/html/body/input)[3]"));
		e3.sendKeys("Password");
		
		WebElement FirstName = driver.findElement(By.xpath("(html/body/form)[1]/input[1]"));
		FirstName.sendKeys("Nisha");
		
		WebElement CheckBox1 = driver.findElement(By.xpath("(/html/body/form)[2]/input[1]"));
		CheckBox1.click();
		
		WebElement CheckBox2 = driver.findElement(By.xpath("(/html/body/form)[2]/input[2]"));
		CheckBox2.click();
		
		WebElement CheckBox3 = driver.findElement(By.xpath("(/html/body/form)[2]/input[3]"));
		CheckBox3.click();
		
		WebElement RadioButton1 = driver.findElement(By.xpath("(/html/body/input)[4] "));
		RadioButton1.click();
		
		WebElement RadioButton2 = driver.findElement(By.xpath("(/html/body/input)[5] "));
		RadioButton2.click();
			
		WebElement Relocate = driver.findElement(By.xpath("(/html/body/input)[6]"));
		Relocate.click();
		
		WebElement Link = driver.findElement(By.xpath("/html/body/a"));
		Link.click();
		
		
	
		
		
	}

}























/*

Assignment 9
WAP on learning htmt file with help of absolute Xpath(here not to use components Your Last name,Relegion,submit ,submit,and sign up )

*/