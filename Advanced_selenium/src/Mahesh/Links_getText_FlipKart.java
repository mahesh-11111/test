package Mahesh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links_getText_FlipKart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int size = links.size();
		System.out.println(size);
		
		// Ascending order
		  for(int i=0;i<size;i++) 
		  {
			 WebElement eles = links.get(i); 
			 String text =eles.getText(); 
			 System.out.println(text); 
		  }
		//descending order
		for(int i=size-1;i>=0;i--)
		{
			WebElement eles = links.get(i);
			String text = eles.getText();
			System.out.println(text);
		}
		
}
}