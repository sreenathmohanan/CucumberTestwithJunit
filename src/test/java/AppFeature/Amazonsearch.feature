
Feature: Amazon Search

  Scenario: Searching crime thriller books on Amazon
    Given Log into Amazon website using my credentials having user name "Sreenath" and password "weblogic"
    When Enter key word "crime thriller" in search along with price range with in 1000 and hit enter
    Then List the search outcome and select the required book to purchase 
