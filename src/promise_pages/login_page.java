package promise_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {

WebDriver driver;
	
	public login_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(id="txtUsername")
	private
	WebElement userid;
	
	
	@FindBy(xpath="*//[@name='txtPassword']")
	private WebElement password;

	@FindBy(css="[name='submit1']")
	private WebElement login_button;
	
	
	public void senddata(String name)
	{
		userid.sendKeys(name);
	}
	
	
	public void click_login()
	{
		login_button.click();
	}
	
	public  WebElement login_btn()
	{
		return login_button;
	}
	
	
}
