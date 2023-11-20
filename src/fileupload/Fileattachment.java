package fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileattachment {
	
	WebDriver driver;
	
  @Test
  public void attachfile() throws InterruptedException {
	  driver.get("http://baalabharathi.com/upload-story/");
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//*[@id=\"field-SUtF8PwfCXGXx46\"]")).sendKeys("naviworld");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"field-8lqEle2zeOhMu0a\"]")).sendKeys("F:\\programs//Untitled-1.cs");
  }
  
 @BeforeTest
 public void beforetest() {
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 
 
}
}