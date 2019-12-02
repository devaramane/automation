import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vikram Devaramane\\workspace\\Automation\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// driver.get("https://www.makemytrip.com/");
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		// driver.findElement(By.linkText("Create an account")).click();
		// driver.findElementByXPath("//*[.='DEPARTURE']").click();
		// driver.findElementByXPath("//div[@class='dateInnerCell']//following::div[21]").click();
		// Thread.sleep(2000);
		// driver.findElementByXPath("//*[.='RETURN']").click();
		// driver.findElementByXPath("//div[@class='dateInnerCell']//following::div[25]").click();
		// driver.findElementByXPath("//div[@class='dateInnerCell']//following::div[25]").click();
		// Thread.sleep(5000);
		// driver.findElementByXPath("//*[@class='primaryBtn font24 latoBlack
		// widgetSearchBtn ' and .='Search']").click();
		// driver.findElementByXPath("//*[@class='fswTabs latoBlack
		// greyText']").click();

		// Checking the Visibility of the Web Elements
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Valid Verification");
		} else
			System.out.println("Invalid Verification");
		// boolean checkSearchBox =
		// driver.findElementByXPath("//input[@title='Search']").isDisplayed();
//		driver.findElementByXPath("//input[@title='Search']").sendKeys("Selenium");
//		Thread.sleep(5000);
//		driver.findElementByXPath("//input[@title='Search']").clear();
//		Thread.sleep(5000);
//		driver.findElementByXPath("//input[@title='Search']").sendKeys("Dell");
//		driver.findElementByCssSelector("input.gNO89b").click();
		// System.out.println(checkSearchBox);
		boolean searchIcon=driver.findElementByCssSelector("svg[viewBox='0 0 24 24']").isDisplayed();
		System.out.println(searchIcon);
		System.out.println("Execution Over");
		driver.quit();

	}

}
