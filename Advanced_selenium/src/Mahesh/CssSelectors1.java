package Mahesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors1 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("prakashrpj98@gmail.com");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("Prakshr");
		driver.findElement(By.cssSelector("button[name='login']")).click();
		
		
	//	driver.findElement(By.cssSelector("input#email")).sendKeys("prakashuiur@gmail.com");
	//	driver.findElement(By.cssSelector("input#pass")).sendKeys("Prakash");
	//	driver.findElement(By.cssSelector("button[name='login']")).click();
		
		driver.close();
		
}
}
