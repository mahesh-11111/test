package Mahesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class script_Mouse_hover {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.amazon.in");
		WebElement ele = driver.findElement(By.xpath("//span[@class='nav-line-2']"));
		
		Actions a = new Actions(driver);		// Actions class
		a.moveToElement(ele).perform();
		
		
		
	}

}
