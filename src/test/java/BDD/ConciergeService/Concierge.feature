@Concierge
Feature: Concierge

  @ConciergeService
  Scenario: User Use Concierge Service Feature
    Given I am user
    When I want to use concierge service
    And I click home
    And I click home luxury
    And I click concierge service
    And I click see my concierge list
    And I input concierge name "Ariansyah"
    And I input concierge phone number "081806442929"
    And I input concierge product name "gucci wallet"
    And I select concierge condition
    And I select concierge shipping address
    And I select image concierge
    And I click submit concierge
    Then I use concierge service successfully