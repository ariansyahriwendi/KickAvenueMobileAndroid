@MakeOfferSneakers
Feature: Make Offer Sneakers

  @MakeOfferSneakersWithKickCredit
  Scenario: User Make Offer Sneakers with Kick Credit
    Given I am user
    When I want to make offer
    And I click market
    And I click sneakers checkout
    And I click search sneakers market
    And I input "adidas nmd r1"
    And I click result found sneakers checkout
    And I select product sneakers
    And I click new
    And I select size checkout
    And I select make offer
    And I input make offer price "1800000"
    And I click pick payment method
    And I select kick credit payment
    And I click view details
    And I click place offer
    And I click view offer history
    Then I make offer successfully

  @MakeOfferSneakersWithBCAInstallments
  Scenario: User Make Offer Sneakers with BCA Installments
    Given I am user
    When I want to make offer
    And I click market
    And I click sneakers checkout
    And I click search sneakers market
    And I input "adidas nmd r1"
    And I click result found sneakers checkout
    And I select product sneakers
    And I click new
    And I select size checkout
    And I select make offer
    And I input make offer price "1800000"
    And I click pick payment method
    And I select BCA Installments
    And I click view details
    And I click place offer
    And I click view offer history
    Then I make offer successfully

  @MakeOfferSneakersWithBCACreditCard
  Scenario: User Make Offer Sneakers with BCA CreditCard
    Given I am user
    When I want to make offer
    And I click market
    And I click sneakers checkout
    And I click search sneakers market
    And I input "adidas nmd r1"
    And I click result found sneakers checkout
    And I select product sneakers
    And I click new
    And I select size checkout
    And I select make offer
    And I input make offer price "1800000"
    And I click pick payment method
    And I select BCA Credit Card
    And I click view details
    And I click place offer
    And I click view offer history
    Then I make offer successfully

  @MakeOfferSneakersWithMandiriInstallments
  Scenario: User Make Offer Sneakers with Mandiri Installments
    Given I am user
    When I want to make offer
    And I click market
    And I click sneakers checkout
    And I click search sneakers market
    And I input "adidas nmd r1"
    And I click result found sneakers checkout
    And I select product sneakers
    And I click new
    And I select size checkout
    And I select make offer
    And I input make offer price "1800000"
    And I click pick payment method
    And I select Mandiri Installments
    And I click view details
    And I click place offer
    And I click view offer history
    Then I make offer successfully

  @MakeOfferSneakersWithCreditCard
  Scenario: User Make Offer Sneakers with Credit Card
    Given I am user
    When I want to make offer
    And I click market
    And I click sneakers checkout
    And I click search sneakers market
    And I input "adidas nmd r1"
    And I click result found sneakers checkout
    And I select product sneakers
    And I click new
    And I select size checkout
    And I select make offer
    And I input make offer price "1800000"
    And I click pick payment method
    And I select Credit Card
    And I click view details
    And I click place offer
    And I click view offer history
    Then I make offer successfully

  @MakeOfferSneakersWithBCAVirtualAccount
  Scenario: User Make Offer Sneakers with BCA Virtual Account
    Given I am user
    When I want to make offer
    And I click market
    And I click sneakers checkout
    And I click search sneakers market
    And I input "adidas nmd r1"
    And I click result found sneakers checkout
    And I select product sneakers
    And I click new
    And I select size checkout
    And I select make offer
    And I input make offer price "1800000"
    And I click pick payment method
    And I select BCA Virtual Account
    And I click view details
    And I click place offer
    And I click view offer history
    Then I make offer successfully

  @MakeOfferSneakersWithMandiriVirtualAccount
  Scenario: User Make Offer Sneakers with Mandiri Virtual Account
    Given I am user
    When I want to make offer
    And I click market
    And I click sneakers checkout
    And I click search sneakers market
    And I input "adidas nmd r1"
    And I click result found sneakers checkout
    And I select product sneakers
    And I click new
    And I select size checkout
    And I select make offer
    And I input make offer price "1800000"
    And I click pick payment method
    And I select Mandiri Virtual Account
    And I click view details
    And I click place offer
    And I click view offer history
    Then I make offer successfully

  @MakeOfferSneakersWithPermataVirtualAccount
  Scenario: User Make Offer Sneakers with Permata Virtual Account
    Given I am user
    When I want to make offer
    And I click market
    And I click sneakers checkout
    And I click search sneakers market
    And I input "adidas nmd r1"
    And I click result found sneakers checkout
    And I select product sneakers
    And I click new
    And I select size checkout
    And I select make offer
    And I input make offer price "1800000"
    And I click pick payment method
    And I select Permata Virtual Account
    And I click view details
    And I click place offer
    And I click view offer history
    Then I make offer successfully

  @MakeOfferSneakersWithBNIVirtualAccount
  Scenario: User Make Offer Sneakers with BNI Virtual Account
    Given I am user
    When I want to make offer
    And I click market
    And I click sneakers checkout
    And I click search sneakers market
    And I input "adidas nmd r1"
    And I click result found sneakers checkout
    And I select product sneakers
    And I click new
    And I select size checkout
    And I select make offer
    And I input make offer price "1800000"
    And I click pick payment method
    And I select BNI Virtual Account
    And I click view details
    And I click place offer
    And I click view offer history
    Then I make offer successfully

  @MakeOfferSneakersWithBRIVirtualAccount
  Scenario: User Make Offer Sneakers with BRI Virtual Account
    Given I am user
    When I want to make offer
    And I click market
    And I click sneakers checkout
    And I click search sneakers market
    And I input "adidas nmd r1"
    And I click result found sneakers checkout
    And I select product sneakers
    And I click new
    And I select size checkout
    And I select make offer
    And I input make offer price "1800000"
    And I click pick payment method
    And I select BRI Virtual Account
    And I click view details
    And I click place offer
    And I click view offer history
    Then I make offer successfully

  @MakeOfferSneakersWithGopayVirtualAccount
  Scenario: User Make Offer Sneakers with Gopay Virtual Account
    Given I am user
    When I want to make offer
    And I click market
    And I click sneakers checkout
    And I click search sneakers market
    And I input "adidas nmd r1"
    And I click result found sneakers checkout
    And I select product sneakers
    And I click new
    And I select size checkout
    And I select make offer
    And I input make offer price "1800000"
    And I click pick payment method
    And I select Gopay Virtual Account
    And I click view details
    And I click place offer
    And I click view offer history
    Then I make offer successfully

  @MakeOfferSneakersWithOtherVirtualAccount
  Scenario: User Make Offer Sneakers with Other Virtual Account
    Given I am user
    When I want to make offer
    And I click market
    And I click sneakers checkout
    And I click search sneakers market
    And I input "adidas nmd r1"
    And I click result found sneakers checkout
    And I select product sneakers
    And I click new
    And I select size checkout
    And I select make offer
    And I input make offer price "1800000"
    And I click pick payment method
    And I select Other Virtual Account
    And I click view details
    And I click place offer
    And I click view offer history
    Then I make offer successfully

  @MakeOfferSneakersWithBCABankTransfer
  Scenario: User Make Offer Sneakers with BCA Bank Transfer
    Given I am user
    When I want to make offer
    And I click market
    And I click sneakers checkout
    And I click search sneakers market
    And I input "adidas nmd r1"
    And I click result found sneakers checkout
    And I select product sneakers
    And I click new
    And I select size checkout
    And I select make offer
    And I input make offer price "1800000"
    And I click pick payment method
    And I select BCA Bank Transfer
    And I click view details
    And I click place offer
    And I click view offer history
    Then I make offer successfully

  @MakeOfferSneakersWithMandiriBankTransfer
  Scenario: User Make Offer Sneakers with Mandiri Bank Transfer
    Given I am user
    When I want to make offer
    And I click market
    And I click sneakers checkout
    And I click search sneakers market
    And I input "adidas nmd r1"
    And I click result found sneakers checkout
    And I select product sneakers
    And I click new
    And I select size checkout
    And I select make offer
    And I input make offer price "1800000"
    And I click pick payment method
    And I select Mandiri Bank Transfer
    And I click view details
    And I click place offer
    And I click view offer history
    Then I make offer successfully