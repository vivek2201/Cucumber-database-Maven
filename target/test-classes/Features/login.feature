Feature: Application login

Scenario: Home page is default page
Given User is on login page
When user login into appliaction with username and password
Then Homepage should populated
And Close Browser
