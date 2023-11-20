package locators;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class WebElements {
	
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@Disabled

	@Test
	void hyd() throws InterruptedException {
		
	driver.get("http://hyderabadreport.com/user");
	Thread.sleep(2000);
	driver.findElement(By.id("edit-name")).sendKeys("navya");
	Thread.sleep(3000);
	driver.findElement(By.name("pass")).sendKeys("Navi@1234");
	Thread.sleep(2000);
	//driver.findElement(By.className("form-submit")).click();
	//driver.findElement(By.cssSelector("input.form-submit")).click();
	driver.findElement(By.cssSelector(".form-submit")).click();
	}
	
	@Disabled
	@Test
	void redmine() throws InterruptedException {
		
	driver.get("http://redmine.org/");
	Thread.sleep(2000);
	driver.findElement(By.id("username")).sendKeys("navi");
	Thread.sleep(3000);
	driver.findElement(By.name("password")).sendKeys("Navi@12345");
	Thread.sleep(2000);
	driver.findElement(By.className("login")).click();
	driver.findElement(By.cssSelector("a.login")).click();
	//driver.findElement(By.cssSelector(".login")).click();
	
	}
	@Disabled
	@Test
	void linkpartial() throws InterruptedException {
	driver.get("http://hyderabadreport.com/user");
	Thread.sleep(2000);
	WebElement p = driver.findElement(By.linkText("Photos"));
	p.click();
	                 //  (or)
	/*driver.findElement(By.linkText("Photos")).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Telangana")).click();
	Thread.sleep(3000);
	driver.findElement(By.partialLinkText("Greater")).click();*/
	}

	@Disabled
	@Test
	void tagname() throws InterruptedException {
	driver.get("https://google.com/");
	Thread.sleep(2000);
	List<WebElement> totalnumoflinks=driver.findElements(By.tagName("a"));
	//System.out.println(totalnumoflinks.size());
	System.out.println("total num of links in Google: " +totalnumoflinks.size());
	
	}
	@Disabled
	@Test
	void tagname1() throws InterruptedException {
		driver.get("https://www.ndtv.com/");
		Thread.sleep(2000);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		//System.out.println(links.size());
		System.out.println("total num of links in NDTV: " +links.size());
		
	}
	
	@Test
	void xpath() throws InterruptedException {
		driver.get("https://www.redmine.org/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/span[3]/ul/li[1]/a")).click();
	}
	
	
}
