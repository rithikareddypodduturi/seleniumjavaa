package testngorder;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class testNg_XML_File {
	WebDriver driver;
  @Test
  public void seleniumdev() {
	  driver.get("https://www.selenium.dev");
  }
  @Test
  public void facebook() {
	  driver.get("https://www.facebook.com");
  }
  @Test
  public void techlearn() {
	  driver.get("https://www.techlearn.in");
  }
  @Test
  public void google() {
	  driver.get("https://www.google.com");
  }
  @Test
  public void redmine() {
	  driver.get("https://www.redmine.org");
  }
  @Test
  public void twitter() {
	  driver.get("https://www.x.com");
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }


}
