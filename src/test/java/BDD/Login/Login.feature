@Login
Feature: Login

  @LoginSuccess
  Scenario: Guest User Login to Application with Email and Password
    Given I am guest user
    When I want to login
    And I click profile
    And I click login button
    And I input email "ariansyahriwendi@gmail.com"
    And I input password "Passwordkickavenue"
    And I click login submit button
    Then I login successfully

  @Logout
  Scenario: User Logout from Application
    Given I am user logout
    When I want to logout
    And I click profile
    And I click logout button
    Then I logout successfully

    @LoginLogout
    Scenario: Guest User Login to Application and Logout
      Given I am guest user
      When I want to login
      And I click profile
      And I click login button
      And I input email "ariansyahriwendi@gmail.com"
      And I input password "Passwordkickavenue"
      And I click login submit button
      Then I login successfully
      And I click profile
      And I click logout button
      Then I logout successfully

    @LoginWithGoogle
    Scenario: Guest User Login to Application with Google
      Given I am guest user
      When I want to login
      And I click profile
      And I click login button
      And I click continue with google button
      Then I login successfully


    @LoginWithFacebook
    Scenario: Guest User Login to Application with Facebook
      Given I am guest user
      When I want to login
      And I click profile
      And I click login button
      And I click continue with facebook button
      Then I login successfully
