Feature: Edit Functionality

Scenario: TC_EL001 Edit Functionality - Positive

When CLick Leads and then FindLeads
Given Enter TestCase FirstName
When Click on Find Button
Then Click on Lead Link and then Edit
Given Update CompanyName 
Then click Update Button and verify