$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/TestCase.feature");
formatter.feature({
  "name": "To Test the Flight Management Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To Test the Login Function of Flight Management Admin",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "To launch the browser and Navigate to the Url",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepdefinitions.FlightManagementAdminLoginSteps.to_launch_the_browser_and_Navigate_to_the_Url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Enter Username and Password",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepdefinitions.FlightManagementAdminLoginSteps.to_Enter_Username_and_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Click the Submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.FlightManagementAdminLoginSteps.to_Click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Take the Screenshot and the Title",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.FlightManagementAdminLoginSteps.to_Take_the_Screenshot_and_the_Title()"
});
formatter.result({
  "status": "passed"
});
});