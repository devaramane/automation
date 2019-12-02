package com.excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sandbox_Exe {
	WebDriver driver;

	@BeforeTest
	public void setUp() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vikram Devaramane\\workspace\\Automation\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("https://www.msn.com/en-in/");

	}

	@Test
	public void msnLaunch() {

		driver.get("https://www.msn.com/en-in/");
		String titleMSN = driver.getTitle();
		System.out.println(titleMSN);
	}

	// @Test(priority=2)
	// public void dhLaunch(){
	//
	// driver.get("https://www.deccanherald.com/");
	// String titleDH = driver.getTitle();
	// System.out.println(titleDH);
	// }

	@AfterTest
	public void tearDown() {

		driver.close();
	}

}
