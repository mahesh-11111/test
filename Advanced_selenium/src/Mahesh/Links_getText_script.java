package Mahesh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links_getText_script {
	public static void main(String[] args) throws InterruptedException  {


		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/praka/OneDrive/Desktop/Links.html");
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		int size = links.size();
		for(int i=0;i<size;i++)
		{
			
	
			WebElement ele = links.get(i);
			String text = ele.getText();
			System.out.println(text);
		}

}
}