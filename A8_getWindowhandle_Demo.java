package SeleniumAssignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class A8_getWindowhandle_Demo {

	public static void main(String[] args)
	
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String Res = driver.getTitle();
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());

	}

}
