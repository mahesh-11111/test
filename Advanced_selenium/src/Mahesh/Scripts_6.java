package Mahesh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Scripts_6 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","./softwares/msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	Thread.sleep(2000);
	
	driver.get("https://www.amazon.com");
	
	String Title=driver.getTitle();
	System.out.println(Title);
	
	String URL=driver.getCurrentUrl();
	System.out.println(URL);
	
	String SRC=driver.getPageSource();
	System.out.println(SRC);
	
	driver.close();
}
}
