package testngorder;

import org.testng.annotations.Test;
import org.junit.Ignore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class testNg_ignore {
	WebDriver driver;
	@Test(priority=1)
	  public void seleniumdev() {
		  driver.get("https://www.selenium.dev");
	  }
	@Test(enabled=false,priority=3)
	  public void facebook() {
		  driver.get("https://www.facebook.com");
	  }
	@Test(priority=4)
	  public void techlearn() {
		  driver.get("https://www.techlearn.in");
	  }
	@Ignore
	@Test(priority=5)
	  public void google() {
		  driver.get("https://www.google.com");
	  }
	@Test(enabled=false,priority=2)
	  public void redmine() {
		  driver.get("https://www.redmine.org");
	  }
	@Test(priority=6)
	  public void twitter() {
		  driver.get("https://www.x.com");
	}
  @BeforeTest
  public void beforeTest() {
	  driver = new  ChromeDriver();
	  driver.manage().window().maximize();
  }

}
