@Sell
Feature: Sell Request

  @SellSneakers
  Scenario: User Sell Request Sneakers
    Given I am user
    When I want to use sell request feature
    And I click sell
    And I click sell sneakers
    And I select photo
    And I click next
    And I select category sneakers
    And I input product name "adidas nmd r1 jd sports grey"
    And I select product sneakers sell
    And I select size sneakers sell
    And I select sneakers condition
    And I select sneakers box condition
    And I input sell price "3100000"
    And I click submit sell
    Then I sell successfully

  @SellStreetwear
  Scenario: User Sell Request Streetwear
    Given I am user
    When I want to use sell request feature
    And I click sell
    And I click sell streetwear
    And I select photo streetwear
    And I click next
    And I select category streetwear
    And I input product name "supreme blocked hoodie yellow"
    And I select product streetwear sell
    And I select size streetwear sell
    And I select streetwear condition
    And I input sell price "3200000"
    And I click submit sell
    Then I sell successfully

  @SellLuxury
  Scenario: User Sell Request Luxury
    Given I am user
    When I want to use sell request feature
    And I click sell
    And I click sell luxury
    And I select photo
    And I click next
    And I select category luxury
    And I input product name "gg marmont bifold wallet"
    And I select product luxury sell
    And I select luxury condition
    And I select luxury box condition
    And I input sell price "3300000"
    And I click submit sell
    Then I sell successfully

  @SellLifestyle
  Scenario: User Sell Request Lifestyle
    Given I am user
    When I want to use sell request feature
    And I click sell
    And I click sell lifestyle
    And I select photo lifestyle
    And I click next
    And I select category lifestyle
    And I input product name "united black horse bike"
    And I select product lifestyle sell
    And I select size lifestyle sell
    And I select lifestyle condition
    And I select lifestyle box condition
    And I input sell price "3400000"
    And I click submit sell
    Then I sell successfully