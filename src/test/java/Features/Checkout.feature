Feature: Checkout
  Scenario: Ensure user able to successfully checkout
    Given Customer at LG Parts Homepage
    And Customer type LG ADAPTERS in search edit box and click on search icon
    And Customer able to see list of LG ADAPTERS in search result page
    And Customer click in LG EAY62949008 ADAPTERS from search result page
    And Customer click on Add to cart
    And Customer click on view cart
    And Customer click on checkout button
    And Customer enter their invalid email in checkout page
    And Customer enter their FirstName in checkout page
    And Customer enter their lastname in checkout page
    And Customer enter their Address in checkout page
    And Customer enter their city  in checkout page
    And Customer enter their state  in checkout page
    And Customer enter their zip code  in checkout page
    And Customer enter their phone number  in checkout page
