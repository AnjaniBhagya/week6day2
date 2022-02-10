Feature: Delete Lead Functionality

Scenario: TC_DL001 Delete Lead - Positive

When Click Leads followed by FindLeads
Given Enter Firstname
When Click on FindLeads Button
Then Click On Lead displayed
When Click on Delete Button
Then Verify deletion of Lead