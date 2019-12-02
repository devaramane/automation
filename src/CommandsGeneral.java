import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommandsGeneral {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vikram Devaramane\\workspace\\Automation\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.msn.com/en-in/");
		String attr=driver.findElement(By.linkText("NEWS")).getAttribute("/en-in/news");
//		String text=driver.findElement(By.linkText("NEWS")).getText();
//		System.out.println(driver.getPageSource());
//		System.out.println(driver.getTitle());
		System.out.println(attr);
		Thread.sleep(2000);
		driver.close();
	}

}
