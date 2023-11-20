package sikulitutorial;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class Desktopautomation {
	
	Screen s=new Screen();
	
  @Test
  public void desktopautomation() throws FindFailed, InterruptedException {
	  
	 /*s.click("E:\\LIB\\Sikuli//startbutton.PNG");
	 Thread.sleep(3000);
	 s.click("E:\\LIB\\Sikuli//wifi.PNG");
	 Thread.sleep(4000);
	 s.dragDrop("E:\\LIB\\Sikuli//output.PNG","E:\\LIB\\Sikuli//nav.PNG");
	 Thread.sleep(5000);*/
	 s.doubleClick("E:\\Password123.txt");
  }
}
