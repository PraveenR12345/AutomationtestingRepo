Feature: UMS

  Scenario Outline: Loginpage
    #Roles
    Given user open the URL "http://132.145.186.188:4200/#/login"
    When User enter the "<username>" and "<password>"
    Then User enter the submit button
    #Then click on settings
    #Then click on roles
    #Then click on add role "<RN1>" and "<PN1>"
    #Then click on add role "<RN2>" and "<PN2>"
    #Then click on add role "<RN3>" and "<PN3>"
    #Then click on selectall check box
    #Then click on single checkbox
    #Then click on single delete
    #Then click on update
    #
    #Task category
    #Then click on settings1
    #Then click on task category
    #Then click on add task category "<TCN1>" and "<TCD1>"
    #Then click on add task category "<TCN2>" and "<TCD2>"
    #Then click on selectall checkbox
    #Designation
    #Then click on settings2
    #Then click on designations
    #Then click on add designation "<DN1>"
    #Then click on add designation "<DN2>"
    #Then click on add designation "<DN3>"
    #permissions
    #Then click on settings3
    #Then click on permissions
    #Then click on add permission "<PV1>" and "<PD1>"
    #Departments
    When user clicks on settings page
    And clicks on departments from organization
    Then clicks on add departments "<D1>" and "<DC1>" and "<DL1>"
    Then clicks on add departments "<D2>" and "<DC2>" and "<DL2>"
    Then clicks on add departments "<D3>" and "<DC3>" and "<DL3>"
    And when user wants to click single delete
    And when user wants to update a department
    And when user clicks on select all checkbox
    And when user clicks on single select checkbox
    #Menuitems
    When user clicks settings page1
    And user clicks on menu items
    Then clicks on add menu items "<MIN1>" and "<MIP1>" and "<MID1>"

    #Then click on logout button
    Examples: 
      | username                  | password | RN1             | PN1                | RN2                | PN2  | RN3             | PN3  | TCN1            | TCD1                         | TCN2                | TCD2                         | DN1    | DN2   | DN3    | PV1    | PD1     | D1     | DC1    | DL1 | D2          | DC2    | DL2 | D3       | DC3    | DL3 | MIN1       | MIP1          | MID1           |
      | ums-support@ikcontech.com | Test@123 | Automation Head | View,Create,Update | Automation Manager | View | Automation Lead | View | Manual Category | Automation task description1 | Automation Category | Automation task description2 | Sforce | Azure | google | Manual | testing | pharma | IKSO01 | Hyd | centurylink | IKSC02 | Hyd | Telebusy | IKEN03 | Hyd | Samplemenu | Samplemenudes | Samplemenupath |
