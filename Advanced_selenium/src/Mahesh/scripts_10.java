package Mahesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scripts_10 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/praka/OneDrive/Desktop/textfield.html");
		WebElement ele=driver.findElement(By.id("x1"));
		ele.sendKeys("abc");
		
	//	driver.findElement(By.id("x1")).sendKeys("abc");
		
	}
}
