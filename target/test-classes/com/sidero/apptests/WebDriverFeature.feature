Feature: To test contact form works when there are no errors

  Scenario: Check form is validated when there are no errors
    Given I am on the zoo website
    When I click the contact link
    And populate the contact form
    Then I should be on the contact confirmation page
