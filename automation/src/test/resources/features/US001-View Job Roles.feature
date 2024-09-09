Feature: US001 View Job Roles
  @US001
  Scenario: US001 Open Job Roles are displayed on Home Page
    Given Job Roles are in the database: 16 of 20 have status "open"
    When An applicant opens Good Day Org website
    And  Applicant clicks "Join us!" button
    And  Applicant signs in
    Then List of 16 opened Job Roles are displayed
    Then Job role has fields displayed: Name, Location, Band, Capability, Date




