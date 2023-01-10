package Mahesh;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scripts_3 {
	public static void main(String[] args) throws InterruptedException
	{
	String key1="webdriver.edge.driver";
	String value1="./softwares/msedgedriver.exe";
	System.setProperty(key1,value1);
	FirefoxDriver fx=new FirefoxDriver();
	
	Thread.sleep(2000);
	
	String key2="webdriver.edge.driver";
	String value2="./softwares/msedgedriver.exe";
	System.setProperty(key2,value2);
	EdgeDriver ed=new EdgeDriver();

	}

}
