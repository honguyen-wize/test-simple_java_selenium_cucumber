Feature: Test api key feature
  Background:
    Given I launch the page
    And I open the login page
    And I enter user name 'wizetest1@gmail.com' and password 'autotest'

  @key
  Scenario: Generate API key
    When I go to API keys page
    And I generate api name 'test api'
    Then I see the message 'API key was created successfully' on the api key page


