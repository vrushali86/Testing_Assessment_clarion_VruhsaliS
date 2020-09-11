package Promise_Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Document;

import UTILITIES.common_utilities;
import junit.framework.Assert;
import promise_pages.Verify_promise;
import promise_pages.add_promise_page;
import promise_pages.login_page;

public class test1 
{

	public  WebDriver driver;
	common_utilities C;
	login_page l;
	add_promise_page a;
	Verify_promise v;
		
	@BeforeTest()
	public void login_fun()
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\insurance\\chromedriver.exe");
		
		C= new common_utilities(driver);
		C.authenticate_certificate();
		driver=new ChromeDriver();
	
		 l= new login_page(driver);
		 a= new add_promise_page(driver);
		 v= new Verify_promise(driver);
		driver.get("https://sanjeetk@clariontechnologies.co.in:clarion@182.74.238.221/clarion_promise_qa/index.php");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//d.setCapability("chrome.switches", Arrays.asList("--ignore-ssl-errors=yes"));
		l.click_login();
		Assert.assertEquals("Clarion Promise", driver.getTitle());
			
	}
	
	

	@Test(priority=2)
	public void verify_promise()
	{
		C.select_element(v.Promisor(), "sonali test");
		List<WebElement> all_promise_clmn = new ArrayList<WebElement>();
		all_promise_clmn.addAll(driver.findElements(By.xpath("/html/body/table/tbody/tr[6]/td/table/tbody/tr[6]/td/table/tbody/tr/td/table/tbody/tr/td[3]")));
		for(int i=0 ; i<all_promise_clmn.size();i++) {
			String value=all_promise_clmn.get(i).getText();
			if(all_promise_clmn.get(i).equals("Enter Promise"))
			{
			Assert.assertTrue(true);	
			}
			else
			{
				Assert.assertTrue(false);	
			}
		}
				
		
	}
	
	



	@Test(priority=1)
	public void add_promise()
	{
		a.Log_Promise_link().click();
		C.select_element(a.Promise_from(),"sonali test");
		a.promise_Txtbox().sendKeys("Enter Promise");
		a.Log_promise_btn().click();
		System.out.println("promise added ");
		
	}
	
	@AfterTest
	public void logout()
	{
		a.Logout().click();
		Assert.assertTrue("logout is unsuccessful",l.login_btn().isDisplayed() );
		
	}
	
	
}
