package new_mahesh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Sample
{
@Test
public void test() throws InterruptedException
{
System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.get("http://localhost/login.do");
Pom1 P = new Pom1(driver);
P.button();
Thread.sleep(2000);
driver.navigate().refresh();
Thread.sleep(2000);
P.button();





}
}

