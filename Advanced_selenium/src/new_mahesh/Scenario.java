package new_mahesh;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//img[@alt='Sponsored Ad - Apple iPhone 14 128GB (Product) RED']")).click();
		Thread.sleep(4000);
		
		Set<String> handles=driver.getWindowHandles();
		Iterator it = handles.iterator();
		String parent_id=(String)it.next();
		Thread.sleep(2000);
		String child_id=(String)it.next();
	// switch to parent to child browser	
		driver.switchTo().window(child_id);

		WebElement ele = driver.findElement(By.xpath("//span[@class=\"a-price-whole\"][1]"));
		String text = ele.getText();
		System.out.println(text);
	}
}
