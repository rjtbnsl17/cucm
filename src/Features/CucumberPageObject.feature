Feature: Advanced Cumcumber framework

Scenario: Successfully login wih valid credentials
Given Launch the browser
When Enter the URL "https://admin-demo.nopcommerce.com/login"
And User enter the email "admin@yourstore.com" and password "admin"
And Click on login
Then Page title should be "Dashboard / nopCommerce administration"
And click on logout
Then Page title should be "Your store. Login"