package Mahesh;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_3 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		WebElement ele = driver.findElement(By.xpath("//a[.='à²•à²¨à³�à²¨à²¡']"));
		Point loc = ele.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(2000);
		
		Actions a = new Actions(driver);  // To perform right click action
		a.contextClick(ele).perform();
		Thread.sleep(2000);
		
		Robot r = new Robot();		// to perform new window
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(2000);
		
		driver.quit();
	}

}
