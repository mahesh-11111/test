package Mahesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathMaps_TC1 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
        Thread.sleep(2000);
		driver.get("https://www.google.com/maps");
		driver.findElement(By.xpath("//button[@id='hArJGc']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("bangalore");
		driver.findElement(By.xpath("//input[@placeholder='Choose destination...']")).sendKeys("Mysore");
		driver.findElement(By.xpath("//button[@class='mL3xi']")).click();

	}
}
