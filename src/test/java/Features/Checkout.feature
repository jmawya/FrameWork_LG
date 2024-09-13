Feature: Checkout
  Scenario: Ensure user able to successfully checkout
    Given customer at LG Parts Homepage
    And customer click on log in link
    And customer enter their valid email log in page
    And customer enter valid password in log in page
    And customer click on sign in button
    And customer successfully able to Log in at LG parts
    And customer type LG ADAPTERS in search edit box and click on search icon
    And customer able to see list of LG ADAPTERS in search result page
    And customer click in LG EAY62949008 ADAPTERS from search result page
    And customer click on Add to cart
    And customer click on view cart
    And customer click on check out button
    And customer enter email
    And customer enter their FirstName in checkout page
    And customer enter their lastname in checkout page
    And customer enter their Address in checkout page
    And customer enter their city  in checkout page
    And customer enter their state  in checkout page
    And customer enter their zip code  in checkout page
    And customer enter their phone number  in checkout page
    And customer enter valid card number
    And customer enter card expire date
    And customer enter valid security code
    When customer click on continue button from checkout page

