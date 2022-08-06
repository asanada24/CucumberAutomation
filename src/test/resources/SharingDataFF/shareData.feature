Feature: create account in facebook11
  as a user you need to open fb home page  and do the validations

  Scenario: validate first-name filed11-1
    Given user need to be on fb page
    When user enter the user "chittikodallu" first name
    Then user checks the user "chittikodallu" first name is present
   # Then close the browser // removed bcz we are implementing @Before and after

  Scenario: validate create user multiple fields11-2
    Given user need to be on fb page
    When user enter the user "chittikodallu" first name
    And user enters the "bub@123" password
    Then user checks the user "chittikodallu" first name is present
    Then user password "bub@123" field should be blank
    #Then close the browser