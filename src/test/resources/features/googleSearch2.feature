Feature: Test2

  Scenario: User is performing a search
    Given User is on a search page
    When User inputs the "searchInput" in the search box
    Then user should see the search result for "searchInput"