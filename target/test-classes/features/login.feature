@Regression @smoke @test @login
Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different
  accounts. And dashboard should be displayed
  Accounts are : librarian, student , admin

  Background: For the scenarios in the feature file,
              user expected to be on login page
    Given user is on the library login page

@Group @Employee
  Scenario: Login as librarian
    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard
  @student
    Scenario: Login as student
      When user enters student username
      And user enters student password
      Then user should see the dashboard
@Other
    Scenario: Login as admin
      When user enters admin username
      And user enters admin password
      Then user should see the dashboard


# adding comments