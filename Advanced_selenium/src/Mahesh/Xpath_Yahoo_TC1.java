package Mahesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Xpath_Yahoo_TC1 {

	public static void main(String[] args) throws InterruptedException  {


		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		
		driver.get("https://login.yahoo.com/?.src=search&.intl=in&.lang=en-IN&.done=https%3A%2F%2Fin.search.yahoo.com%2F%3Ffr2%3Dinr&pspid=2114723002&activity=header-signin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("Prakashrpj98@yahoo.com");
		driver.findElement(By.xpath("//input[@name='signin']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Prakshr@123");
		driver.findElement(By.xpath("//button[@name='verifyPassword']")).click();
		driver.findElement(By.xpath("//div[.='prakashrpj98']")).click();
		driver.findElement(By.xpath("//a[@id='ybarMailLink']")).click();
		driver.findElement(By.xpath("//a[.='Compose']")).click();
		driver.findElement(By.xpath("//input[@id='message-to-field']")).sendKeys("Prakashrpj98@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("Test Case Execution");
		driver.findElement(By.xpath("//span[.='Send']")).click();
		
		System.out.println("TC Pass");
	

	}

}
