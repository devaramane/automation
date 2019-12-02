package com.excel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElement_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vikram Devaramane\\workspace\\Automation\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.msn.com/en-in/");

		// WebElement outlook =
		// driver.findElement(By.xpath("//*[.='Outlook.com']"));

		// outlook.click();

		List<WebElement> msn = driver.findElements(By.xpath("//*[.='msn']"));

		for (WebElement i : msn) {
			System.out.println(i);
		}
		driver.close();
	}

}
