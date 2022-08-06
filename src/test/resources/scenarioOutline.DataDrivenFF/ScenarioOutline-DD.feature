Feature: create account in facebook10
  as a user you need to open fb home page  and do the validations


  Scenario Outline: validate create user multiple fields10-1
    Given user need to be on fb page
    When user enter the user <user> first name
    And user enters the <pass> password
    Then user checks the user <user> first name is present
    Then user password <pass> field should be blank
    Then close the browser
    Examples:
      |   user   |    pass   |
      |   tom    |    tom@1  |
      |   hank   |    hank@1 |