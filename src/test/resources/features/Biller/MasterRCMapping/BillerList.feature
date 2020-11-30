@regression
@BillerList
Feature: Biller List
  As Data Team
  We need to know Biller Name and Please make Biller Name also Description Biller are editable for BI Dashboard needed
  So we can provide insights for management and other stakeholders regarding the profile and performance of billers.

  Background: Login Success (As Admin)
    Given User open sentinel login page
    When User input kraken as username and input password
    Then User can see sentinel dashboard

#  @TestCaseKey=BPA-T3012
#  Scenario: Add New Biller Success
#    Given Already on Biller List page
#    When Write biller name, biller label, and biller description for success
#    Then data was added successfully
#
#  @TestCaseKey=BPA-T3013
#  Scenario: Add New Biller Success (Biller Name Empty)
#    Given Already on Biller List page
#    When Write biller name, biller label, and biller description for empty name
#    Then data was empty name added successfully
#
#  @TestCaseKey=BPA-T3014
#  Scenario: Add New Biller Failed (Biller Label already exist)
#    Given Already on Biller List page
#    When Write biller name, biller label, and biller description for failed
#    Then data was not added successfully
#
#  @TestCaseKey=BPA-T3015
#  Scenario: Update Biller Name Success
#    Given Already on Biller List page
#    When Write biller name, biller label, and biller description for update name success
#    Then data name change was added successfully
#
#  @TestCaseKey=BPA-T3016
#  Scenario: Update Biller Name Success (Biller Name Empty)
#    Given Already on Biller List page
#    When Write biller name, biller label, and biller description for update empty name success
#    Then data empty name change was added successfully
#
#  @TestCaseKey=BPA-T3017
#  Scenario: Update Biller Desc Success
#    Given Already on Biller List page
#    When Write biller name, biller label, and biller description for update desc success
#    Then data desc change was added successfully

  @TestCaseKey=BPA-T3018
  Scenario: Update Biller Desc Success (Biller Desc Empty)
    Given Already on Biller List page
    When Write biller name, biller label, and biller description for update empty desc success
    Then data empty desc change was added successfully