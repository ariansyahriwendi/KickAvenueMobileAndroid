@CheckoutLuxury
Feature: Checkout Luxury

  @CheckoutLuxuryByKickCredit
  Scenario: User Checkout Luxury by Kick Credit
    Given I am user
    When I want to checkout
    And I click market
    And I click luxury checkout
    And I click search luxury market
    And I input "gg marmont bifold wallet"
    And I click result found luxury checkout
    And I select product luxury
    And I click new
    And I select size checkout
    And I click pick payment method
    And I select kick credit payment
    And I click view details
    And I click place order
    And I click view order history
    Then I checkout successfully