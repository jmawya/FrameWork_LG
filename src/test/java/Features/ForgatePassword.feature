Feature: Forgot password
Scenario: Ensure student successfully recover their password
  Given Customer at LG Parts Homepage
  And Customer click on log in link
  And Customer enter their valid email log in page
  And Customer click on forgot password link
  And Customer enter their valid email for reset password
  And Customer click on submit button
  And Customer go to gmail homepage
  And customer enter their valid email in google homepage