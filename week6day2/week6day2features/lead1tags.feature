Feature: Using Tags Functionality

@Create
Scenario: Create Lead for Tags

When Click on Leads followed by CreateLeads
Given Enter details
When Click on Submit details
Then Verify Lead created

@Delete
Scenario: Delete Lead for Tags

When Click on Leads followed By FindLeads
Given Enter searchName and Click Find
When Click on displayed LeadID
Then Click on  Delete and Verify
