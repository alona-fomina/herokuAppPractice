Feature: Heroku

  Background:
    Given user navigates to "http://the-internet.herokuapp.com/"

  @BrokenImage
  Scenario: Broken Image validation
    Then user clicks on "Broken Images" link
    And user should see an images

  @HoverOver
  Scenario: HoverOver
    Then user clicks on "Hovers" link
    Then user validates view profile links and names are not displayed
    And user hovers over images and validates texts and links