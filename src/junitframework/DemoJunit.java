package junitframework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class DemoJunit {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.close();
	}
	@Test
	void test1()
	{
		driver.get("https://www.google.com");
	}
	@Test
	void test2()
	{
		driver.get("https://www.facebook.com");
	}
	@Test
	void test3()
	{
		driver.get("https://www.instagram.com");
	}
	@Test
	void test4()
	{
		driver.get("https://www.x.com");
	}
	@Test
	void test5()
	{
		driver.get("https://www.redmine.org");
	}

}
