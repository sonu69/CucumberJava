Feature: Login Admin Functionality

  Scenario: In order to validate success login
    Given user is on login page
    When user enter valid username and password
    And user enter Login button
    Then Success alert message will be displayed

  Scenario: In order to validate Fail login
    Given user is on login pages
    When user enter invalid username and invalid password
    And user enter Login button
    Then Error alert message will be displayed
