package testngfeatures;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Testng_2_alphabiticalorder {
	
	WebDriver driver;
	
  @Test
  
  public void google () {
	  
	  driver.get("https://www.google.com/");
  }
  
@Test
  
  public void selenium () {
	  
	  driver.get("https://www.selenium.dev/");
  }

@Test

public void gmail () {
	  
	  driver.get("https://gmail.com/");
}

@Test

public void facebook () {
	  
	  driver.get("https://www.facebook.com/");
}

@Test

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
