$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/rajatbansal/eclipse-workspace/CucumberLearning/src/Features/MyLoginAccount.feature");
formatter.feature({
  "line": 1,
  "name": "Login with my Account",
  "description": "Description: This feature will test the login functionality",
  "id": "login-with-my-account",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login with Valid username and password",
  "description": "",
  "id": "login-with-my-account;login-with-valid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Enter the Url \"http://practice.automationtesting.in/\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Click on my account",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Enter the username and password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click on LoginPage",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User is getting error",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsClass.open_browser()"
});
formatter.result({
  "duration": 5633286875,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://practice.automationtesting.in/",
      "offset": 15
    }
  ],
  "location": "StepDefinitionsClass.enter_the_Url(String)"
});
formatter.result({
  "duration": 7071559250,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionsClass.click_on_my_account()"
});
formatter.result({
  "duration": 2878834792,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionsClass.enter_the_username_and_password()"
});
formatter.result({
  "duration": 1006677542,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionsClass.click_on_LoginPage()"
});
formatter.result({
  "duration": 2857204916,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionsClass.user_is_getting_error()"
});
formatter.result({
  "duration": 176327083,
  "status": "passed"
});
});