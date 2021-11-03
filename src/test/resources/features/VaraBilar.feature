
Feature: Vara bilar funtionality

  @wip
  Scenario Outline: Displaying car types
    Given the user is on the home page
    When the user clicks on the Vara bilar function
    Then the user should see one of car type's title as "<carType>" at the left side of the page

    Examples:
      | carType      |
      | Elbilar      |
      | Hybridbilar  |
      | Övriga bilar |