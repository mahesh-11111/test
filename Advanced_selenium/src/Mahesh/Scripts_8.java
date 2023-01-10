package Mahesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scripts_8 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("file:///C:/Users/praka/OneDrive/Desktop/Youtube.html");
	//	WebElement ele=driver.findElement(By.tagName("a"));
	//	ele.click();
		
		driver.findElement(By.tagName("a")).click();
		
		driver.close();
		
	}

}
