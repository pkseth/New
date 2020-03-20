package pkg.MavenTest;

import org.testng.annotations.Test;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@Test
public class NewTest {
  public void EnvironmentSetup() throws IOException
	{ 	
	  	
	  	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"./WebDriver/"+"chromedriver.exe");		
	  	WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String Title=driver.getTitle();
		if (Title.contains("Google")){
			System.out.println("Verified Title Successfully");
			driver.close();
			driver.quit();
		}
	}
    
}
