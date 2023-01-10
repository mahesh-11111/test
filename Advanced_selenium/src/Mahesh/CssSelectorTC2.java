package Mahesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class CssSelectorTC2 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.youtube.com");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[id='search']")).sendKeys("kgf trailer");
		driver.findElement(By.cssSelector("button[class='style-scope ytd-searchbox']")).click();
		driver.findElement(By.cssSelector("a[href='/watch?v=qXgF-iJ_ezE']")).click();
		
		driver.close();
		
		
	}

}
