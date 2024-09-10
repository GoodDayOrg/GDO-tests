Feature: US040 Login

  @US040_1
  Scenario: US040 Correct login to application as User
    When The Good Day Org website is opened
    And Click "Join us!" button
    And Applicant logs in
    Then Account name: User

  @US040_3
  Scenario: US040 Correct login to application as Admin
    When The Good Day Org website is opened
    And Click "Join us!" button
    And Admin logs in
    Then Account name: Admin

  @US040_5
  Scenario: US040 Incorrect login and incorrect password
    When The Good Day Org website is opened
    And Click "Join us!" button
    And Enter incorrect login and password
    Then Message: Failed to sign in

  @US040_7
  Scenario: US040 Empty login and empty password
    When The Good Day Org website is opened
    And Click "Join us!" button
    And Leave empty login and password fields
    Then Message: Failed to sign in

  @US040_9
  Scenario: US040 Correct login and empty password for User
    When The Good Day Org website is opened
    And Click "Join us!" button
    And User enters correct login and empty password
    Then Message: Failed to sign in

  @US040_11
  Scenario: US040 Correct login and empty password for Admin
    When The Good Day Org website is opened
    And Click "Join us!" button
    And Admin enters correct login and empty password
    Then Message: Failed to sign in

  @US040_13
  Scenario: US040 Empty login and correct password for User
    When The Good Day Org website is opened
    And Click "Join us!" button
    And User enters empty login and correct password
    Then Message: Failed to sign in

  @US040_15
  Scenario: US040 Empty login and correct password for Admin
    When The Good Day Org website is opened
    And Click "Join us!" button
    And Admin enters empty login and correct password
    Then Message: Failed to sign in

  @US040_17
  Scenario: US040 Incorrect login and correct password for User
    When The Good Day Org website is opened
    And Click "Join us!" button
    And User enters incorrect login and correct password
    Then Message: Failed to sign in

  @US040_19
  Scenario: US040 Incorrect login and correct password for Admin
    When The Good Day Org website is opened
    And Click "Join us!" button
    And Admin enters incorrect login and correct password
    Then Message: Failed to sign in

  @US040_21
  Scenario: US040 Correct login and incorrect password for User
    When The Good Day Org website is opened
    And Click "Join us!" button
    And User enters correct login and incorrect password
    Then Message: Failed to sign in

  @US040_23
  Scenario: US040 Correct login and incorrect password for Admin
    When The Good Day Org website is opened
    And Click "Join us!" button
    And Admin enters correct login and incorrect password
    Then Message: Failed to sign in

  @US040_25
  Scenario: US040 Logout User
    When The Good Day Org website is opened
    And Click "Join us!" button
    And Applicant logs in
    And Applicant logs out
    Then Back to the Good Day Org website

  @US040_26
  Scenario: US040 Logout Admin
    When The Good Day Org website is opened
    And Click "Join us!" button
    And Admin logs in
    And Admin logs out
    Then Back to the Good Day Org website



