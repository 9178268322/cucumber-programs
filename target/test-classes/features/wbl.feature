Feature: whitebox qa login

  Scenario: whitebox qa user login
    Given the whitebox login url
    When put the login credential
    Then should get the titile