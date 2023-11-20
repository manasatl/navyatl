package testngfeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_5_Description {
	
	WebDriver driver;
	
	  @Test(description="Top Menus Module")
	  public void RM_15() {
		 driver.findElement(By.xpath("//*[@id=\"top-menu\"]/ul/li[1]/a")).click(); 
	  }
	  
	  @Test(description="Registration Module")
	  public void RM_2() {
		 driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[2]/a")).click();
		 driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("techlearn");
		 
	  }
	  
	  @Test(description="Sign In Module")
	  public void RM_5() {
		 driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[1]/a")).click();
		 driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("techlearn");
		 
	  }
	  
	  @Test(description="Search Module")
	  public void RM_9() {
		 driver.findElement(By.xpath("//*[@id=\"q\"]")).sendKeys("Java");
		 
	  }
	  
	  @BeforeTest
	  public void beforeTest() {
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.redmine.org/");
	  }

	}
