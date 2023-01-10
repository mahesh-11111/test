package Mahesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/praka/OneDrive/Desktop/Assignment1.html");
		Thread.sleep(3000);
		
		driver.findElement(By.id("x2")).clear();
		driver.findElement(By.id("x2")).sendKeys("xyz");
		driver.findElement(By.id("x3")).click();
		
		driver.close();
		
		
	}

}
