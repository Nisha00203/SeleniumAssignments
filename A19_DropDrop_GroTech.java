package ToPushToGIt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A19_DropDrop_GroTech {

	public static void main(String[] args) throws InterruptedException 
	
	{
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		Thread.sleep(1000);	
		
		WebElement skilldropdw = driver.findElement(By.id("Skills"));	
		Select sc1 = new Select(skilldropdw);		
		sc1.selectByValue("select1");
		
	
		WebElement countrydropdown = driver.findElement(By.id("Country"));	
		Select sc2 = new Select(countrydropdown);
		sc2.selectByValue("Saudi Arabia");
		
		WebElement Religiondropdown = driver.findElement(By.id("Relegion"));
		Select sc3= new Select(Religiondropdown);
		sc3.selectByIndex(4);
	



	}

}

























/*
"Assignment 19
WAP on DropDown handling using ""https://grotechminds.com/registration/"" website for
Skills, Country and Relegion dropdowns"
*/