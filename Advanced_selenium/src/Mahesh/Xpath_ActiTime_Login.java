package Mahesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_ActiTime_Login {
	public static void main(String[] args) throws InterruptedException  {


		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		
	    driver.get("http://localhost/login.do");
	    driver.findElement(By.id("username")).sendKeys("admin");
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    driver.findElement(By.xpath("//div[.='Login ']")).click();
	    
	    String title=driver.getTitle();
	    if(title.equals("actiTIME - Enter Time-Track"))
	    {
	    	System.out.println("TC is Pass");
	    }
	    else
	    {
	    	System.out.println("TC is Fail");
	    }
	   /* 
	   String url=driver.getCurrentUrl();
	   if(url.equals("https"))
	   {
		   System.out.println("Test case is pass");
	   }
	   else
	   {
		   System.out.println("Test case is fail");
	   }
	   
	   String Title=driver.getTitle();
	   if(Title.contains("actiTIME"))
	   {
		   System.out.println("Test case is Pass");
	   }
	   else
	   {
		   System.out.println("test case is fail");
	   } */
		
	}
}
