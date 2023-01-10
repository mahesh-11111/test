package Mahesh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Textfileds_script {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/praka/OneDrive/Desktop/Textfileds.html");
		Thread.sleep(2000);
		List<WebElement> Textfields = driver.findElements(By.xpath("//input"));
		int size = Textfields.size();
		System.out.println(size);
		
		for(int i=0;i<size;i++)
		{
			Textfields.get(i).sendKeys("ABC");
			Thread.sleep(2000);
		}
		
		for(int i=size-1;i>=0;i--)
		{
			Textfields.get(i).clear();
		    Thread.sleep(2000);
		}
		

}
}