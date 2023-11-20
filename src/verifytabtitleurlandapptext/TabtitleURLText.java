package verifytabtitleurlandapptext;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class TabtitleURLText {
	
	WebDriver driver;
	
  @Test(enabled=false)
  
  public void verifytabtitle() {
	  
	  driver.get("https://www.google.com/");
	  
	  String expectedtabtitle="Google";
	  
	  System.out.println("expected google tab title is :" +expectedtabtitle);
	  
	  String actualtabtitle=driver.getTitle();
	  
	  System.out.println("actual google tab title is :" +actualtabtitle);
	  
	 Assert.assertEquals(actualtabtitle, expectedtabtitle) ; 
	  
  }
  
  @Test(enabled=false)
  public void verifyURL() {
	  
	  driver.get("https://www.google.com/");
	  
	  String expectedURL="https://www.google.com/";
	  
	  System.out.println("expected google URL is :" +expectedURL);
	  
	  String actualURL=driver.getCurrentUrl();
	  
	  System.out.println("actual google URL is :" +actualURL);
	  
	 Assert.assertEquals(actualURL, expectedURL) ;   
  }
  
  @Test
  public void verifyApplicationText() {
	  
	  driver.get("https://www.google.com/");
	  
	  String expectedTEXT="Images";
	  
	  System.out.println("expected google Text is :" +expectedTEXT);
	  
	  String actualText=driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[2]/a")).getText();
	  
	  System.out.println("actual google Text is :" +actualText);
	  
	 Assert.assertEquals(actualText, expectedTEXT) ; 
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	  
	  
  }

}
