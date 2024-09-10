Feature: US001 View Job Roles

  @US001_user
  Scenario: US001_user Open Job Roles are displayed on Home Page
    Given Job Roles are in the database: 16 of 20 have status "open"
    When The Good Day Org website is opened
    And Click "Join us!" button
    And Applicant logs in
    Then List of 16 opened Job Roles are displayed
    Then Job role has fields displayed: Name, Location, Band, Capability, Date

  @US001_admin
  Scenario: US001_admin Open Job Roles are displayed on Home Page
    Given Job Roles are in the database: 16 of 20 have status "open"
    When The Good Day Org website is opened
    And Click "Join us!" button
    And Admin logs in
    Then List of 16 opened Job Roles are displayed
    Then Job role has fields displayed: Name, Location, Band, Capability, Date


