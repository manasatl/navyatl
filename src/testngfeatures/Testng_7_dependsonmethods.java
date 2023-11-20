package testngfeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_7_dependsonmethods {
 
	WebDriver driver;
	
	  @Test(dependsOnMethods="method2")
	  public void method1() {
		  driver.findElement(By.name("q")).sendKeys("Selenium");
		  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		  driver.findElement(By.xpath("//a[normalize-space()='Images']")).click();	  
	  }
	  
	  @Test
	  public void method2() {
		  driver.get("https://www.google.com/");
		 
	  }
	  
	 
	  
	  @BeforeTest
	  public void beforeTest() {
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  
	  }

	}
