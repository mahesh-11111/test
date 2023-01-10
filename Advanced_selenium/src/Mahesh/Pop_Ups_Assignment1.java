package Mahesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Pop_Ups_Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.redbus.in");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[.='FROM']")).sendKeys("Banglore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[.='TO']")).sendKeys("Mysore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[.='Date']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[.='21']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Search Buses']")).click();
		
		

	}

}
