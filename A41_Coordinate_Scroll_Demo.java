package TopushtoGit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A41_Coordinate_Scroll_Demo {

	public static void main(String[] args) throws InterruptedException
	
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.xpath("//a[.='About Amazon']"));
		Point p1 =e1.getLocation();
		int x = p1.getX();
		int y = p1.getY();
		System.out.println(x);
		System.out.println(y);
		
		
		// To scroll //
		
		JavascriptExecutor js = driver;
		js.executeScript("window.scroll(0,"+y+")");


	}

}


//driver.switchto.alert accept();
//driver.switchto.alert dismiss();





/*
"Assignment 40
Launch Amazon & findout the co-ordinate of About Amazon"
*/