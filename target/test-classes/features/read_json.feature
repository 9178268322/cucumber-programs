Feature: Read data from json

  Scenario: Test json data
    Given bank url
    When fill "Smith" details
    Then check out