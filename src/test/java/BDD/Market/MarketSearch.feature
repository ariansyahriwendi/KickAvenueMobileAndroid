@MarketSearch
Feature: Market Search

  @MarketSearchSneakers
  Scenario: User Search Product Sneakers
    Given I am user
    When I want view product market sneakers
    And I click market
    And I click sneakers
    And I click search sneakers market
    And I input "nike"
    And I click result found sneakers
    And I click back to search

    And I input "adidas"
    And I click result found sneakers
    And I click back to search

    And I input "air jordan"
    And I click result found sneakers
    And I click back to search

#    And I input "yeezy"
#    And I click result found sneakers
#    And I click back to search
#
#    And I input "new balance"
#    And I click result found sneakers
#    And I click back to search
#
#    And I input "converse"
#    And I click result found sneakers
#    And I click back to search
#
#    And I input "vans"
#    And I click result found sneakers
#    And I click back to search
#
#    And I input "puma"
#    And I click result found sneakers
#    Then I search product successfully

  @MarketSearchStreetwear
  Scenario: User Search Product Streetwear
    Given I am user
    When I want view product market streetwear
    And I click market
    And I click streetwear
    And I click search streetwear market
    And I input "bathing ape"
    And I click result found streetwear
    And I click back to search

    And I input "off white"
    And I click result found streetwear
    And I click back to search

    And I input "supreme"
    And I click result found streetwear
    Then I search product successfully

  @MarketSearchLuxury
  Scenario: User Search Product Luxury
    Given I am user
    When I want view product market luxury
    And I click market
    And I click luxury
    And I click search luxury market
    And I input "gucci"
    And I click result found luxury
    And I click back to search

    And I input "kenzo"
    And I click result found luxury
    Then I search product successfully

  @MarketSearchLifestyle
  Scenario: User Search Product Lifestyle
    Given I am user
    When I want view product market lifestyle
    And I click market
    And I click lifestyle
    And I click search lifestyle market

    And I input "bike"
    And I click result found lifestyle
    And I click back to search

    And I input "kaws"
    And I click result found lifestyle
    Then I search product successfully