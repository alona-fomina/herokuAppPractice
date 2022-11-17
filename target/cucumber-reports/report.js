$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/heroku.feature");
formatter.feature({
  "name": "HerokuApp",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to \"http://the-internet.herokuapp.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "BaseSteps.userNavigatesTo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "HoverOver check",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@HoverOver"
    }
  ]
});
formatter.step({
  "name": "user clicks on \"Hovers\" linkText",
  "keyword": "Then "
});
formatter.match({
  "location": "HerokuSteps.userClicksOnLinkText(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates view profile link and names are not displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "HerokuSteps.userValidatesViewProfileLinkAndNamesAreNotDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user hover over image and validates link and text",
  "keyword": "And "
});
formatter.match({
  "location": "HerokuSteps.userHoverOverImageAndValidatesLinkAndText()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});