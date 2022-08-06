@Important
Feature: create account in facebook13
  as a user you need to open fb home page  and do the validations
@Smoke
  Scenario: validate first-name filed13-1
    Given user need to be on fb page
    When user enter the user "chittikodallu" first name
    Then user checks the user "chittikodallu" first name is present
    Then close the browser
@Smoke @Regression
  Scenario: validate create user multiple fields13-2
    Given user need to be on fb page
    When user enter the user "chittikodallu" first name
    And user enters the "bub@123" password
    Then user checks the user "chittikodallu" first name is present
    Then user password "bub@123" field should be blank
    Then close the browser

  Scenario: validate first-name filed13-3
    Given user need to be on fb page
    When user enter the user "chittikodallu" first name
    Then user checks the user "chittikodallu" first name is present
    Then close the browser
@Regression
  Scenario: validate create user multiple fields13-4
    Given user need to be on fb page
    When user enter the user "chittikodallu" first name
    And user enters the "bub@123" password
    Then user checks the user "chittikodallu" first name is present
    Then user password "bub@123" field should be blank
    Then close the browser
  @smoke
  Scenario: validate first-name filed13-5
    Given user need to be on fb page
    When user enter the user "chittikodallu" first name
    Then user checks the user "chittikodallu" first name is present
    Then close the browser