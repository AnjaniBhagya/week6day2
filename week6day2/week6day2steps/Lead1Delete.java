package week6day2steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Lead1Delete extends Base
{public String leadID;

@When("Click Leads followed by FindLeads")
public void clickLeadsFollowedbyFindLeads() 
{
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
}

@Given("Enter Firstname")
public void enterFirstname() 
{
   driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Hari");
   
}

@When("Click on FindLeads Button")
public void clickOnFindLeadsButton() throws InterruptedException
{
    driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
    Thread.sleep(2000);
}

@Then("Click On Lead displayed")
public void clickOnLeadDisplayed()
{
	leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
}

@When("Click on Delete Button")
public void clickOnDeleteButton()
{
	driver.findElement(By.linkText("Delete")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
}

@Then("Verify deletion of Lead")
public void verifyDeletionOfLead()
{
	String text = driver.findElement(By.xpath("//div[contains(text(),'No records')]")).getText();
	if (text.equals("No records to display")) {
		System.out.println("Text Matches");
	} else {
		System.out.println("Text is not matched");
	}
    
}

}
