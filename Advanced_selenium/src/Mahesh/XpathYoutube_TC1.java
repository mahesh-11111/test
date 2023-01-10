package Mahesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathYoutube_TC1 {
	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.youtube.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("kgf trailer");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		driver.findElement(By.xpath("//yt-formatted-string[@aria-label='KGF Trailer Hindi | Yash | Srinidhi | 21st Dec 2018 by Excel Movies 4 years ago 2 minutes, 49 seconds 78,373,157 views']")).click();
		
	}
}
