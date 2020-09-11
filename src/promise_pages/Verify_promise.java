package promise_pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Verify_promise {
	
	public WebDriver driver;


	public Verify_promise(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(id="cboEmp ")
	private
	WebElement Promisor;
	
	
	
	@FindBy(xpath ="\"\\r\\n\" + \r\n" + 
			"			\"/html/body/table/tbody/tr[6]/td/table/tbody/tr[6]/td/table/tbody/tr/td/table/tbody/tr")
	
	private WebElement promise_col;
	
	
	

	public WebElement Promisor()
	{
		
		return Promisor;
		
		
	}
	
	public List<WebElement> all_promise_col()
	{
		
		return (List<WebElement>) promise_col;
		
		
	}
	
	public Dimension size_all_promise_col()
	{
		return promise_col.getSize();
		
	}
	
}