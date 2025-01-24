package testngorder;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNg_depends_on {
	WebDriver driver;
	@Test(dependsOnMethods="tc2")
	  public void tc1() {
		  driver.findElement(By.name("q")).sendKeys("America");
		  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
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
