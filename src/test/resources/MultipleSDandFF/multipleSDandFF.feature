Feature: create account in facebook7
  as a user you need to open fb home page  and do the validations

  Scenario: validate first-name filed7-1
    Given user need to be on fb page
    When user enter the user "chittikodallu" first name
    Then user checks the user "chittikodallu" first name is present
    Then close the browser

  Scenario: validate create user multiple fields7-2
    Given user need to be on fb page
    When user enter the user "chittikodallu" first name
    And user enters the "bub@123" password
    Then user checks the user "chittikodallu" first name is present
    Then user password "bub@123" field should be blank
    Then close the browser