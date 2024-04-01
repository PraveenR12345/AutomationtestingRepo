Feature: UMS

  Scenario Outline: Loginpage
    Given user open the URL "http://132.145.186.188:4200/#/login"
    When User enter the "<username>" and "<password>"
    Then User enter the submit button
    Then click on logout button

    Examples: 
      | username                     | password |
      | praveenreddy.g@ikcontech.com | @Test123 |
