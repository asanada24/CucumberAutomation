Feature: Validate the login credentials of Orange Hrm site8

  Scenario: valid HRM login credentials8-1
    When user is at the OrangeHrm page
    Then user enters userid and password
    Then user validates the title of home page
