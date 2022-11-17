Feature: HerokuApp

  Background:
    Given user navigates to "http://the-internet.herokuapp.com/"

  @BrokenImage
  Scenario: Broken Image Validation
    Then user clicks on "Broken Images" link
    And user should be able to see an image

  @HoverOver
  Scenario: HoverOver check
    Then user clicks on "Hovers" linkText
    Then user validates view profile link and names are not displayed
    And user hover over image and validates link and text


