package Mahesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathDemo1 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/praka/OneDrive/Desktop/Xpath-demo1.html");
		
		driver.findElement(By.xpath("html/body/div[1]/input[1]")).sendKeys("ABC");
		
		driver.close();
}
}
