package Mahesh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;


public class Practice_work {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/praka/OneDrive/Desktop/sampleDrodown.html");
		WebElement ele = driver.findElement(By.id("hotel"));
		
		Select  s = new Select(ele);
		List<WebElement> options = s.getOptions();
		
		for(WebElement option:options)
		{
			String text = option.getText();
			System.out.println(text);
		}
		
		
		
	}

}
