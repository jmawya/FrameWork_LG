Feature: Forgot password
Scenario: Ensure student successfully recover their password
  Given customer at LG Parts Homepage
  And customer click on log in link
  And customer enter their valid email log in page
  And customer click on forgot password link
  And customer enter their valid email for reset password
  And customer click on submit button
  And customer go to gmail homepage
  And customer enter their valid email in google homepage