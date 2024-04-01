Feature: Feature to test login functionality of Orange HRM

  Scenario Outline: Check login is successful with valid credentials
    Given user is on login page "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When user enters "<username>" and "<password>"
    And clicks on login button
    Then click on admin from side menu bar
    #Then click on add in admin page user management
    #Then click on job dropdown in admin page

    Examples: 
      | username | password |
      | Admin    | admin123 |
