Feature: Edit Lead in Leaftaps Application

Background:
Given Type the username as 'Demosalesmanager'
And Type the password as 'crmsfa'
When Click Login Button
Then Verify the Homepage is displayed

Scenario Outline: Edit Lead 
Given click on CRM link
And click  Leads link
And click on Find Leads link
And Type firstname as <fName>
And Click Find leads button
Then sleep 5 secs
And Click Firstresulting link
Then verify the title of the page
And click Edit link
And Change the company name <comName>
And click Update button
Then Confirm the changed name appears

Examples:
|fName|comName|
|Kavitha|Google|
|Roshini|Testleaf|
|Devi|Microsoft|




