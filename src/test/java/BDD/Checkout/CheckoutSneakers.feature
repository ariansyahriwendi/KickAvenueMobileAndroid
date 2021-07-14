@CheckoutSneakers
Feature: Checkout Sneakers

  @CheckoutSneakersByKickCredit
  Scenario: User Checkout Sneakers by Kick Credit
    Given I am user
    When I want to checkout
    And I click market
    And I click sneakers checkout
    And I click search sneakers market
    And I input "adidas nmd r1"
    And I click result found sneakers checkout
    And I select product sneakers
    And I click new
    And I select size checkout
    And I click pick payment method
    And I select kick credit payment
    And I click view details
    And I click place order
    And I click view order history
    Then I checkout successfully

  @CheckoutSneakersByBCAInstallments
  Scenario: User Checkout by BCA Installments
    Given I am user
    When I want to checkout
    And I click market
    And I click sneakers checkout
    And I click search sneakers market
    And I input "adidas nmd r1"
    And I click result found sneakers checkout
    And I select product sneakers
    And I click new
    And I select size checkout
    And I click pick payment method
    And I select BCA Installments
    And I click view details
    And I click place order
    And I click continue your payment
    Then I checkout successfully

  @CheckoutSneakersByBCACreditCard
  Scenario: User Checkout by BCA Credit Card
    Given I am user
    When I want to checkout
    And I click market
    And I click sneakers checkout
    And I click search sneakers market
    And I input "adidas nmd r1"
    And I click result found sneakers checkout
    And I select product sneakers
    And I click new
    And I select size checkout
    And I click pick payment method
    And I select BCA Credit Card
    And I click view details
    And I click place order
    And I click continue your payment
    Then I checkout successfully

  @CheckoutSneakersByMandiriInstallments
  Scenario: User Checkout by Mandiri Installments
    Given I am user
    When I want to checkout
    And I click market
    And I click sneakers checkout
    And I click search sneakers market
    And I input "adidas nmd r1"
    And I click result found sneakers checkout
    And I select product sneakers
    And I click new
    And I select size checkout
    And I click pick payment method
    And I select Mandiri Installments
    And I click view details
    And I click place order
    And I click continue your payment
    Then I checkout successfully

  @CheckoutSneakersByCreditCard
  Scenario: User Checkout by Credit Card
    Given I am user
    When I want to checkout
    And I click market
    And I click sneakers checkout
    And I click search sneakers market
    And I input "adidas nmd r1"
    And I click result found sneakers checkout
    And I select product sneakers
    And I click new
    And I select size checkout
    And I click pick payment method
    And I select Credit Card
    And I click view details
    And I click place order
    And I click continue your payment
    Then I checkout successfully

  @CheckoutSneakersByBCAVirtualAccount
  Scenario: User Checkout by BCA Virtual Account
    Given I am user
    When I want to checkout
    And I click market
    And I click sneakers checkout
    And I click search sneakers market
    And I input "adidas nmd r1"
    And I click result found sneakers checkout
    And I select product sneakers
    And I click new
    And I select size checkout
    And I click pick payment method
    And I select BCA Virtual Account
    And I click view details
    And I click place order
    And I click continue your payment
    Then I checkout successfully

  @CheckoutSneakersByMandiriVirtualAccount
  Scenario: User Checkout by Mandiri Virtual Account
    Given I am user
    When I want to checkout
    And I click market
    And I click sneakers checkout
    And I click search sneakers market
    And I input "adidas nmd r1"
    And I click result found sneakers checkout
    And I select product sneakers
    And I click new
    And I select size checkout
    And I click pick payment method
    And I select Mandiri Virtual Account
    And I click view details
    And I click place order
    And I click continue your payment
    Then I checkout successfully

  @CheckoutSneakersByPermataVirtualAccount
  Scenario: User Checkout by Permata Virtual Account
    Given I am user
    When I want to checkout
    And I click market
    And I click sneakers checkout
    And I click search sneakers market
    And I input "adidas nmd r1"
    And I click result found sneakers checkout
    And I select product sneakers
    And I click new
    And I select size checkout
    And I click pick payment method
    And I select Permata Virtual Account
    And I click view details
    And I click place order
    And I click continue your payment
    Then I checkout successfully

  @CheckoutSneakersByBNIVirtualAccount
  Scenario: User Checkout by BNI Virtual Account
    Given I am user
    When I want to checkout
    And I click market
    And I click sneakers checkout
    And I click search sneakers market
    And I input "adidas nmd r1"
    And I click result found sneakers checkout
    And I select product sneakers
    And I click new
    And I select size checkout
    And I click pick payment method
    And I select BNI Virtual Account
    And I click view details
    And I click place order
    And I click continue your payment
    Then I checkout successfully

  @CheckoutSneakersByBRIVirtualAccount
  Scenario: User Checkout by BRI Virtual Account
    Given I am user
    When I want to checkout
    And I click market
    And I click sneakers checkout
    And I click search sneakers market
    And I input "adidas nmd r1"
    And I click result found sneakers checkout
    And I select product sneakers
    And I click new
    And I select size checkout
    And I click pick payment method
    And I select BRI Virtual Account
    And I click view details
    And I click place order
    And I click continue your payment
    Then I checkout successfully


  @CheckoutSneakersByGopayVirtualAccount
  Scenario: User Checkout by Gopay Virtual Account
    Given I am user
    When I want to checkout
    And I click market
    And I click sneakers checkout
    And I click search sneakers market
    And I input "adidas nmd r1"
    And I click result found sneakers checkout
    And I select product sneakers
    And I click new
    And I select size checkout
    And I click pick payment method
    And I select Gopay Virtual Account
    And I click view details
    And I click place order
    And I click continue your payment
    Then I checkout successfully

  @CheckoutSneakersByOtherVirtualAccount
  Scenario: User Checkout by Other Virtual Account
    Given I am user
    When I want to checkout
    And I click market
    And I click sneakers checkout
    And I click search sneakers market
    And I input "adidas nmd r1"
    And I click result found sneakers checkout
    And I select product sneakers
    And I click new
    And I select size checkout
    And I click pick payment method
    And I select Other Virtual Account
    And I click view details
    And I click place order
    And I click continue your payment
    Then I checkout successfully

#  @CheckoutSneakersByAtome
#  Scenario: User Checkout by Atome
#    Given I am user
#    When I want to checkout
#    And I click market
#    And I click sneakers checkout
#    And I click search sneakers market
#    And I input "adidas nmd r1"
#    And I click result found sneakers checkout
#    And I select product sneakers
#    And I click new
#    And I select size checkout
#    And I click pick payment method
#    And I select Atome
#    And I click view details
#    And I click place order
#    And I click view order history
#    Then I checkout successfully
#
#  @CheckoutSneakersByKredivo
#  Scenario: User Checkout by Kredivo
#    Given I am user
#    When I want to checkout
#    And I click market
#    And I click sneakers checkout
#    And I click search sneakers market
#    And I input "adidas nmd r1"
#    And I click result found sneakers checkout
#    And I select product sneakers
#    And I click new
#    And I select size checkout
#    And I click pick payment method
#    And I select Kredivo
#    And I click view details
#    And I click place order
#    And I click view order history
#    Then I checkout successfully

#  @CheckoutByAkulaku
#  Scenario: User Checkout by Akulaku
#    Given I am user
#    When I want to checkout
#    And I click market
#    And I click sneakers checkout
#    And I click search sneakers market
#    And I input "adidas nmd r1"
#    And I click result found sneakers checkout
#    And I select product
#    And I click new
#    And I select size checkout
#    And I click pick payment method
#    And I select Akulaku
#    And I click view details
#    And I click place order
#    And I click continue your payment
#    Then I checkout successfully

  @CheckoutSneakersByBCABankTransfer
  Scenario: User Checkout by BCA Bank Transfer
    Given I am user
    When I want to checkout
    And I click market
    And I click sneakers checkout
    And I click search sneakers market
    And I input "adidas nmd r1"
    And I click result found sneakers checkout
    And I select product sneakers
    And I click new
    And I select size checkout
    And I click pick payment method
    And I select BCA Bank Transfer
    And I click view details
    And I click place order
    And I click view order history
    Then I checkout successfully

  @CheckoutSneakersByMandiriBankTransfer
  Scenario: User Checkout by Mandiri Bank Transfer
    Given I am user
    When I want to checkout
    And I click market
    And I click sneakers checkout
    And I click search sneakers market
    And I input "adidas nmd r1"
    And I click result found sneakers checkout
    And I select product sneakers
    And I click new
    And I select size checkout
    And I click pick payment method
    And I select Mandiri Bank Transfer
    And I click view details
    And I click place order
    And I click view order history
    Then I checkout successfully