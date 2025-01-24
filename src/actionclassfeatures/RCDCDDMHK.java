package actionclassfeatures;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class RCDCDDMHK {
	WebDriver driver;
  /*@Test
  public void rightclick() throws InterruptedException {
	  driver.get("https://www.techlearn.in");
	  Thread.sleep(2000);
	  Actions act = new Actions(driver);
	  act.contextClick(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-17\"]/a"))).build().perform();
  }*/
  /*@Test
  public void doubleclick() throws InterruptedException {
	  driver.get("https://www.techlearn.in/code/double-tap/");
	  Thread.sleep(2000);
	  Actions act = new Actions(driver);
	  act.doubleClick(driver.findElement(By.xpath("//*[@id=\"post-3320\"]/div/div/div/div/div/div/button"))).build().perform();
  }*/
  /*@Test
  public void draganddrop() throws InterruptedException {
	  driver.get("https://www.techlearn.in/code/drag-and-drop/");
	  Thread.sleep(2000);
	  Actions act = new Actions(driver);
	  WebElement source = driver.findElement(By.xpath("//*[@id=\"drag1\"]"));
	  WebElement target = driver.findElement(By.xpath("//*[@id=\"div1\"]"));
	  act.dragAndDrop(source, target).build().perform();
  }*/
	/*@Test
	  public void mousehover() throws InterruptedException {
		  driver.get("https://www.techlearn.in/");
		  Thread.sleep(2000);
		  Actions act = new Actions(driver);
		  act.moveToElement(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-14\"]"))).build().perform();
		  Thread.sleep(2000);
		  act.moveToElement(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-46\"]/a"))).click().build().perform();
		  
	}*/
	@Test
	  public void keyboardfunctions() throws InterruptedException {
		  driver.get("https://www.techlearn.in/wp-login.php");
		  Thread.sleep(2000);
		  Actions act = new Actions(driver);
		  act.sendKeys(Keys.TAB).build().perform();
		  
	}
	
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
