package Mahesh;

import org.openqa.selenium.chrome.ChromeDriver;
public class Scripts_2 {

	public static void main(String[] args) {

		String key="webdriver.chrome.driver";
		String value="./softwares/chromedriver.exe";

		System.setProperty(key, value);

		ChromeDriver ch=new ChromeDriver();
	}


}

