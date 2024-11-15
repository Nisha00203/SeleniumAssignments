package ToPushToGIt;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class A35_ScreenShotInWrongLocationDemo2 
{

	public static void main(String[] args) throws IOException 
	
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts = driver;
		File source = ts.getScreenshotAs(OutputType.FILE); // when ever you write TakesScreenshot , write OutputType and its return type is file
		
		File destination  = new File ("/Users/nishamohanan/Downloads/SSDemo/NKT  "+Math.random()+ ".png");// provide location of where u want to take SS
		FileHandler.copy(source, destination);     // to copy file from source to destination : source is where u have take SS and destination is where u want to store the SS
		
		
		
		
	}

	
}
