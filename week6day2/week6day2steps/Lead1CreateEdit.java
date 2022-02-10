package week6day2steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Lead1CreateEdit extends Base 
{

@When("CLick Leads and then FindLeads")
public void cLickLeadsAndThenFindLeads()
{
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
}
@Given("Enter TestCase FirstName")
public void enterTestCaseFirstName()
{
    driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("TestLeaf");
    
}
@When("Click on Find Button")
public void clickOnFindButton() throws InterruptedException 
{
	driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
    Thread.sleep(2000);
    
}
@Then("Click on Lead Link and then Edit")
public void clickOnLeadLinkAndThenEdit()
{
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	driver.findElement(By.linkText("Edit")).click();
}
@Given("Update CompanyName")
public void updateCompanyName()
{
	driver.findElement(By.id("updateLeadForm_companyName")).clear();
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TestLeaf Company");
}
@Then("click Update Button and verify")
public void clickUpdateButtonAndVerify()
{
	driver.findElement(By.name("submitButton")).click();
}

}
