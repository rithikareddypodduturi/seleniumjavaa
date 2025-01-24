package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Innvocationcount {
	WebDriver driver;
	@Test(invocationCount=3)
	  public void tc1() throws InterruptedException {
		  driver.get("https://www.google.com");
		  Thread.sleep(2000);
		  driver.get("https://www.facebook.com");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("rithika");
		  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(Keys.TAB);
		  
		  
				  }
	@Test()
	  public void tc2() {
		  driver.get("https://www.google.com");
	}
  @BeforeTest
  public void beforeTest() {
	  driver = new  ChromeDriver();
	  driver.manage().window().maximize();
  }
}
