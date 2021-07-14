@MakeOfferLuxury
Feature: Make Offer Luxury

  @MakeOfferLuxuryWithKickCredit
  Scenario: User Make Offer Luxury with Kick Credit
    Given I am user
    When I want to make offer
    And I click market
    And I click luxury checkout
    And I click search luxury market
    And I input "gg marmont bifold wallet"
    And I click result found luxury checkout
    And I select product luxury
    And I click new
    And I select size checkout
    And I select make offer
    And I input make offer price "1600000"
    And I click pick payment method
    And I select kick credit payment
    And I click view details
    And I click place offer
    And I click view offer history
    Then I make offer successfully