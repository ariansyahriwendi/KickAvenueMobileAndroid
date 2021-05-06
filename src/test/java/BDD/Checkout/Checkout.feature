@Checkout
Feature: Checkout

  @CheckoutByKickCredit
  Scenario: User Checkout by Kick Credit
    Given I am user
    When I want to checkout
    And I click market
    And I select product
    And I click new
    And I select size
    And I click pick payment method
    And I click Kick Credit payment
    And I click view details
    And I click place order
    And I click continue your payment
    Then I checkout successfully

  @CheckoutBCAInstallments
  Scenario: User Checkout by BCA Installments
    Given I am user
    When I want to checkout
    And I click market
    And I select product
    And I click new
    And I select size
    And I click pick payment method
    And I click BCA Installments
    And I click view details
    And I click place order
    And I click continue your payment
    Then I checkout successfully
