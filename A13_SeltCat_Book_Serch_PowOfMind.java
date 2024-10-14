package SeleniumAssignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class A13_SeltCat_Book_Serch_PowOfMind {

	public static void main(String[] args) 
	
	
	{
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

	}

}































/*
Assignment 13 Launch amazon,select a catagory as books,
search a book called power of minds and press enter button using X-Path
*/