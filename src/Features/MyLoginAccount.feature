Feature: Login with my Account 
	Description: This feature will test the login functionality

Scenario: Login with Valid username and password 
	Given Open browser 
	When Enter the Url "http://practice.automationtesting.in/" 
	And Click on my account 
	And Enter the username and password 
	And Click on LoginPage 
	Then User is getting error 
