Feature: Application login

  Scenario: Home page default login
  Given user is on Net banking landing page
  When user login into application with username "ranjitha"  and password "1234"
  Then Home page is displayed
  And cards are displayed "true"

  Scenario: Home page default login failure
    Given user is on Net banking landing page
    When user login into application with username "ranjitha1"  and password "1@234"
    Then Home page is displayed
    And cards are displayed "false"