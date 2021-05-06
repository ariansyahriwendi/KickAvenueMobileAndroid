@ForgotPassword
Feature: Forgot Password

  @ForgotPasswordSuccess
  Scenario: Guest User Click Forgot Password
    Given I am guest user
    When I want to use forgot password
    And I click profile
    And I click login button
    And I click forgot password link
    And I input email forgot password "ariansyahriwendi@gmail.com"
    And I click reset password button
    Then I forgot password successfully