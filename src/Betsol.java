import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.DriverManager;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;

import junit.framework.Assert;

public class Betsol {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vikram Devaramane\\workspace\\Automation\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// driver.manage().timeouts().pageLoadTimeout(500, TimeUnit.SECONDS);
		// driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// try{
		// driver.get("https://www.msn.com/en-in/");
		// WebElement outlook=driver.findElement(By.linkText("Outlook.com"));
		// if (outlook.isDisplayed()){
		// outlook.click();
		// }
		// }
		// catch(NoSuchElementException e){
		// e.printStackTrace();
		// }
		// finally{
		// System.out.println("Exception handled well");
		// }

		// Selecting Iframes
		// driver.get("C:\\Users\\Vikram
		// Devaramane\\Desktop\\Betsol\\frame.html");
		// driver.switchTo().frame(driver.findElement(By.tagName("iframe").get(0)));
		// Login Code
		// driver.get("http://localhost:8080/login.do");
		// driver.navigate().to("https://www.msn.com/en-in/");
		// MouseHover
		// driver.get("https://www.msn.com/en-in/");
		// Actions actions=new Actions(driver);
		// WebElement element=driver.findElement(By.linkText("Outlook.com"));
		// actions.moveToElement(element);
		// actions.perform();

		// DrapAndDrop
		// driver.get("https://www.msn.com/en-in/");

		// String wHan=driver.getWindowHandle();
		// System.out.println(wHan);
		// WebElement Outlook=driver.findElement(By.linkText("Outlook.com"));
		// WebElement Amazon=driver.findElement(By.linkText("Amazon"));
		// Actions actions=new Actions(driver);
		// actions.dragAndDrop(Outlook, Outlook);
		// To take Screenshot
		// File shot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(shot, new File("G:\\VDG.jpg"));
		// System.out.println("Screenshot Taken");
		// driver.navigate().back();
		// driver.navigate().forward();
		// WebDriverWait and ExpectedConditions Class
		// WebDriverWait wait= new WebDriverWait(driver,10);
		// WebElement
		// element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		// wait.until(ExpectedConditions.alertIsPresent());
		// driver.findElement(By.id("username")).sendKeys("admin");
		// driver.findElement(By.name("pwd")).sendKeys("manager");
		// driver.findElement(By.xpath("//div[.='Login ']")).click();
		// String title=driver.getCurrentUrl();
		// System.out.println(title);
		// driver.get("https://www.msn.com/en-in/");
		// Selecting Dropdowns using Select Class
		// driver.get("C:\\Users\\Vikram Devaramane\\Desktop\\VDTEST.html");
		// Select selectByValue = new
		// Select(driver.findElement(By.id("SelectID_One")));
		// System.out.println(driver.findElement(By.tagName("option")).getText());
		// selectByValue.selectByIndex(1);
		// selectByValue.selectByValue("greyvalue");
		// selectByValue.deselectAll();
		// driver.findElement(By.linkText("Outlook.com")).click();
		// driver.findElement(By.partialLinkText("Outlook")).click();
		// String title=driver.getTitle();
		// String page=driver.getPageSource();
		// String handle = driver.getWindowHandle();
		// String curl=driver.getCurrentUrl();
		// System.out.println(curl);
		// Thread.sleep(5000);
		// driver.close();
//		try {
//			driver.get("https://www.mn.com/en-in/");
//			driver.navigate().to("https://www.deccanherald.com/");
//			driver.navigate().back();
//		} catch (ElementNotFoundException e) {
//			e.printStackTrace();
//			System.out.println("Exception Handled");
//
//		} finally {
//			driver.close();
//		}
		//Alert Popup Verification
//		driver.get("C:\\Users\\Vikram Devaramane\\Desktop\\Betsol\\alert.html");
//		driver.findElement(By.xpath("//*[.='Try it']")).click();
//		driver.switchTo().alert().accept();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[.='Try it']")).click();
//		String text=driver.switchTo().alert().getText();
//		driver.switchTo().alert().dismiss();
//		System.out.println(text);
//		Thread.sleep(3000);
//		System.out.println("Alerts Verified");
//		driver.close();
		//Alert Popup Verification
//		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
//		driver.findElement(By.linkText("Sign in")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("vdshosadurga");
//		driver.findElement(By.xpath("//span[.='Next']")).click();
		driver.get("http://www.google.com");
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
		robot.keyPress(KeyEvent.VK_H);
		robot.keyRelease(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyRelease(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
		
		
		
		
		
		
		
	}

}
