Feature: UMS

  Scenario Outline: Loginpage
    Given user open the URL "http://132.145.186.188:4200/#/login"
    When User enter the "<username>" and "<password>"
    Then User enter the submit button
    #Then click on settings
    #Then click on roles
    #Then click on add role "<RN1>" and "<PN1>"
    #Then click on add role "<RN2>" and "<PN2>"
    #Then click on add role "<RN3>" and "<PN3>"
    Then click on settings1
    Then click on task category
    Then click on add task category "<TCN1>" and "<TCD1>"
    Then click on add task category "<TCN2>" and "<TCD2>"

    #Then click on logout button
    Examples: 
      | username                  | password | RN1             | PN1                | RN2                | PN2  | RN3             | PN3  | TCN1             | TCD1                         | TCN2             | TCD2                         |
      | ums-support@ikcontech.com | Test@123 | Automation Head | View,Create,Update | Automation Manager | View | Automation Lead | View | Automation task1 | Automation task description1 | Automation task2 | Automation task description2 |
