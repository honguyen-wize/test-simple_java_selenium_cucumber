Feature: Test True HomePage feature
  Background:
    Given I launch the page
    And I open the true home page

  @true
  Scenario: I check Entertainment default section UI shows as API
    When I get the DaraBaseShelf WS
    And I get the DaraBaseShelf from UI home page dara shelf
    Then I see the DaraBaseShelf WS is equal to DaraBaseShelf UI


