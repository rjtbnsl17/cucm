Feature: Login with MyAccount 
	Description : This feature will pass the parameter

Scenario Outline: Login With valid username and password 
	Given open the browser 
	When enter the url "http://practice.automationtesting.in/"
	And click on my Account 
	And enter the Username "<username>" and password "<password>" 
	And click on loginPage 
	Then user is getting Error 
	
	
	Examples:
	|username  | password |
	|rajatbansal1 | Rajat@123 |
	|rajatbansal | Rajat@1234   |
	|rjtbnsl | Rajat@12345 |