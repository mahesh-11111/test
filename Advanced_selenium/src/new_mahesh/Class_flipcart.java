package new_mahesh;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

public class Class_flipcart extends Generic_flipcart
{
@Test
public void test() throws InterruptedException, AWTException
{
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[.='✕']")).click();
	Thread.sleep(2000);
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ALT);
	r.keyPress(KeyEvent.VK_SPACE);
	r.keyRelease(KeyEvent.VK_ALT);
	r.keyRelease(KeyEvent.VK_SPACE);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_N);
	r.keyRelease(KeyEvent.VK_N);
	driver.manage().window().maximize();
	r.keyPress(KeyEvent.VK_ALT);
	Dimension d = new Dimension(400, 500);
	driver.manage().window().setSize(d);
	
}
}
