package Mahesh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class isMulti_script {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			Thread.sleep(2000);
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/praka/OneDrive/Desktop/MultiSelect_script.html");
		    Thread.sleep(2000);
		    WebElement ele = driver.findElement(By.xpath("//select[@id='Hotel']"));
		    Select s=new Select(ele);
		    boolean multiple = s.isMultiple();
		    if(multiple)
		    {
		    	System.out.println("it is multiple select");
		    }
		    else
		    {
		    	System.out.println("it is not multiple select");
		    }
		    
		    List<WebElement> options = s.getOptions();
		    int size = options.size();
		    System.out.println(size);
	}

}
