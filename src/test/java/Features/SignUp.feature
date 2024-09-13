Feature: sign in
Background:
  Given customer at LG Parts Homepage
  And customer click on log in link
  And Customer click on create account link

Scenario: Ensure customer successfully able to create an account in LG parts
  And Customer enter their valid First name
  And Customer enter their valid Last name
  And Customer enter their valid email
  And Customer enter valid password
  When Customer click on create account button from create account page
  Then Customer successfully able to create an account in LG parts


  Scenario: Ensure customer is not  able to create an account in LG parts
    And Customer enter their valid First name
    And Customer enter their valid Last name
    And Customer enter their invalid email
    And Customer enter valid password
    When Customer click on create account button from create account page
    Then Customer is not able to create an account in LG parts

