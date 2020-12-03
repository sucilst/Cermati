@BulkUpdatePackage
Feature: Bulk Package
  As a user
  I want to package the product
  So that partner can choose package

  Background: Login Success (As Admin)
    Given User open sentinel login page
    When User input kraken as username and input password
    Then User can see sentinel dashboard

  Scenario: Bulk Update Package Success
    Given Already on Partner-Package page
    When Click Package
    And Click Bulk Update Product-Package
    And Choose file in CSV File Coloumn for Success
    And Click OK button
    And Clik Cancel button for permission
    Then Package updated successfully

  Scenario: Bulk Update Package Failed
    Given Already on Partner-Package page
    When Click Package
    And Click Bulk Update Product-Package
    And Choose file in CSV File Coloumn for Failed
    And Click OK button
    And Clik Cancel button for permission
    Then Package updated successfully