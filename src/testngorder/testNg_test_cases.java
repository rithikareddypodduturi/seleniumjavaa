package testngorder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNg_test_cases {
	WebDriver driver;
	@Test(description="selenium")
	  public void tc1() {
		  driver.get("https://www.selenium.dev");
	  }
	@Test(description="facebook")
	  public void tc2() {
		  driver.get("https://www.facebook.com");
	  }
	@Test(description="technlogy")
	  public void tc3() {
		  driver.get("https://www.techlearn.in");
	  }
	@Test(description="social ")
	  public void tc4() {
		  driver.get("https://www.google.com");
	  }
	@Test(description="bug tol")
	  public void tc5() {
		  driver.get("https://www.redmine.org");
	  }
	@Test(description=" media")
	  public void tc6() {
		  driver.get("https://www.x.com");
	}
  @BeforeTest
  public void beforeTest() {
	  driver = new  ChromeDriver();
	  driver.manage().window().maximize();
  }
}
