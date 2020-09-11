package promise_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.sourceforge.htmlunit.corejs.javascript.ScriptableObject;

public class add_promise_page {

	public WebDriver driver;


	public add_promise_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(linkText="Log Promise")
	private
	WebElement Log_promise;
	
	

	@FindBy(name="cboEmp")
	private
	WebElement promise_from;
	
	
	@FindBy(linkText="LOGOUT")
	private
	WebElement Logot_button;
	
	
	@FindBy(css="txtPromise")
	private
	WebElement promise;
	
	@FindBy(xpath="//input[@value='Log Promise']")
	private
	WebElement Log_promise_button;
		
	
	public WebElement Log_Promise_link()
	{
	
		return Log_promise;
	}
	public WebElement Promise_from()
	{
		
		return promise_from;
	}
	
	public WebElement Logout()
	{
		
		return Logot_button;
	}
	
	public WebElement promise_Txtbox()
	{
		
		return promise;
	}
	
	public WebElement Log_promise_btn()
	{
		return Log_promise_button;
		
		
	}

	
	
}
