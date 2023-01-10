package Mahesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorTC1 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("iphone");
		driver.findElement(By.cssSelector("input[value='Go']")).click();
		driver.findElement(By.cssSelector("span[class='a-size-medium a-color-base a-text-normal']")).click();
		
		driver.close();
		
		
}
}
