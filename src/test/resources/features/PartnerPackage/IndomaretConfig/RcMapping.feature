Feature: Add RC Mapping
  As an user
  I want to add rc mapping config
  So that i can check configuration rc indomaret

  Background: Login
    Given User open sentinel login page
    When User input febri as username and input password

  @TestCaseKey=BPAS-T412
  Scenario: [Indomaret Configuration] Add Response Code Config - Success
    Given user in indomaret configuration page
    When Add Response Code Mapping
    And fill all mandatory field
    And save added rc mapping
    Then showing pop up Success Save Indomaret Configuration

  @TestCaseKey=BPAS-T413
 Scenario: [Indomaret Configuration] Add Response Code Config Failed - empty field mandatory
    Given user in indomaret configuration page
    When Add Response Code Mapping
    And save added rc mapping
    Then showing pop up Please Fill All Form

  @TestCaseKey=BPAS-T414
  Scenario: [Indomaret Configuration] Remove Response Code Mapping
    Given user in indomaret configuration page
    When Remove Response Code Mapping
    And save removed rc mapping
    Then showing pop up Success Save Indomaret Configuration
