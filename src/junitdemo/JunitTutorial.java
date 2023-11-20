package junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JunitTutorial {
	
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
		 driver.quit();
	}
	

	@Test
	void testcase1() {
		
		driver.get("https://www.google.com/");
	}
		
@Test
void testcase2() {
	
	driver.get("https://www.facebook.com/");
	
}


@Test
void testcase3() {
	
	driver.get("https://www.selenium.dev");
	
}

@Test
void testcase4() {
	driver.get("https://redmine.org");
}
	
}
