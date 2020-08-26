Feature: SummaryPackageApproval
  As a user
  I want to get summary on the package approval
  So that I can work more efficient in doing package approval

  Background: Login
    Given User open sentinel login page
    When User input setio as username and input password

  @TestCaseKey=BPA-T2361
  Scenario: Check summary package approval after doing bulk update using user Setio
    Given on package tab on partner package sub menu
    When user clicks Package Approval
    Then user can see Change Request Summary section