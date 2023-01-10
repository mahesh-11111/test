package Mahesh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkboxes {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/praka/OneDrive/Desktop/checkboxes123.html");
		Thread.sleep(2000);
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
//ascending checked
		int size = checkbox.size();
		for(int i=0;i<size;i++)
		{
			WebElement ele = checkbox.get(i);
			ele.click();
			Thread.sleep(2000);
		}
		
//descending uncheck
		for(int i=size-1;i>=0;i--)
		{
			WebElement ele = checkbox.get(i);
			ele.click();
			Thread.sleep(2000);
		}

}
}