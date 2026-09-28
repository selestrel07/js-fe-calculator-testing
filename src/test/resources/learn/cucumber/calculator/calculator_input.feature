Feature: Calculator input

  Scenario: Enter number
    Given I open the calculator
    When I enter "53"
    Then I should see "53"