Feature: create account in facebook5
  as a user you need to open fb home page  and do the validations

  Scenario: validate first-name filed5-1
    Given user need to be on fb page
    When user enter the user first name
    Then user checks the user first name is present
    Then close the browser

    Scenario: validate create user multiple fields5-2
      Given user need to be on fb page
      When user enter the user first name
      And user enters the password
      Then user checks the user first name is present
      Then user password field should be blank
      Then close the browser