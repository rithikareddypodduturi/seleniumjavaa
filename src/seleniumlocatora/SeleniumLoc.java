package seleniumlocatora;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class SeleniumLoc {
	static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.close();
	}
	@Test
	void totallinks() throws InterruptedException {
		/*driver.get("https://www.techlearn.in/admin");
		Thread.sleep(2000);
		driver.findElement(By.id("user_login")).sendKeys("Rithika");
		driver.findElement(By.name("pwd")).sendKeys("abc");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#rememberme")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#wp-submit")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("wp-login-lost-password")).click(); 
		driver.findElement(By.linkText("Lost your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Lost")).click();
		Thread.sleep(2000);*/
		driver.get("https://www.google.com");
		List<WebElement>totallinks = driver.findElements(By.tagName("a"));
		System.out.println("Total links are: "+totallinks.size());
		/*driver.get("https://www.techlearn.in/admin");
		Thread.sleep(2000);
		driver.findElement( By.xpath("//*[@id=\"user_login\"]")).sendKeys("Rithika");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/form/div/div/input")).sendKeys("abc");
		Thread.sleep(2000);*/
		

		
	}

}
