package Mahesh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_facebook_script {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		TreeSet<String> t = new TreeSet<String>(Collections.reverseOrder());
		
// Day Dropdown-> no of count		
		driver.get("https://www.facebook.com/r.php");
		WebElement ele = driver.findElement(By.xpath("//select[@id='day']"));
	    Select s = new Select(ele);
	    List<WebElement> options = s.getOptions();
	    int size = options.size();
	    System.out.println(size);
	    Thread.sleep(2000);
	    
// Month dropdown-> reverse order	    
	    WebElement ele1 = driver.findElement(By.xpath("//select[@id='month']"));
	    Select s1 = new Select(ele1);
	    List<WebElement> options2 = s1.getOptions();
	    for(WebElement option:options2)
	    {
	    	String text = option.getText();
	    	t.add(text);
	    }
	   
	    for(String o:t)
	    {
	    	System.out.println(o);
	    }
	    
// Year dropdown-> no of count	    
	    WebElement ele2 = driver.findElement(By.xpath("//select[@id='year']"));
	    Select s2 = new Select(ele2);
	    List<WebElement> options3 = s2.getOptions();
	    int size2 = options3.size();
	    System.out.println(size2);
	    
	    
}
}