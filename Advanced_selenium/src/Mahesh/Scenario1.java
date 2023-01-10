package Mahesh;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario1 {
	public static void main(String[] args) throws InterruptedException  {


		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		
	    driver.get("file:///C:/Users/praka/OneDrive/Desktop/ScriptKeys.html");
	    WebElement ele=driver.findElement(By.xpath("//input[@value='abc']"));
	    Thread.sleep(2000);
        ele.sendKeys(Keys.CONTROL+"ac");
//	    ele.sendKeys(Keys.CONTROL+"a",Keys.CONTROL+"c");
	    Thread.sleep(2000);
    
	    WebElement ele1=driver.findElement(By.xpath("//input[@value='xyz']"));
	    Thread.sleep(2000);
	    ele1.sendKeys(Keys.CONTROL+"a");
	    Thread.sleep(2000);
	    ele1.sendKeys(Keys.DELETE,Keys.CONTROL+"v");
	    
	    boolean b = ele1.isDisplayed();
	    if(b)
	    {
	    	System.out.println("text is displayed");
	    }
	    else
	    {
	    	System.out.println("text is not displayed");
	    }
	    
	    boolean b1=ele1.isEnabled();
	    if(b1)
	    {
	    	System.out.println("textfield is enabled");
	    }else
	    {
	    	System.out.println("textfield is disabled");
	    }
	    
	}
}
