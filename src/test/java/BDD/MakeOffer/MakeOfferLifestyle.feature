@MakeOfferLifestyle
Feature: Make Offer Lifestyle

  @MakeOfferLifestyleWithKickCredit
  Scenario: User Make Offer Lifestyle with Kick Credit
    Given I am user
    When I want to make offer
    And I click market
    And I click lifestyle checkout
    And I click search lifestyle market
    And I input "united black horse bike"
    And I click result found lifestyle checkout
    And I select product lifestyle
    And I click new
    And I select size checkout
    And I select make offer
    And I input make offer price "1500000"
    And I click pick payment method
    And I select kick credit payment
    And I click view details
    And I click place offer
    And I click view offer history
    Then I make offer successfully