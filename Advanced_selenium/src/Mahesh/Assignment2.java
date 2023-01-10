package Mahesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/praka/OneDrive/Desktop/Assignment2.html");
		Thread.sleep(3000);
		
		
		driver.findElement(By.id("x1")).sendKeys("ABC");
		Thread.sleep(2000);
		driver.findElement(By.tagName("a")).click();
		
	    driver.close();
	}

}
