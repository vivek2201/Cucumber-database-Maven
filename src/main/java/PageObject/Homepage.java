package PageObject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ObjectDirectory.Base;

public class Homepage {
	
	@FindBy(xpath="//h1[text()='PAGE OBJECT MODEL']")
	static
	WebElement PageObjectModelLink;
	
	@FindBy(xpath="//h1[text()='LOGIN PORTAL']")
	static
	WebElement Loginportal;
	
	public WebDriver driver=null;
	
	
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
public void clickOnPageObjectModelLink()
{

		PageObjectModelLink.click();
		
		
}

public void SwitchToChildWindow()
{
	Set <String> ids=Base.driver.getWindowHandles();
	Iterator<String> it=ids.iterator();
	String ParentWindow=it.next();
	String ChildWindow=it.next();
	Base.driver.switchTo().window(ChildWindow);
	System.out.println(Base.driver.getTitle());
}

public void SwitchToParentWindow()
{

	Set <String> ids=Base.driver.getWindowHandles();
	Iterator<String> it=ids.iterator();
	String ParentWindow=it.next();
	Base.driver.switchTo().window(ParentWindow);
	System.out.println(Base.driver.getTitle());
}

public void clickOnLoginPortal()
{
	Loginportal.click();
}
	
	

}
