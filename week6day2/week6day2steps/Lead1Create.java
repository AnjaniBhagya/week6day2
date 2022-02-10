package week6day2steps;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Lead1Create extends Base
{
	
@When("Click LoginCredentials")
public void clickOnLoginCredentials()
{
	driver.findElement(By.linkText("Leads")).click();
	
}
@Then("Click Leads and  CreateLeads")
public void clickLeadsAndCreateLeads()
{
		
	driver.findElement(By.linkText("Create Lead")).click();
}
@Given("Enter CompanyName1")
public void enterCompanyName()
{
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
}
@Given("Enter FirstName1")
public void enterFirstName() 
{
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
}
@Given("Enter lastName1")
public void enterLastName() 
{
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
}
@When("Click on Submit Button1")
public void clickOnSubmitButton()
{
	driver.findElement(By.name("submitButton")).click();
}
@Then("Lead is Created1")
public void leadIsCreated()
{
  String title = driver.getTitle();
  System.out.println(title);
  String expectedTitle ="View Lead | opentaps CRM";
  //Learn SoftAssert
  SoftAssert sAssert = new SoftAssert();
  String expectedTitleSoft ="Hello ", titleSoft="Hello";  
  sAssert.assertEquals(titleSoft, expectedTitleSoft);
  System.out.println("Soft Assert Used");
  //Learn Hard Assert
  Assert.assertEquals(title, expectedTitle);
  System.out.println("Title Matches");
  sAssert.assertAll();
}

}
