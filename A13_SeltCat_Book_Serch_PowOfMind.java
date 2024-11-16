package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class A13_SeltCat_Book_Serch_PowOfMind {

public static void main(String[] args) 
	
	
	{
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.id("searchDropdownBox"));
		Select sc = new Select(e1);          // Creating object of select class
		sc.selectByVisibleText("Books");     // locate by visible text
		
		WebElement textBox = driver.findElement(By.id("twotabsearchtextbox")); // searching book name in text box
		textBox.sendKeys("power of minds");
		
		WebElement searchenter = driver.findElement(By.id("nav-search-submit-button"));
		searchenter.click();
		
		
		
		
		

	}

}































/*
Assignment 13 Launch amazon,select a catagory as books,
search a book called power of minds and press enter button using X-Path
*/