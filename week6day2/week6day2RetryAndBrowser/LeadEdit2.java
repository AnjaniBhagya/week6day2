package week6day2RetryAndBrowser;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LeadEdit2 extends Base
{
	@BeforeClass
	public void setUp() {
		filename = "Retry";
	}	
	
	@Test(dataProvider = "fetchData")
	public void leadedit(String cname,String editCname) throws InterruptedException
	{
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys(cname);
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();		
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(500);
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(editCname);
		
		driver.findElement(By.name("submitButton")).click();
	}
}
