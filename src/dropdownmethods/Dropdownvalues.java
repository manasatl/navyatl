package dropdownmethods;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Dropdownvalues {
	
	WebDriver driver;
	
  @Test
  public void Dropdown() throws InterruptedException {
	  
	  driver.get("http://baalabharathi.com/upload-story/");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"text-13263966988\"]")).sendKeys("navya");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"text-241482569216\"]")).sendKeys("sri");
	  Thread.sleep(3000);
	  //new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByVisibleText("United States (US)");
	  //new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByValue("JP");
	 // new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByIndex(3);
	  
	  Select country=new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]")));
	  country.selectByVisibleText("Australia");
  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  
	 
  }

}
