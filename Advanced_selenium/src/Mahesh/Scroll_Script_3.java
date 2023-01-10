package Mahesh;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scroll_Script_3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath(".='About Us'"));
		Point loc = ele.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("window.scrollBy("+x+","+y+"");
		Thread.sleep(2000);

}
}