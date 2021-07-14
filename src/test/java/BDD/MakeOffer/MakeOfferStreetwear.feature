@MakeOfferStreetwear
Feature: Make Offer Streetwear

  @MakeOfferStreetwearWithKickCredit
  Scenario: User Make Offer Streetwear with Kick Credit
    Given I am user
    When I want to make offer
    And I click market
    And I click streetwear checkout
    And I click search streetwear market
    And I input "supreme blocked hoodie yellow"
    And I click result found streetwear checkout
    And I select product streetwear
    And I click new
    And I select size checkout
    And I select make offer
    And I input make offer price "1700000"
    And I click pick payment method
    And I select kick credit payment
    And I click view details
    And I click place offer
    And I click view offer history
    Then I make offer successfully