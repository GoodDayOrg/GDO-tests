Feature: US001 View Job Roles
  @US001
  Scenario: US001 Open Job Roles are displayed on Home Page
    Given Job Roles are in the database
    When An applicant opens url..
    Then List of Job Roles with status OPEN are displayed
