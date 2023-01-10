package Mahesh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ForEach_links {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/praka/OneDrive/Desktop/Links123_forEachLoop.html");
		List<WebElement> Links = driver.findElements(By.xpath("//a"));
		int size = Links.size();
		System.out.println(size);
		
		for(int i=0;i<size;i++)
		{
			WebElement eles = Links.get(i);
			String urls = eles.getAttribute("href");
			System.out.println(urls);
		}
		

	}

}
