$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/heroku.feature");
formatter.feature({
  "name": "Heroku",
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
  "name": "HoverOver",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@HoverOver"
    }
  ]
});
formatter.step({
  "name": "user clicks on \"Hovers\" link",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user validates view profile links and names are not displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "HerokuSteps.userValidatesViewProfileLinksAndNamesAreNotDisplayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user hovers over images and validates texts and links",
  "keyword": "And "
});
formatter.match({
  "location": "HerokuSteps.userHoversOverImagesAndValidatesTextsAndLinks()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});