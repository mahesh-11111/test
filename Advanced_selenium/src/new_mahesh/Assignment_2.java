package new_mahesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_2 {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[.='Best Sellers']")).click();;
		driver.findElement(By.xpath("//img[@alt='American Tourister 32 Ltrs Grey Casual Backpack (AMT FIZZ SCH BAG 02 - GREY)']")).click();
		Thread.sleep(2000);
	    
		
		driver.findElement(By.id("add-to-wishlist-button-submit")).click();
}
}

	
	
	
	
	

