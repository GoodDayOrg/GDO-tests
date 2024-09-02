Feature: US001 View Job Roles
  @US001
  Scenario: US001 Open Job Roles are displayed on Home Page
    Given Job Roles are in the database: 6 of 7 have status "open"
    When An applicant opens "Good Day Org - Job roles list"  website
    Then List of 6 Job Roles with status OPEN are displayed
    Then Job role has fields displayed: Name, Location, Band, Capability, Date
