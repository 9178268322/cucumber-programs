Feature: Freecrm home page feature

  Scenario: Test user home page
    Given the freecrm url
    When user click the login button
    Then verify contacts deals and tasks
    * verify deals
    * verify tasks
