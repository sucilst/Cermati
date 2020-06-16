Feature: Package
  As a user
  I want to package the product
  So that partner can choose package

  Background: Login
    Given User open sentinel login page
    When User input febri as username and input password

  Scenario: search package to edit package
    Given on package tab on partner package sub menu
    When user search existing package, the packaged is Package Test 1 Partner
    Then user gets package based on search box that is Package Test 1 Partner

  @TestCaseKey=BPAS-T157
  Scenario: Search box display must be the same as the acceptance criteria that have been written in the description box
    Given on partner package sub menu
    When user click package tab
    Then user gets display of the search box

  @TestCaseKey=BPAS-T158
  Scenario: search package by ID
    Given on package tab on partner package sub menu
    When user fill 14 on search box
    Then user gets 14 on the list

  @TestCaseKey=BPAS-T159
  Scenario: Search Package By Name
    Given on package tab on partner package sub menu
    When user fill Package Test 1 Partner on search box
    Then user gets Package Test 1 Partner on the list