package testngorder;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class testNg_priority_order {
	WebDriver driver;
	@Test(priority=1)
	  public void seleniumdev() {
		  driver.get("https://www.selenium.dev");
	  }
	  @Test(priority=3)
	  public void facebook() {
		  driver.get("https://www.facebook.com");
	  }
	  @Test(priority=4)
	  public void techlearn() {
		  driver.get("https://www.techlearn.in");
	  }
	  @Test(priority=5)
	  public void google() {
		  driver.get("https://www.google.com");
	  }
	  @Test(priority=2)
	  public void redmine() {
		  driver.get("https://www.redmine.org");
	  }
	  @Test(priority=6)
	  public void twitter() {
		  driver.get("https://www.x.com");
	  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }
  

}
