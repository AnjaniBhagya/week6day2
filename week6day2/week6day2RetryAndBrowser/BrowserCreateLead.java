package week6day2RetryAndBrowser;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BrowserCreateLead extends BrowserBase
{
	@BeforeClass
	public void setUp() {
		filename = "Clead";
	}	
	
	@Test(dataProvider = "fetchData")
	public void browsercreatelead(String cname,String fname,String lname) throws InterruptedException
	{
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.name("submitButton")).click();
	}
}
