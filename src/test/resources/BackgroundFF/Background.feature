Feature: create account in facebook1
  as a user you need to open fb home page  and do the validations

  Background: common login step
   Given user need to be on fb page

  Scenario: validate first-name filed1-1
    When user enter the user "chittikodallu" first name
    Then user checks the user "chittikodallu" first name is present
    Then close the browser

  Scenario: validate create user multiple fields1-2
    When user enter the user "chittikodallu" first name
    And user enters the "bub@123" password
    Then user checks the user "chittikodallu" first name is present
    Then user password  field should be blank
    Then close the browser