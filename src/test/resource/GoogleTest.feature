Feature: To test the search feature of google

  Background: 
    Given I am on the google site

  Scenario: Check the search feature
    When I type "DOU" on search field
    Then I check that search result isnt empty