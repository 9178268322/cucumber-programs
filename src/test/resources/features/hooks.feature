Feature: hooks feature

  Scenario: test hooks scenario
    Given base url
    When click login button
    Then redirect into profile page

  Scenario: test hooks scenario1
    Given base url
    When click login button
    Then redirect into profile page

  Scenario Outline: test hooks scenario outline
    Given <start> cucumbers
    When eat <eat> cucumbers
    Then <left> cucumbers left
    Examples:
      | start | eat | left |
      | 4     | 2   | 2    |