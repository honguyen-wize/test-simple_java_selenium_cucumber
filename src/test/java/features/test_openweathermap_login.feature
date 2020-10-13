Feature: Test login feature
  Background:
    Given I launch the page
    And I open the login page

  @test
  Scenario: Users login successfully
    When I enter user name 'wizetest1@gmail.com' and password 'autotest'
    Then I see the message 'Signed in successfully.' on home page
    And I see the home page menu
    |New Products|Services|API keys|Billing plans|Payments|Block logs|My orders|My profile|

  @test
  Scenario Outline: Verify Invalid Login
    When I enter user name '<username>' and password '<password>'
    Then I see the message '<error_message>' on home page

  Examples:
    | username            | password        |error_message             |
    | invalidUsername     | autotest        |Invalid Email or password.|
    | wizetest1@gmail.com | invalidPassword |Invalid Email or password.|


