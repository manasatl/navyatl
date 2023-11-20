package junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Junitsecondprogram {
	
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
		driver.close();
		
	}

@Disabled //this annotation used for Junit5
	@Test
	void google() {
		driver.get("https://www.google.com/");
	}
		
@Test

void facebook() {
	
	driver.get("https://www.facebook.com/");
	
}


@Test
void selenium() {
	
	driver.get("https://www.selenium.dev");
	
}

@Test
void redmine() {
	driver.get("https://redmine.org");
	}

@Ignore //this annotation used for Junit 3 or Junit4

@Test
void twitter() {
	driver.get("https://www.twitter.com");
}

}
