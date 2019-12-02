package practice.hcl;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Sandbox_temp {
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vikram Devaramane\\workspace\\Automation\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.msn.com/en-in/");
		String expectedTitle = "MSN India | Breaking News, Entertainment, Latest Videos, Outook";
		String actualTitle = driver.getTitle();
//		Assert.assertEquals(actualTitle, expectedTitle);
		if(actualTitle.equals(expectedTitle)){
			
			System.out.println("Comparing Web Titles");
		}
		
		System.out.println("Execution Over");
		driver.close();
//		Thread.sleep(3000);
//		((JavascriptExecutor)driver).executeScript("window.open()");
//		ArrayList<String> ref = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(ref.get(1));
//		driver.get("https://www.deccanherald.com/");
//		Thread.sleep(3000);
//		driver.close();
		
		

	}


}