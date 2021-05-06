@Market
Feature: Market

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

    And I input "yeezy"
    And I click result found sneakers
    And I click back to search

    And I input "new balance"
    And I click result found sneakers
    And I click back to search

    And I input "converse"
    And I click result found sneakers
    And I click back to search

    And I input "vans"
    And I click result found sneakers
    And I click back to search

    And I input "puma"
    And I click result found sneakers
    Then I search product successfully

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

#    And I input "champion"
#    And I click result found streetwear
#    And I click back to search

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
    And I input "funko pop"
    And I click result found lifestyle
    And I click back to search

    And I input "bike"
    And I click result found lifestyle
    And I click back to search

    And I input "kaws"
    And I click result found lifestyle
    Then I search product successfully

  @MarketFilterSneakers
  Scenario: User Filter Search Product Sneakers
    Given I am user
    When I want view product market sneakers
    And I click market
    And I click sneakers
    And I click filter sneakers
    And I click sort by most popular
    And I click apply filter

    And I click filter
    And I click sort by best match
    And I click apply filter

    And I click filter
    And I click sort by price high to low
    And I click apply filter

#    And I click filter sneakers
#    And I click sort by price low to high
#    And I click apply filter

    And I click filter
    And I click gender men
    And I click apply filter

    And I click filter
    And I click gender women
    And I click apply filter

    And I click filter
    And I click gender youth kid
    And I click apply filter

    And I click filter
    And I click condition new
    And I click apply filter

    And I click filter
    And I click condition used
    And I click apply filter

    And I click filter
    And I click condition pre order
    And I click apply filter

#    And I click filter sneakers
#    And I click condition pre verified
#    And I click apply filter

#    And I click filter sneakers
#    And I select size
#    And I click apply filter

    And I click filter
    And I click brand adidas
    And I click apply filter

    And I click filter
    And I click brand adidas stan smith
    And I click apply filter

    And I click filter
    And I click color red
    And I click apply filter

    And I click filter
    And I click color black
    And I click apply filter
    Then I use filter search successfully

  @MarketFilterStreetwear
  Scenario: User Filter Search Product Streetwear
    Given I am user
    When I want view product market streetwear
    And I click market
    And I click streetwear
    And I click filter streetwear
    And I click sort by most popular
    And I click apply filter

    And I click filter
    And I click sort by best match
    And I click apply filter

    And I click filter
    And I click sort by price high to low
    And I click apply filter

#    And I click filter
#    And I click sort by price low to high
#    And I click apply filter

    And I click filter
    And I click gender men
    And I click apply filter

    And I click filter
    And I click gender women
    And I click apply filter

    And I click filter
    And I click gender youth kid
    And I click apply filter

    And I click filter
    And I click condition new
    And I click apply filter

    And I click filter
    And I click condition used
    And I click apply filter

    And I click filter
    And I click condition pre order
    And I click apply filter

#    And I click filter
#    And I click condition pre verified
#    And I click apply filter

#    And I click filter
#    And I select size
#    And I click apply filter

#    And I click filter
#    And I click apply filter
#    And I click brand 88rising
#    And I click apply filter
#
#    And I click filter
#    And I click brand aape
#    And I click apply filter
    Then I use filter search successfully

  @MarketFilterLuxury
  Scenario: User Filter Search Product Luxury
    Given I am user
    When I want view product market luxury
    And I click market
    And I click luxury
    And I click filter luxury
    And I click sort by most popular
    And I click apply filter

    And I click filter
    And I click sort by best match
    And I click apply filter

    And I click filter
    And I click sort by price high to low
    And I click apply filter

#    And I click sort by price low to high
#    And I click apply filter

    And I click filter
    And I click condition brand new
    And I click apply filter

    And I click filter
    And I click condition pristine
    And I click apply filter

    And I click filter
    And I click condition good
    And I click apply filter

#    And I click condition well used
#    And I click apply filter
#
#    And I click condition like new
#    And I click apply filter
#
#    And I click condition vintage
#    And I click apply filter

#    And I click brand 31 phillip lim
#    And I click brand acne studio
    Then I use filter search successfully

  @MarketFilterLifestyle
  Scenario: User Filter Search Product Lifestyle
    Given I am user
    When I want view product market lifestyle
    And I click market
    And I click lifestyle
    And I click filter lifestyle
    And I click sort by most popular
    And I click apply filter

    And I click filter
    And I click sort by best match
    And I click apply filter

    And I click filter
    And I click sort by price high to low
    And I click apply filter

#    And I click filter
#    And I click sort by price low to high
#    And I click apply filter

    And I click filter
    And I click condition new lifestyle
    And I click apply filter

    And I click filter
    And I click condition used
    And I click apply filter

    And I click filter
    And I click category bike
    And I click apply filter
    Then I use filter search successfully