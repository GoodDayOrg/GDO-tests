Feature: US0 Login
  @US0
  Scenario: US0 Login button is displayed on Home Page
    Given Job Roles are in the database
    When An applicant opens url..
    Then  Login button is displayed on home page
