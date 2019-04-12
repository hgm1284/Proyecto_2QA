package Test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class BaseTest {
	
	WebDriver driver ;
	
	@Before
	public void SetDriver() {
		
		System.setProperty( "webdriver.chrome.driver",  "./src/test/java/Driver/chromedriver.exe" );
	    driver = new ChromeDriver();		
			}		
			}
	    
      
	
	
	
