package alertpopuphandles;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Alertokcanclebuttons {
	
	WebDriver driver;
 
	 @Test
	  public void alertokbutton() throws InterruptedException {
		  driver.get("http://seleniumlearn.com/confirmation-dialog-box");
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
		  Thread.sleep(4000);
		  driver.switchTo().alert().accept();
	  }
	  
	  
	  @Test
	  
	  public void alertcancelbutton() throws InterruptedException {
		  driver.get("http://seleniumlearn.com/confirmation-dialog-box");
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
		  Thread.sleep(4000);
		  driver.switchTo().alert().dismiss();
		 
	  }
	  
	  
	  @Test
	  public void alertwindowsendtextokbutton() throws Exception {
		  driver.get("http://seleniumlearn.com/prompt-dialog-box");
		  Thread.sleep(7000);
		  driver.findElement(By.xpath("//*[@id=\"node-103\"]/div/div[1]/div/div/button")).click();
		  Thread.sleep(4000);
		  
		  Alert a = driver.switchTo().alert();
		  a.sendKeys("navya");
		  Thread.sleep(3000);
		  a.accept();
		  
		  
		  
		/*  driver.switchTo().alert().sendKeys("navya");
		  Thread.sleep(3000);
		  driver.switchTo().alert().accept();   */
	  }
	  
	  
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
  }

}
