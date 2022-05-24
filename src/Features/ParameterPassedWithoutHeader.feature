Feature: Login with MyAccount 
	Description : This feature will pass the parameter

Scenario: Login With valid username and password 
	Given open with browser 
	When Enter the url "http://practice.automationtesting.in/"
	And Click on my Account 
	And Enter the Username  and password 
	|rajatbansal|Rajat@123|
	And Click on loginPage 
	Then User is getting Error 