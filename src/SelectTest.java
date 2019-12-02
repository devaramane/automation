import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class SelectTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vikram Devaramane\\workspace\\Automation\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		// try {
		// driver.get("C:\\Users\\Vikram%20Devaramane\\Desktop\\VDTEST.html");
		// Select select = new
		// Select(driver.findElement(By.id("SelectID_One")));
		// String text=select.selectByIndex(0).getText();
		// select.selectByIndex(1);
		// select.selectByValue("yellowvalue");
		// select.selectByValue("greyvalue");
		// select.deselectAll();
		// Thread.sleep(3000);
		// driver.close();
		// } catch (Exception e) {
		// driver.quit();
		// System.out.println("Exception Occurred");

		// }
//		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		// driver.get("https://www.deccanherald.com/");
//		driver.get("https://www.msn.com/en-in/");
//		WebElement sourceLocator = driver.findElement(By.xpath("//a[@href='https://www.skype.com/']"));
//		WebElement destinationLocator = driver.findElement(By.xpath("//a[@href='https://outlook.com/']"));
//		Actions actions = new Actions(driver);
//		actions.dragAndDrop(sourceLocator, destinationLocator).build().perform();
		// WebElement mouseHover=driver.findElement(By.linkText("Sign in"));
		// actions.moveToElement(mouseHover);
		// actions.perform();
	
		System.out.println("Assertion Over");
		// driver.findElement(By.id("Karnataka")).click();

		// Thread.sleep(5000);
		// File shot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(shot, new File("G:\\Selenium\\shot3.jpg"));

		// WebDriverWait wait = new WebDriverWait(driver,10);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-label='search:']")));
		// driver.navigate().to("https://www.google.com/");
		driver.close();

	}

}
