Feature: log in
  Scenario: Ensure customer successfully able to Log in  at LG parts
    Given Customer at LG Parts Homepage
    And Customer click on log in link
    And Customer enter their valid email log in page
    And Customer enter valid password in log in page
    When Customer click on sign in button
    Then Customer successfully able to Log in at LG parts

  Scenario: Ensure customer should not able to Log in  at LG parts
    Given Customer at LG Parts Homepage
    And Customer click on log in link
    And Customer enter their invalid email log in page
    And Customer enter invalid password in log in page
    When Customer click on sign in button
    Then Customer should not able to Log in at LG parts