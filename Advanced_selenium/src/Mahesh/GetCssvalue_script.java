package Mahesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCssvalue_script {
	public static void main(String[] args) throws InterruptedException  {


		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);

		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//img[@alt='Facebook']"));
	    String cssValue = ele.getCssValue("font-size");
	    System.out.println(cssValue);
	    
	}
}
