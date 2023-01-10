package Mahesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scripts_9 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/praka/OneDrive/Desktop/Google.html");
		Thread.sleep(3000);
		
	//	driver.findElement(By.id("x1")).click();
	//	driver.findElement(By.name("n1")).click();
	//	driver.findElement(By.className("c1")).click();
		
		driver.findElement(By.linkText("google")).click();
	//	driver.findElement(By.partialLinkText("goo")).click();
		
		}
}
