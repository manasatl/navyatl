package sikulitutorial;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;

public class Sikuliwebautomation {
	WebDriver driver;
	Screen s=new Screen();
	
  @Test
  public void webautomation() throws InterruptedException, FindFailed {
	  driver.get("http://www.seleniumlearn.com/");
	  Thread.sleep(3000);
	  s.click("E:\\LIB\\Sikuli//testing.PNG");
	  Thread.sleep(5000);
	  s.type("E:\\LIB\\Sikuli//search.PNG",  "selenium");
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
