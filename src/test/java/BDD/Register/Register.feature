@Register
Feature: Register

  @RegisterSuccess
  Scenario: Guest User Register to Application
    Given I am guest user
    When I want to register
    And I click profile
    And I click register button
    And I input register email
    And I input register password
    And I input register confirm password
    And I input register select country
    And I input register select province
    And I click register submit button
    Then I register successfully

  @RegisterWithGoogle
  Scenario: Guest User Register to Application with Google
    Given I am guest user
    When I want to register
    And I click profile
    And I click register button
    And I click register google button
    And I select google account
    Then I register successfully

  @RegisterWithFacebook
  Scenario: Guest User Register to Application with Facebook
    Given I am guest user
    When I want to register
    And I click profile
    And I click register button
    And I click register facebook button
    And I select facebook account
    Then I register successfully
