package alertpopup;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class alretTest {
	WebDriver driver;
  @Test
  public void alertokbutton() throws InterruptedException {
	  driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"post-725\"]/div/div/div/div/div/div/div/button")).click();
	  driver.switchTo().alert().accept();
	  
	  
	  
  }
  @Test
  public void alertpromptbutton() throws InterruptedException {
	  driver.get("https://www.techlearn.in/code/prompt-dialog-box/");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"post-748\"]/div/div/div/div/div/div/div/button")).click();
	  /*driver.switchTo().alert().sendKeys("Rithika");
	  Thread.sleep(2000);
	  driver.switchTo().alert().accept();*/
	  Alert alt = driver.switchTo().alert();
	  alt.sendKeys("Rithika");
	  alt.accept();
	  
  }
  @Test
  public void noalertwindow() throws InterruptedException {
	  driver.get("https://www.techlearn.in");
	  Thread.sleep(2000);
	  driver.switchTo().alert().accept();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
