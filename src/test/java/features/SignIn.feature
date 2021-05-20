Feature: Login into application
  Scenario Outline: Positive test Validating Login
    Given Initialize the browser with chrome
    And Navigate to "QAClickAcademy" site
    And  Clink on Login link in home page to land on secure sign in page
    When User enters <username> and <password1> and Logs In
    Then verify user logged in successfully

    Examples:
      | username              | password1 |
      | ranjithab80@gmail.com | 1234as    |
      | ishanub80@gmail.com   | 354454ds  |