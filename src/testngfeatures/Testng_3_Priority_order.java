package testngfeatures;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Testng_3_Priority_order {
 
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

	@Test(priority=4)

	public void facebook () {
		  
		  driver.get("https://www.facebook.com/");
	}

	@Test(priority=5)

	public void twitter () {
		  
		  driver.get("https://twitter.com/");
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
