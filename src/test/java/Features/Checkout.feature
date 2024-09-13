Feature: Checkout
  Scenario: Ensure user able to successfully checkout
    Given Customer at LG Parts Homepage
    And Customer click on log in link
    And Customer enter their valid email log in page
    And Customer enter valid password in log in page
    And Customer click on sign in button
    And Customer successfully able to Log in at LG parts
    And Customer type LG ADAPTERS in search edit box and click on search icon
    And Customer able to see list of LG ADAPTERS in search result page
    And Customer click in LG EAY62949008 ADAPTERS from search result page
    And Customer click on Add to cart
    And Customer click on view cart
    And customer click on check out button
    And customer enter email
    And Customer enter their FirstName in checkout page
    And Customer enter their lastname in checkout page
    And Customer enter their Address in checkout page
    And Customer enter their city  in checkout page
    And Customer enter their state  in checkout page
    And Customer enter their zip code  in checkout page
    And Customer enter their phone number  in checkout page
    And Customer enter valid card number
    And Customer enter card expire date
    And Customer enter valid security code
    When  Customer click on continue button from checkout page

