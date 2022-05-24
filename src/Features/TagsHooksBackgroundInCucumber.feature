Feature: Tag in cucumber


Background: Check the background 
Given It will alwaz excetue before all scenarios


@SanityTest @End2End
Scenario: Login to website
Given Login with valid credential

@SanityTest
Scenario: Logout from website
Given Logout with valid credential


@SanityTest @End2End
Scenario: To Do sanity testing
Given All the testcases

@RegressionTest 
Scenario: To Do regression Testing
Given all the new testcases


@RegressionTest @End2End
Scenario: verify prepaid recharge
Given this is prepaid test


@End2End
Scenario: Verify postpaid recharge
Given this is postpaid test
