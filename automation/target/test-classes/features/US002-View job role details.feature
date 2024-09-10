Feature: US002 View Job Role details
  @US002
  Scenario: US002 View job role information
    Given Job Roles are in the database: 16 of 20 have status "open"
    When The Good Day Org website is opened
    And Click "Join us!" button
    And Applicant logs in

    Then List of 16 opened Job Roles are displayed
    When User clicks on a role
    Then Job role view with details is displayed
    And Job role has Name: "Test Automation Engineer"
    And Job role has Description
    And Job role has Responsibilities
    And Job role has SharePoint link: "sharepoint link"
    And Job role has Location: "Location: Indianapolis"
    And Job role has Capability: "Capability: Data & AI"
    And Job role has Band: "Band: Senior Associate"
    And Job role has Closing date: "Closing date: 07.07.2024"
    And Job role has Status: "Status: open"
    And Job role has Number of Open Positions: "Open positions: 1"























