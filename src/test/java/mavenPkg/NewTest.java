package mavenPkg;


import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest {

	@Test
	public void EnvironmentSetup() throws IOException
	{ 	
		File file = new File("C:/Users/Prince/workspace/MavenTest/WebDriver/chromedriver.exe"); 
	  	System.setProperty("webdriver.chrome.driver",file.getAbsolutePath());		
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
