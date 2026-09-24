Feature: Calculator

  Scenario: Open Calculator
    Given I open the calculator
    Then I should see "0"

  Scenario: Enter number
    Given I open the calculator
    When I enter "53"
    Then I should see "53"