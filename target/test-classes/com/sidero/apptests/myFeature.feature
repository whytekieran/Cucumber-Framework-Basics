Feature: Testing of the Cucumber framework

  Scenario: First Test
    Given I navigated to the zoo website
    When I click on the adoption link
    Then I check to see that no animals are available
