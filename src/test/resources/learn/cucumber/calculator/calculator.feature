Feature: Calculator

  Scenario: Open Calculator
    Given I open the calculator
    Then I should see "0"
    And I should see "nothing" in the operation string