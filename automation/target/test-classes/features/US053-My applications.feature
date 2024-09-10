Feature: US053 View My applications

  @US053_admin
  Scenario: US053_admin As an Admin I want to check all my job applications
    When The Good Day Org website is opened
    And Click "Join us!" button
    And Admin logs in
    And Click "My Applications" button
    Then List of My applications is displayed
    Then My Applications has fields displayed: Role Name, Progress info