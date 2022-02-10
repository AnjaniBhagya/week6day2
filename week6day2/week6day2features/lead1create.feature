Feature: Create Lead fuctionality

Scenario: TC_LC001 Create Lead1 - Positive 

When Click LoginCredentials 
Then Click Leads and  CreateLeads
Given Enter CompanyName1
Given Enter FirstName1
Given Enter lastName1
When Click on Submit Button1
Then Lead is Created1