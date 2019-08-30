package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ObjectDirectory.Base;

public class PageObjectPage {
	
	@FindBy(xpath="//b[text()='Find Out More!']")
	static
	WebElement FindOutMoreButton;
	
	@FindBy(xpath="//button[text()='Close']")
	static
	WebElement AlterCloseButton;
	
		
	public WebDriver driver=null;

	
	public PageObjectPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnFindOutMoreButton() 
	{
		
		
		FindOutMoreButton.click();
	}
	
	public void clickOnCloseButton()
	{

		WebDriverWait wait=new WebDriverWait(Base.driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Close']")));
		AlterCloseButton.click();
	}
	
	

}
