package mavenPkg;


import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class NewTest {

	@Test
	public void EnvironmentSetup() throws IOException
	{ 	
		/*ChromeOptions options = new ChromeOptions();
		options.setBinary("C:/Users/Prince/AppData/Local/Google/Chrome/Application/chrome.exe");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options); */
		//ChromeDriver driver = new ChromeDriver(capabilities);
		
		File file = new File("C:\\Users\\Prince\\workspace\\MavenTest\\WebDriver\\chromedriver.exe"); 
	  	System.setProperty("webdriver.chrome.driver",file.getAbsolutePath());		
	  	ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String Title=driver.getTitle();
		if (Title.contains("Google")){
			System.out.println("Verified Title Successfully");
			driver.close();
			driver.quit();
		}
		
		
	}
    
}
