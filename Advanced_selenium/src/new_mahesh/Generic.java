package new_mahesh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic 
{
	WebDriver driver;
@BeforeMethod
public void openapp()
{
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
  driver = new FirefoxDriver();
	
	
}
@AfterMethod
public void closeapp() throws InterruptedException
{
	Thread.sleep(2000);
	driver.quit();
}



}


