package testngfeatures;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Testng_9_groups {
	
	WebDriver driver;
	
  @Test(groups="search")
  
  public void google () {
	  
	  driver.get("https://www.google.com/");
  }
  
@Test(groups="technology")
  
  public void selenium () {
	  
	  driver.get("https://www.selenium.dev/");
  }

@Test(groups="technology")

public void gmail () {
	  
	  driver.get("https://gmail.com/");
}

@Test(groups="social media")

public void facebook () {
	  
	  driver.get("https://www.facebook.com/");
}

@Test(groups="social media")

public void twitter () {
	  
	  driver.get("https://twitter.com/");
}

@Test(groups="food")

public void Zomato () {
	  
	  driver.get("https://www.Zomato.com");
}

@Test(groups="technology")

public void redmine () {
	  
	  driver.get("https://www.redmine.org");
}


@Test(groups="food")

public void swiggy () {
	  
	  driver.get("https://www.swiggy.com");
}

  @BeforeTest(groups="technology")
  public void beforeTest() {
	  
	  driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.quit();
  }

}
