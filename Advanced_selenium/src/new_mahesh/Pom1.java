package new_mahesh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 
{
	//declaration
	@FindBy(xpath ="//div[.='Login ']")
	private WebElement btn;

	//Initialization
	Pom1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Utilize
	public void button()
	{
		btn.click();
	}



}
