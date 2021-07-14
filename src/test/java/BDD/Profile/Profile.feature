@Profile
Feature: Profile

  @Notification
  Scenario: User Use Notification Feature
    Given I am user
    When I want to use notification
    And I click profile
    And I click notification button
    Then I use notification successfully

  @KickCredit
  Scenario: User Use Kick Credit Feature
    Given I am user
    When I want to use kick credit
    And I click profile
    And I click kick credit
    And I click wallet logs
    And I click pending cash out
    And I click pending top up
    Then I use kick credit successfully

  @KickCreditTopUpBca
  Scenario: User Top Up Kick Credit with BCA
    Given I am user
    When I want to use kick credit
    And I click profile
    And I click kick credit
    And I click top up
    And I input amount top up kick credit "200000"
    And I click continue top up kick credit
    And I choose payment bca top up kick credit
    And I click continue your payment
    Then I use top up successfully

  @KickCreditCashOut
  Scenario: User Cash Out Kick Credit
    Given I am user
    When I want to use kick credit
    And I click profile
    And I click kick credit
    And I click cash out
    And I input amount cash out kick credit "200000"
    And I click continue cash out kick credit
    And I click confirm cash out
    And I input password cash out "kickavenue1745"
    And I click submit cash out
    And I close pop up success cash out
    Then I use cash out successfully

  @SellerCredit
  Scenario: User Use Seller Credit Feature
    Given I am user
    When I want to use seller credit
    And I click profile
    And I click seller credit
    Then I use seller credit successfully

  @SellerCreditInfo
  Scenario: User Use Seller Credit Info Feature
    Given I am user
    When I want to use seller credit
    And I click profile
    And I click seller credit info
    Then I use seller credit successfully

  @KickReward
  Scenario: User Use Kick Reward Feature
    Given I am user
    When I want to use kick reward
    And I click profile
    And I click kick reward
    And I click kick reward history
    Then I use kick reward successfully

  @InviteAFriend
  Scenario: User Use Invite A Friend Feature
    Given I am user
    When I want to use invite a friend
    And I click profile
    And I click invite a friend
    And I click copy referral code
    And I click how to use invite a friend
    And I click invite a friend button
    Then I use invite a friend successfully

  @Buying
  Scenario: User Use Buying Feature
    Given I am user
    When I want to use buying
    And I click profile
    And I click buying
    And I click offers
    And I click pending
    And I click in progress
    And I click history buying
    Then I use buying successfully

  @Selling
  Scenario: User Use Selling Feature
    Given I am user
    When I want to use selling
    And I click profile
    And I click selling
    And I click add selling
    And I click holiday mode
    And I click in progress selling
    And I click history selling
    And I click current selling
    Then I use selling successfully

  @MyVoucher
  Scenario: User Use My Voucher Feature
    Given I am user
    When I want to use my voucher
    And I click profile
    And I click my voucher
    And I click history my voucher
    And I click active my voucher
    And I select my voucher code
    And I click copy my voucher code
    Then I use my voucher successfully

  @Wishlist
  Scenario: User Use Wishlist Feature
    Given I am user
    When I want to use wishlist
    And I click market
    And I click sneakers checkout
    And I click search sneakers market
    And I input "adidas nmd r1"
    And I click result found sneakers checkout
    And I select product sneakers
    And I click wishlist product
    And I select size withlist
    And I click back to search

    And I click profile
    And I click wishlist
    And I click street wear wishlist
    And I click luxury wishlist
    And I click lifestyle wishlist
    And I click sneakers wishlist
    And I select wishlist product
    And I click delete wishlist product
    Then I use wishlist successfully

  @HelpCenter
  Scenario: User Use Help Center Feature
    Given I am user
    When I want to use help center
    And I click profile
    And I click help center
    And I click faq
    And I click panduan pembayaran
    And I click terms and conditions
    And I click  privacy policy
    And I click contact us
    Then I use help center successfully

  @ProfileSettings
  Scenario: User Use Profile Settings Feature
    Given I am user
    When I want to use profile settings
    And I click profile
    And I click profile settings
    And I click edit personal profile
    And I click edit shipping info
    And I click edit user location
    And I click edit payout info
    And I click edit notification references
    Then I use profile settings successfully

  @ChangePassword
  Scenario: User Use Change Password Feature
    Given I am user
    When I want to use change password
    And I click profile
    And I click profile settings
    And I click change password
    And I input old password "kickavenue1745"
    And I input new password "kickavenue1746"
    And I input confirm new password "kickavenue1746"
    And I click save changes
    Then I use change password successfully

  @ChangePassword2
  Scenario: User Use Change Password Feature
    Given I am user
    When I want to use change password
    And I click profile
    And I click profile settings
    And I click change password
    And I input old password "kickavenue1746"
    And I input new password "kickavenue1745"
    And I input confirm new password "kickavenue1745"
    And I click save changes
    Then I use change password successfully