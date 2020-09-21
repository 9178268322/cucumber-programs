Feature: Beer cans
  only blog owners
  who can post to all blogs

  Background:
    Given a global administrator named "Greg"
    And a blog named "Greg's anti-tax rants"
    And a customer named "Dr. Bill"
    And a blog named "Expensive Therapy" owned by "Dr. Bill"

  Scenario: don't have given step
    When i don't know
    Then you don't know

  # This is the beer can
  Scenario: Counting beer cans
    Given I have <opening balance> beer cans
    Given I have some few
    And I have not clear
    And I have drunk <processed> beer cans
    When I go to my fridge
    Then I should have <in stock> beer cans
    But I should see something else
    But I should not see something else

   # Login page
  Scenario: login page
    Given go to login page
    When put credentials
    Then validate home page

  # This is star scenario
  Scenario: star scenario
    Given I am out shopping
    * I have eggs
    * I have milk
    * I have butter
    When I check my list
    Then I don't need anything


  Scenario Outline: eating
    Given there are <start> cucumbers
    When I eat <eat> cucumbers
    Then I should have <left> cucumbers

    Examples:
      | start | eat | left |
      |    12 |   5 |    7 |
      |    20 |   5 |   15 |

  # To avoid hard code
  Scenario: avoid hard coded value
    Given put user credentials
    When user "user1" and "password"
    Then I should see my profile

  # data table examples
  Scenario: data table
    Given the url
    When user enters username and password
    | username | password |
    Then validate profile page