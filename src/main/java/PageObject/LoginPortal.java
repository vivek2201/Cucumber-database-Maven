package PageObject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPortal {
	@FindBy(xpath="//input[@placeholder='Username']")
	static
	WebElement Username;
	@FindBy(xpath="//input[@placeholder='Password']")
	static
	WebElement Password;
	
	public WebDriver driver=null;
	
	public LoginPortal(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void enterUsernameAndPassword() throws SQLException
	{
		
		 String connectionURL="jdbc:mysql://localhost:3306/qadb?autoReconnect=true&useSSL=false";// autoReconnect=true is using because mySQL connect is abort automatically
			Connection con=DriverManager.getConnection(connectionURL, "root", "revolutionit.com.au");
			Statement s=con.createStatement();
			ResultSet rs=s.executeQuery("select * from employeeinfo;");
			rs.next();
			
			//intergration the database with selenium code
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\PriyaS\\eclipse-workspace\\databasetesting\\Driver\\chromedriver.exe");
			//WebDriver driver=new ChromeDriver();
			//driver.get("https://login.salesforce.com");
			Username.click();
			
			Username.sendKeys(rs.getString("name"));//sending the username through the database
			Password.click();
			Password.sendKeys(rs.getString("id"));//sending the password through database
			
			//System.out.println(rs.getString("id"));
			//System.out.println(rs.getString("name"));
			//System.out.println(rs.getString("age"));
			con.close();
			
	
}
}
