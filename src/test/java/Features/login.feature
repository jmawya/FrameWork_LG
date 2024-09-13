Feature: log in
  Scenario: Ensure customer successfully able to Log in  at LG parts
    Given customer at LG Parts Homepage
    And customer click on log in link
    And customer enter their valid email log in page
    And customer enter valid password in log in page
    When customer click on sign in button
    Then customer successfully able to Log in at LG parts

  Scenario: Ensure customer should not able to Log in  at LG parts
    Given customer at LG Parts Homepage
    And customer click on log in link
    And Customer enter their invalid email log in page
    And Customer enter invalid password in log in page
    When customer click on sign in button
    Then Customer should not able to Log in at LG parts