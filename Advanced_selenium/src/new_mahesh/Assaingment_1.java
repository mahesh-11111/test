package new_mahesh;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assaingment_1 {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("redmi latest mobile");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//img[@alt='Redmi Note 11T 5G (Aquamarine Blue, 6GB RAM, 128GB ROM)| Dimensity 810 5G | 33W Pro Fast Charging | Charger Included | Add...']")).click();
		Thread.sleep(4000);
		
		Set<String> handles=driver.getWindowHandles();
		Iterator it = handles.iterator();
		String parent_id=(String)it.next();
		Thread.sleep(2000);
		String child_id=(String)it.next();
	// switch to parent to child browser	
		driver.switchTo().window(child_id);
		
		driver.findElement(By.xpath("(//span[.='Add to Cart'])[1]")).click();
}
}
