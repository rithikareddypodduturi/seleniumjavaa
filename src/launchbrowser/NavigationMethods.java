package launchbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/google.com");
		Thread.sleep(2000);
		driver.navigate().to("https:/facebook.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();

	}

}
