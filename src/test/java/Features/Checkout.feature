Feature: Checkout
  Scenario: Ensure user able to successfully checkout
    Given Customer at LG Parts Homepage
    And Customer type LG ADAPTERS in search edit box and click on search icon
    And Customer able to see list of LG ADAPTERS in search result page
    And Customer click in LG EAY62949005 ADAPTERS from search result page
    And Customer click on Add to cart
    And Customer click on view cart
    And Customer click on checkout
    And Customer enter their invalid email in checkout page