Feature: Calculator input

  Scenario: Enter integer number
    Given I open the calculator
    When I enter "53"
    Then I should see "53"

  Scenario: Enter decimal number
    Given I open the calculator
    When I enter "53.52"
    Then I should see "53.52"