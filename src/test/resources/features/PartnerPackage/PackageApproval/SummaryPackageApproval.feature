Feature: SummaryPackageApproval
  As a user
  I want to get summary on the package approval
  So that I can work more efficient in doing package approval

  Background: Login
    Given User open sentinel login page
    When User input setio as username and input password

  @TestCaseKey=BPA-mmm
  Scenario: Check summary package approval after doing bulk update using user Setio
    Given on package tab on partner package sub menu
    When user click Bulk Update Product-Package
    And user enter the CSV file
    And click OK
    Then bulk change request are waiting for approval