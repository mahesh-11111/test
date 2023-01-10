package Mahesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetText_script {
	public static void main(String[] args) throws InterruptedException  {


		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		
	    driver.get("https://www.facebook.com/");
	    Thread.sleep(2000);
	    
	    WebElement ele = driver.findElement(By.name("login"));
	    String text = ele.getText();
	    System.out.println(text);
	}
}
