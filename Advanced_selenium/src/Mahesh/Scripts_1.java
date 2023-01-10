package Mahesh;

import org.openqa.selenium.edge.EdgeDriver;

public class Scripts_1 {
	
	public static void main(String[] args) {
		
		String key="webdriver.edge.driver";
        String value = "./softwares/msedgedriver.exe";		
		System.setProperty(key, value);
		EdgeDriver ed = new EdgeDriver();
	}

}
