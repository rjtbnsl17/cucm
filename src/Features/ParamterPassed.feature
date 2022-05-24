Feature: Login with MyAccount 
	Description : This feature will pass the parameter

Scenario: Login With valid username and password 
	Given open browser 
	When enter the Url "http://practice.automationtesting.in/"
	And click on my account 
	And enter the username "rajatbansal1" and password "Rajat@123" 
	And click on LoginPage 
	Then user is getting error 
