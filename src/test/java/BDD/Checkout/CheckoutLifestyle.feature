@CheckoutLifestyle
Feature: Checkout Lifestyle

  @CheckoutLifestyleByKickCredit
  Scenario: User Checkout Lifestyle by Kick Credit
    Given I am user
    When I want to checkout
    And I click market
    And I click lifestyle checkout
    And I click search lifestyle market
    And I input "united black horse bike"
    And I click result found lifestyle checkout
    And I select product lifestyle
    And I click new
    And I select size checkout
    And I click pick payment method
    And I select kick credit payment
    And I click view details
    And I click place order
    And I click view order history
    Then I checkout successfully