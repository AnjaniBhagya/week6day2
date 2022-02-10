package week6day2steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Lead1Tags extends Base
{ public String leadID;
	//Create Lead

	@When("Click on Leads followed by CreateLeads")
	public void clickOnLeadsFollowedByCreateLeads() 
	{
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@Given("Enter details")
	public void enterDetails()
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
	}
	@When("Click on Submit details")
	public void clickOnSubmitDetails()
	{
		driver.findElement(By.name("submitButton")).click();
	}
	@Then("Verify Lead created")
	public void verifyLeadCreated() 
	{
		String title = driver.getTitle();
		  System.out.println(title);
	}


	//Delete Lead


	@When("Click on Leads followed By FindLeads")
	public void clickOnLeadsFollowedByFindLeads()
	{
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@Given("Enter searchName and Click Find")
	public void enterSearchNameAndClickFind() throws InterruptedException
	{
		 driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Hari");
		 driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
		    Thread.sleep(2000);
	}
	@When("Click on displayed LeadID")
	public void clickOnDisplayedLeadID()
	{
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	@Then("Click on  Delete and Verify")
	public void clickOnDeleteAndVerify()
	{
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = driver.findElement(By.xpath("//div[contains(text(),'No records')]")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text Matches");
		} else {
			System.out.println("Text is not matched");
		}
	}

}
