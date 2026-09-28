Feature: Calculator input

  Scenario: Enter integer number
    When I enter "53"
    Then I should see "53"
    And I should see "53" in the operation string

  Scenario: Enter decimal number
    When I enter "53.52"
    Then I should see "53.52"
    And I should see "53.52" in the operation string

  Scenario: Enter second decimal point
    Given I enter "53.52"
    When I click "." button
    Then I should see "53.52"
    And I should see "53.52" in the operation string