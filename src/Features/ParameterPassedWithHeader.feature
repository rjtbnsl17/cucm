Feature: Login with MyAccount 
	Description : This feature will pass the parameter

Scenario: Login With valid username and password 
	Given open with the Browser 
	When Enter to the URL "http://practice.automationtesting.in/"
	And Click my Account 
	And Enter on the Username  and Password 
	|username|password|
	|rajatbansal|Rajat@123|
	And Click On the loginPage 
	Then User is Getting the Error 