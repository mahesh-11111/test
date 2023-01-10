package Mahesh;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class script_Drog_and_Drop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
	/*	WebElement src = driver.findElement(By.id("box3"));
		WebElement dst = driver.findElement(By.id("box103"));
		
		Actions a =new Actions(driver);
		a.dragAndDrop(src,dst).perform();      // drag and drop action
		
	*/
		TreeSet<String> t = new TreeSet<String>();
		WebElement src = driver.findElement(By.xpath("//div[@id='box4']/../.."));
		 Select s=new Select(src);
		 List<WebElement> options = s.getOptions();
		 for(WebElement option:options)
		 {
			 t.add(option.getText());
		 }
		 for(String o:t)
		 {
			 System.out.println(o);
		 }
		
	}

}
