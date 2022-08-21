Feature: Create a new lead in Leaftaps Application

Background:
Given Type the username as 'Demosalesmanager'
And Type the password as 'crmsfa'
When Click Login Button
Then Verify the Homepage is displayed

Scenario Outline:Create Lead with different data
Given click on CRMSFA link
And click on Leads link
And click on Create Leads Link
When Type companyname as <companyName>
And Type the firstname as <firstName>
And Type the lastname as <lastName>
And click on Create Lead Button

Examples:
|companyName|firstName|lastName|
|Testleaf|Kavitha|S|
|Infosys|Roshini|R|
|CTS|Devi|D|
