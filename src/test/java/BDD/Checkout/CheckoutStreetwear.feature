@CheckoutStreetwear
Feature: Checkout Streetwear

  @CheckoutStreetwearByKickCredit
  Scenario: User Checkout Streetwear by Kick Credit
    Given I am user
    When I want to checkout
    And I click market
    And I click streetwear checkout
    And I click search streetwear market
    And I input "supreme blocked hoodie yellow"
    And I click result found streetwear checkout
    And I select product streetwear
    And I click new
    And I select size checkout
    And I click pick payment method
    And I select kick credit payment
    And I click view details
    And I click place order
    And I click view order history
    Then I checkout successfully
