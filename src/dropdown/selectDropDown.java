package dropdown;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class selectDropDown {
	WebDriver driver;
  @Test
  public void dropdownoptions() {
	  driver.get("https://www.facebook.com/r.php?entry_point=login");
	  Select m = new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
	 // m.selectByVisibleText("Aug");
	
	  //m.selectByIndex(8);
	 // m.selectByValue("6");
	  //m.selectByIndex(5);
	  //m.selectByContainsVisibleText("Sep");
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
