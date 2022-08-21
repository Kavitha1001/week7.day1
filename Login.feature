Feature: Login to the Leaftap Application



Scenario: Positive Login
Given Type the username as 'Demosalesmanager'
And Type the password as 'crmsfa'
When Click Login Button
Then Verify the Homepage is displayed

Scenario: Negative Case
Given Type the username as 'Demosalesmanager'
And Type the password as 'crmsfail'
When Click Login Button
But Error messsge is shown


