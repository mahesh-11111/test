package Mahesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Select_script {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
	    driver.get("file:///C:/Users/praka/OneDrive/Desktop/Single_Select.html");
	    Thread.sleep(2000);
	    WebElement ele = driver.findElement(By.xpath("//select[@id='Hotel']"));
	    
	    Select s=new Select(ele);
	    Thread.sleep(2000);
	    s.selectByIndex(0);
	    Thread.sleep(2000);
	    s.selectByValue("i");
	    Thread.sleep(2000);
	    s.selectByVisibleText("Kabab");
	    Thread.sleep(2000);
	  //  s.deselectAll(); --for Single select it will through an Error java.lang.UnsupportedOperationException 
	    

}
}