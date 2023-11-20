 
package seleniumdemo;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowers {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
	
		 driver =new ChromeDriver();
		 Thread.sleep(3000);
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 driver.manage().window().minimize();
		 
		 driver = new EdgeDriver();	
		
	    driver = new FirefoxDriver();
		
	 Thread.sleep(3000);
	 driver.manage().window().maximize();
	 Thread.sleep(5000);
	 driver.manage().window().minimize();
	 
	// driver.close();
	 driver.quit();
		 
	}

}
