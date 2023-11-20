package testngfeatures;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Testng_4_skip_ignore_disabled {
 
	WebDriver driver;
	
	  @Test(priority=2)
	  
	  public void google () {
		  
		  driver.get("https://www.google.com/");
	  }
	  
	@Test(priority=0)
	  
	  public void selenium () {
		  
		  driver.get("https://www.selenium.dev/");
	  }

	@Test(priority=1)

	public void gmail () {
		  
		  driver.get("https://gmail.com/");
	}

	@Test(priority=4,enabled=false)

	public void facebook () {
		  
		  driver.get("https://www.facebook.com/");
	}

	@Test(enabled=false,priority=5)

	public void twitter () {
		  
		  driver.get("https:www.twitter.com/");
	}

	  @BeforeTest
	  public void beforeTest() {
		  
		  driver = new ChromeDriver();
	  }

	  @AfterTest
	  public void afterTest() {
		  
		  driver.quit();
	  }

	}
