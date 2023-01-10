package Mahesh;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_script3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
// Treeset- it is Autosorted		
		TreeSet<String> t = new TreeSet<String>();
		
		driver.get("file:///C:/Users/praka/OneDrive/Desktop/MultiSelect_script.html");
	    Thread.sleep(2000);
	    WebElement ele = driver.findElement(By.xpath("//select[@id='Hotel']"));
	    
	    Select s=new Select(ele);
	    
	    List<WebElement> options = s.getOptions();
	    for(WebElement option:options)
	    {
	    	String text = option.getText();
	    	t.add(text);
//	    	t.add(option.getText());	    
	   	}
	    
	    for(String o:t)
	    {
	    	System.out.println(o);
	    }

}
}