package UTILITIES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class common_utilities {
	
	public WebDriver driver;

	public common_utilities(WebDriver driver)
	{
		
		this.driver=driver;
		
		
	}

	private String TRUE;

	public static void authenticate_certificate()
	{
		
		DesiredCapabilities d= new DesiredCapabilities().chrome();
		d.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		d.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
	  
	}
	
	public void select_element(WebElement element,String name)
	{
		Select s= new Select (element);
		s.selectByVisibleText(name);
		
	}
	
	

}
