package actionclassprograms;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Demogithub {
	
	WebDriver driver;
  @Test
  public void googlesearch() {
	  driver.get("https://www.google.com/");
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
