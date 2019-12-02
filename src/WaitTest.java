
//--- ImplicitWait & ExplicitWait ---
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class WaitTest {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vikram Devaramane\\workspace\\Automation\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// Handling Windows Popups
//		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
//		driver.findElement(By.linkText("Sign in")).click();
//		Thread.sleep(2000);
//		driver.findElementByXPath("//input[@type='email']").sendKeys(Keys.ENTER);
//		driver.findElement(By.id("identifierId")).sendKeys("vdshosadurga");
//		Thread.sleep(2000);
//		driver.close();
		// driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.get("https://www.google.com/");
		// driver.navigate().to("https://www.msn.com/en-in/");
		// driver.navigate().back();
		// driver.close();
		// Robot robot = new Robot();
		// robot.keyPress(KeyEvent.VK_DOWN);

	}

}
